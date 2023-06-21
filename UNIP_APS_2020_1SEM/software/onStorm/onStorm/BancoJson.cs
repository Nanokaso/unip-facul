using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Threading.Tasks;
using Newtonsoft.Json;

namespace onStorm
{
    public class DispositivoModel
    {
        public string IdDispositivo { get; set; }
        public string Nome { get; set; }
        public string Pais { get; set; }
        public string Local { get; set; }
        public List<DispositivoRegistroModel> Registros { get; set; }
    }

    public class DispositivoRegistroModel
    {
        public string IdRegistro { get; set; }
        public DateTime Data { get; set; }
        public int Temperatura { get; set; }
        public int Chuva { get; set; }
        public int Umidade { get; set; }
    }
    
    public class BancoJson
    {
        private  string extensao = ".jsondb";
        private  string pastaData ="";
        public BancoJson ()
        {
            var rootpath = Path.Combine(Directory.GetCurrentDirectory(),"BancoJson");
            pastaData = Path.Combine(rootpath, "DATA");
            Directory.CreateDirectory(pastaData);
        }

        public string getGuid ()
        {
            return Guid.NewGuid().ToString().Replace("-", "");
        }

        public void escreverRegistro (string idDispositivo, DispositivoRegistroModel reg)
        {
            if( buscarDispositivos(idDispositivo) != null )
            {
                var d = buscarDispositivos(idDispositivo);

                if( d.Registros == null )
                { d.Registros = new List<DispositivoRegistroModel>(); }

                d.Registros.Add(reg);

                incluirDispisitivo(d);
            }
        }

        /// <summary> Cuidado! sobrepoe </summary>        
        public void incluirDispisitivo (DispositivoModel model)
        {
            if( model != null )
            {
                if( string.IsNullOrWhiteSpace(model.IdDispositivo) )
                { model.IdDispositivo = getGuid(); }


                if( model.Registros != null )
                {
                    foreach( var i in model.Registros )
                    {
                        if( string.IsNullOrWhiteSpace(i.IdRegistro) )
                        { i.IdRegistro = getGuid(); }
                    }
                }

                var json = JsonConvert.SerializeObject(model);

                File.WriteAllText(Path.Combine(pastaData, model.IdDispositivo + extensao), json);
            }
        }

        public DispositivoModel buscarDispositivos (string id)
        {
            DispositivoModel model = null;

            try
            {
                string p = Path.Combine(pastaData, id + extensao);
                if( File.Exists(p) )
                {
                    string conteudo = File.ReadAllText(p);
                    model = JsonConvert.DeserializeObject<DispositivoModel>(conteudo);
                }
            }
            catch { }

            return model;
        }

        public List<DispositivoModel> buscarDispositivos ()
        {
            List <DispositivoModel> lista = new List<DispositivoModel>();

            try
            {
                foreach( string file in Directory.EnumerateFiles(pastaData, "*" + extensao) )
                {
                    try
                    {
                        var model = buscarDispositivos(file.Replace(extensao,""));
                        if( model != null )
                        { lista.Add(model); }
                    }
                    catch { }
                }
            }
            catch { }

            return lista;

        }

    }
}
