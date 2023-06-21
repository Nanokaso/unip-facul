using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using onStorm.Models;
using Microsoft.AspNetCore.Http;

namespace onStorm.Controllers
{
    public class AdmController : Controller
    {

        public ActionResult Index ()
        {
            ViewBag.mensagemLogin = null;

            if( HttpContext.Session.GetString("usuario") != null )
            {
                return RedirectToAction("Index", "Dashboard");
            }
            else
            { return View(); }
        }

        [HttpPost]
        public ActionResult Index (loginModel model)
        {
            try
            {
                if( !ModelState.IsValid )
                {
                    throw new Exception("Dados inválidos!");
                }

                if( string.IsNullOrWhiteSpace(model.username) || string.IsNullOrWhiteSpace(model.username) )
                { throw new Exception("Dados inválidos!"); }

                if( model.username == "adm" && model.password == "123456" )
                {
                    HttpContext.Session.SetString("usuario", "Administrador");
                    return RedirectToAction("Index", "Dashboard");
                }
                else
                { throw new Exception("Usuario ou senha incorretos!"); }

            }
            catch( Exception ex )
            {
                ViewBag.mensagemLogin = ex.Message;
                return View();
            }
        }
    }
}