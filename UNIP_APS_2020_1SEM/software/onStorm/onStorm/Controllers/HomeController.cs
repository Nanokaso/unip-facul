using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using onStorm.Models;
using Microsoft.AspNetCore.Http;

namespace onStorm.Controllers
{
    public class HomeController : Controller
    {
        //https://portal.vidadesilicio.com.br/lm35-medindo-temperatura-com-arduino/
        public IActionResult Index ()
        {
            return View();
        }

        public const string dataformato = "dd/MM/yyyy";
        public const string horaformato = "HH:mm";

        public IActionResult Privacy ()
        {
            return View();
        }

        [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
        public IActionResult Error ()
        {
            return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
        }

        [HttpGet]
        public JsonResult GetLocais ()
        {
            try
            {
                var banco = new BancoJson();
                var dispositivos = banco.buscarDispositivos();

                var imgbr = "img/dot green.png";
                var img = "img/dot grey.png";
                return Json(new
                {
                    status = 0,
                    lista = dispositivos.Select(x => new
                    {
                        id = x.IdDispositivo,
                        nome = x.Nome,
                        lat = x.Local.Split('_')[0],
                        lon = x.Local.Split('_')[1],
                        img = (x.Nome.Contains(" BRA") ? imgbr : img)
                    }),
                    message = ""
                });

            }
            catch( Exception ex )
            {
                return Json(new
                {
                    status = 500,
                    message = ex.Message
                });
            }
        }


        [HttpGet]
        public JsonResult GetEstatisticas (string id)
        {
            try
            {
                int dias = 10;

                var banco = new BancoJson();

                List < DispositivoModel > l = new List<DispositivoModel>();
                if( !string.IsNullOrWhiteSpace(id) )
                {
                    var a = banco.buscarDispositivos(id);
                    if( a != null )
                    {
                        l.Add(a);
                    }
                }
                else
                { l = banco.buscarDispositivos(); }


                List<dynamic> listagem = new List<dynamic>();

                if( l != null && l.Count > 0 )
                {
                    // ordena por pais
                    foreach( var dispo in l.OrderBy(x => x.Pais).OrderBy(x => x.Nome) )
                    {
                        List<dynamic> listaDias = new List<dynamic>();

                        var gruposDia = dispo.Registros.GroupBy(x=>x.Data.ToString(dataformato));

                        foreach( var grupodia in gruposDia )
                        {

                            var mediaTemperatura = grupodia.Sum(x=>x.Temperatura)/grupodia.Count();
                            var mediaChuva = grupodia.Sum(x=>x.Chuva)/grupodia.Count();
                            var mediaUmidade = grupodia.Sum(x=>x.Umidade)/grupodia.Count();

                            var maximaTemperatura = grupodia.OrderBy(x=>x.Temperatura).First().Temperatura;
                            var minimaTemperatura = grupodia.OrderByDescending(x=>x.Temperatura).First().Temperatura;

                            List<dynamic> horasRegistros = new List<dynamic>();
                            foreach( var registro in grupodia.OrderBy(x=>x.Data) )
                            {
                                var temperatura = registro.Temperatura;
                                var chuva = registro.Chuva;
                                var umidade = registro.Umidade;
                                var hora = registro.Data.ToString(horaformato);
                               
                                horasRegistros.Add(new {
                                    hora,
                                    temperatura,
                                    umidade,
                                    chuva
                                });
                            }

                            listaDias.Add(new {
                                mediaTemperatura,
                                mediaChuva,
                                mediaUmidade,
                                maximaTemperatura,
                                minimaTemperatura,
                                data = grupodia.First().Data.ToString(dataformato),
                                horasRegistros,
                            });
                        }

                        var disposi = new
                        {
                            nome = dispo.Nome,
                            lat = dispo.Local.Split('_')[0],
                            lon = dispo.Local.Split('_')[1],
                            resumoDias = listaDias
                        };

                        listagem.Add(disposi);
                    }
                }

                return Json(new
                {
                    status = 0,
                    listagem,
                    message = ""
                });

            }
            catch( Exception ex )
            {
                return Json(new
                {
                    status = 500,
                    message = ex.Message
                });
            }
        }

        [HttpGet]
        public JsonResult AtualizarLocais ()
        {
            try
            {
                dataBasic.incluirDispositivosJson();
                return Json(new
                {
                    status = 0,
                    message = ""
                });

            }
            catch( Exception ex )
            {
                return Json(new
                {
                    status = 500,
                    message = ex.Message
                });
            }
        }

    }
}
