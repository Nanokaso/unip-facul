using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Threading.Tasks;
using static onStorm.utils;

namespace onStorm
{
    public class dispositivoModel
    {
        public dispositivoModel () { }
        public dispositivoModel (arquivo arq)
        {
            if( arq != null && arq.linhas != null && arq.linhas.Count() > 0 )
            {
                var props = this.GetType().GetProperties();
                foreach( var larq in arq.linhas )
                {
                    foreach( var prop in props )
                    {
                        if( (prop.Name + prop.PropertyType.Name) == larq.key )
                        {
                            prop.SetValue(this, Convert.ChangeType(larq.value, prop.PropertyType), null);
                        }
                    }
                }
            }
        }

        public string idDisp { get; set; } = "";
        public string nome { get; set; } = "";
        public string local { get; set; } = "";

        public arquivo ToArquivo ()
        {
            arquivo arq = new arquivo()
            { linhas = new List<arquivo>() };

            var something = this.GetType().GetProperties();
            foreach( var item in something )
            {
                arq.linhas.Add(new arquivo(
                    item.Name + item.PropertyType.Name,
                    item.GetValue(this, null).ToString()
                ));
            }

            return arq;
        }
    }
    public class registroModel
    {
        public registroModel () { }
        public registroModel (arquivo arq)
        {
            if( arq != null && arq.linhas != null && arq.linhas.Count() > 0 )
            {
                var props = this.GetType().GetProperties();
                foreach( var larq in arq.linhas )
                {
                    foreach( var prop in props )
                    {
                        if( prop.Name != "dispositivo" )
                        {
                            if( (prop.Name + prop.PropertyType.Name) == larq.key )
                            {
                                prop.SetValue(this, Convert.ChangeType(larq.value, prop.PropertyType), null);
                            }
                        }
                    }
                }
            }
        }

        public string id { get; set; } = "";
        public DateTime data { get; set; } = new DateTime();
        public int temperatura { get; set; } = 0;
        public int chuva { get; set; } = 0;
        public string idDisp { get; set; } = "";
        public dispositivoModel dispositivo { get; set; } = new dispositivoModel();
        public arquivo ToArquivo ()
        {
            arquivo arq = new arquivo()
            { linhas = new List<arquivo>() };

            var something = this.GetType().GetProperties();
            foreach( var item in something )
            {
                if( item.Name != "dispositivo" )
                {
                    arq.linhas.Add(new arquivo(
                        item.Name + item.PropertyType.Name,
                        item.GetValue(this, null).ToString()
                    ));
                }
            }

            return arq;
        }
    }

    public class arquivo
    {
        public arquivo () { }
        public arquivo (string k, string v)
        { key = k; value = v; }
        public string key { get; set; }
        public string value { get; set; }

        public List<arquivo> linhas { get; set; }
    }

    public class Banco
    {
        private  string pastaRegistro ="";
        private  string pastaDispositivo ="";
        public Banco ()
        {

            var rootpath = Path.Combine(Directory.GetCurrentDirectory(),"Banco"); //utils.Folder.AppDataFolder();
            pastaRegistro = Path.Combine(rootpath, "REG");
            pastaDispositivo = Path.Combine(rootpath, "DIS");
            Directory.CreateDirectory(pastaRegistro);
            Directory.CreateDirectory(pastaDispositivo);
        }

        private  char sepLinha = 'º';
        private  char sepkey= '°';
        private  string extensao = ".onstormdb";


        public void incluirDispositivo (dispositivoModel dispositivo)
        {
            try
            {
                var dispositivos = GetDispositivos();
                if( dispositivos == null || !dispositivos.Where(x => x.idDisp == dispositivo.idDisp).Any() )
                {
                    escrever(pastaDispositivo, dispositivo.ToArquivo());
                }
            }
            catch( Exception ex )
            {
                throw new Exception("Não foi possivel salvar novo dispositivo", ex);
            }
        }

        public void incluirRegistro (string idDisp, int chuva, int temperatura)
        {
            try
            {
                var dispositivos = GetDispositivos();
                if( dispositivos != null && dispositivos.Where(x => x.idDisp == idDisp).Any() )
                {
                    registroModel re = new registroModel()
                    {
                        idDisp = idDisp,
                        chuva = chuva,
                        temperatura = temperatura,
                        data = DateTime.Now,
                        id = getGuid(),
                    };
                    escrever(pastaRegistro, re.ToArquivo());
                }
            }
            catch( Exception ex )
            {
                throw new Exception("Não foi possivel salvar novo dispositivo", ex);
            }
        }

        public void incluirRegistro (List<registroModel> registros)
        {
            try
            {
                var dispositivos = GetDispositivos();
                foreach( var reg in registros )
                {
                    if( dispositivos != null && dispositivos.Where(x => x.idDisp == reg.idDisp).Any() )
                    {
                        reg.id = getGuid();                       
                        escrever(pastaRegistro, reg.ToArquivo());
                    }
                }
            }
            catch( Exception ex )
            {
                throw new Exception("Não foi possivel salvar novo dispositivo", ex);
            }
        }

        public List<dispositivoModel> GetDispositivos ()
        {
            List<dispositivoModel> dispositivos = new List<dispositivoModel>();
            try
            {
                dispositivos = ler(pastaDispositivo).Select(x => new dispositivoModel(x)).ToList();
            }
            catch { }
            return dispositivos;
        }

        public List<registroModel> GetRegistros ()
        {
            List<registroModel> registros = new List<registroModel>();
            try
            {
                registros = ler(pastaRegistro).Select(x => new registroModel(x)).ToList();

                try
                {
                    var dispositivos = GetDispositivos();
                    foreach( var reg in registros )
                    {
                        if( dispositivos != null && dispositivos.Where(x => x.idDisp == reg.idDisp).Any() )
                        {
                            reg.dispositivo = dispositivos.Where(x => x.idDisp == reg.idDisp).FirstOrDefault();
                        }
                    }
                }
                catch { }

            }
            catch { }
            return registros;
        }

        public string getGuid ()
        {
            return Guid.NewGuid().ToString().Replace("-", "");
        }

        // banco interno arquivos
        private List<arquivo> ler (string pasta)
        {
            List <arquivo> dados = new List<arquivo>();
            try
            {
                foreach( string file in Directory.EnumerateFiles(pasta, "*" + extensao) )
                {
                    try
                    {
                        arquivo arq = new arquivo();
                        arq.linhas = new List<arquivo>();

                        string conteudo = File.ReadAllText(file);
                        var registros = conteudo.Split(sepLinha);
                        foreach( var reg in registros )
                        {
                            var regs = reg.Split(sepkey);
                            arq.linhas.Add(new arquivo() { key = regs[0], value = regs[1] });
                        }
                        dados.Add(arq);
                    }
                    catch { }
                }
            }
            catch { }

            return dados;
        }

        private void escrever (string pasta, List<arquivo> dados)
        {

            if( dados != null && dados.Count > 0 )
            {
                foreach( var arquivo in dados )
                {
                    if( arquivo.linhas != null && arquivo.linhas.Count > 0 )
                    {
                        string nome = Guid.NewGuid().ToString().Replace("-","");
                        string linha = string.Join(sepLinha, arquivo.linhas.Select(x=>x.key + sepkey + x.value));
                        File.WriteAllText(Path.Combine(pasta, nome + extensao), linha);
                    }
                }
            }
        }

        private void escrever (string pasta, arquivo dado)
        {
            escrever(pasta, new List<arquivo>() { dado });
        }

    }

}
