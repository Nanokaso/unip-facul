using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Sistema
{
    public class UsuarioTO
    {
        public string Nome { get; set; }
        public int Perfil { get; set; }

        public string PerfilNome
        {
            get
            {
                string tipo = "";
                if (Perfil == 1)
                { tipo = "Funcionario(a)"; }
                if (Perfil == 2)
                { tipo = "Diretor(a)"; }
                if (Perfil == 3)
                { tipo = "Ministro(a)"; }
                return tipo;
            }
        }
    }
}
