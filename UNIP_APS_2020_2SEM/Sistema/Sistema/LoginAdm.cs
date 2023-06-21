using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Sistema
{
    public partial class LoginAdm : Form
    {
        public LoginAdm()
        {
            InitializeComponent();
        }

        private void pnlGeral_Paint(object sender, PaintEventArgs e)
        {

        }

        private void lblLogin_Click(object sender, EventArgs e)
        {
            Login c = null;
            c = new Login();
            c.Show();
            Close();
        }


        private void btnContinuar_Click(object sender, EventArgs e)
        {
            try
            {
                if (txtUser.Text == "adm" && txtSenha.Text == "adm123@")
                {
                    UsuarioTO u = new UsuarioTO();
                    u.Nome = "Adm";
                    u.Perfil = 3;
                    Home h = new Home(u);
                    h.Show();                    
                    Close();
                }
            }
            catch { }
        }
    }
}
