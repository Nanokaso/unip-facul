using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;

namespace onStorm.Controllers
{
    public class DashboardController : Controller
    {
        public ActionResult Index ()
        {            
            return View();
        }


        [HttpGet]
        public ActionResult Sair ()
        {
            try
            {
                HttpContext.Session.Clear();
                return RedirectToAction("Index", "Home");                
            }
            catch( Exception ex )
            { }
            return View();
        }
    }
}