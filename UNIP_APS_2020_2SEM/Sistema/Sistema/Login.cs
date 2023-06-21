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
    public partial class Login : Form
    {
        public Login()
        {
            InitializeComponent();
            btnContinuar.Enabled = false;
        }

        public Login(string caminho)
        {
            InitializeComponent();
            carregarCaminho(caminho);
        }

        string caminho { get; set; }
        bool isClickButton { get; set; }
        private void lblCadastrar_Click(object sender, EventArgs e)
        {
            LoginAdm c = new LoginAdm();
            c.Show();
            isClickButton = true;
            Close();
        }

        private void Login_Load(object sender, EventArgs e)
        { }

        private void btnUpload_Click(object sender, EventArgs e)
        {
            btnContinuar.Enabled = false;
            try
            {
                var caminho = UsuarioDAO.capturarImagem();

                carregarCaminho(caminho);
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }
        private void carregarCaminho(string caminho)
        {
            if (!string.IsNullOrWhiteSpace(caminho))
            {
                picImage.Image = Image.FromFile(caminho);
                btnContinuar.Enabled = true;
                this.caminho = caminho;
            }
        }
        private void btnContinuar_Click(object sender, EventArgs e)
        {
            try
            {
                if (!string.IsNullOrEmpty(caminho))
                {
                    var u = UsuarioDAO.Logar(caminho);
                    if (u != null)
                    {
                        Home h = new Home(u);
                        h.Show();
                        isClickButton = true;
                        Close();
                    }
                }
                else
                {
                    throw new Exception("Escolha uma imagem para continuar!");
                }
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }

        private void Login_FormClosing(object sender, FormClosingEventArgs e)
        {
            if (!isClickButton)
            {
                Application.Exit();
            }
        }
    }
}
