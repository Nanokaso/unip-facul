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
    public partial class Cadastro : Form
    {
        public Cadastro()
        {
            InitializeComponent();
        }
        string caminho { get; set; }
        private void lblLogin_Click(object sender, EventArgs e)
        {
            Login c = null;
            if (!string.IsNullOrEmpty(caminho))
            { c = new Login(caminho); }
            else
            { c = new Login(); }
            c.Show();
            this.Close();
        }

        private void Cadastro_FormClosing(object sender, FormClosingEventArgs e)
        { }

        private void Cadastro_Load(object sender, EventArgs e)
        {
            btnContinuar.Enabled = false;
        }

        private void btnUpload_Click(object sender, EventArgs e)
        {
            btnContinuar.Enabled = false;
            try
            {
                var caminho = UsuarioDAO.capturarImagem();

                if (!string.IsNullOrWhiteSpace(caminho))
                {
                    picImage.Image = Image.FromFile(caminho);
                    btnContinuar.Enabled = true;
                    this.caminho = caminho;
                }
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }

        private void btnContinuar_Click(object sender, EventArgs e)
        {
            try
            {
                if (string.IsNullOrWhiteSpace(txtNome.Text))
                { throw new Exception("Escreva um nome !"); }

                int numeroPerfil = 0;
                try
                {
                    numeroPerfil = Convert.ToInt32(txtPerfil.Text);
                    if (numeroPerfil <= 0 || numeroPerfil > 3)
                    { throw new Exception(""); }
                }
                catch
                {
                    throw new Exception("Escolha um perfil válido! \n 1- Normal \n 2- Diretor \n 3- Ministro");
                }

                if (!string.IsNullOrEmpty(caminho))
                {
                    UsuarioDAO.Cadastrar(caminho, txtNome.Text, numeroPerfil);
                    MessageBox.Show("Cadastro efetuado com sucesso!");
                    //this.Close();
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
    }
}
