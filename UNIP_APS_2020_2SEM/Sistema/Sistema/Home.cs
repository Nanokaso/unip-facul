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
    public partial class Home : Form
    {
        UsuarioTO usuario { get; set; }
        public Home(UsuarioTO usuarioT)
        {
            InitializeComponent();

            usuario = usuarioT;
        }

        private void Home_FormClosing(object sender, FormClosingEventArgs e)
        {
            Login c = new Login();
            c.Show();
        }

        private void Home_Load(object sender, EventArgs e)
        {
            lblNome.Text = "Bem Vindo!    " + usuario.PerfilNome + "   -   " + usuario.Nome;
            
            pn1.Visible = false;
            pn2.Visible = false;
            pn3.Visible = false;
            lblCadastrar.Visible = false;

            if (usuario.Perfil == 1)
            {
                pn1.Visible = true;                
            }
            if (usuario.Perfil == 2)
            {
                pn1.Visible = true;
                pn2.Visible = true;                
            }
            if (usuario.Perfil == 3)
            {
                pn1.Visible = true;
                pn2.Visible = true;
                pn3.Visible = true;
                lblCadastrar.Visible = true;
            }
        }      

        private void lblCadastrar_Click(object sender, EventArgs e)
        {
            Cadastro c = new Cadastro();
            c.Show();
        }
    }
}
