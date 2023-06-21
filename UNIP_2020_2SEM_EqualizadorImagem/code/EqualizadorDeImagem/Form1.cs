using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Diagnostics;
using System.Drawing;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace EqualizadorDeImagem
{
    public partial class Form1 : Form
    {
        const int tamanhoArray = 20;

        public Form1()
        {
            InitializeComponent();
        }
        private void Form1_Load(object sender, EventArgs e)
        {
            this.FormBorderStyle = FormBorderStyle.FixedSingle;
            ShowHidePainel(0);
            btnVetorResetar_Click(sender, e);
        }

        #region Metodo Designs

        private void btnImagem_Click(object sender, EventArgs e)
        {
            ShowHidePainel(1);
            btnVetorResetar_Click(sender, e);
        }

        private void btnVetor_Click(object sender, EventArgs e)
        {
            ShowHidePainel(2);
            btnVetorResetar_Click(sender, e);
        }

        public void ShowHidePainel(int tipo = 0)
        {
            pnlImagem.Dock = DockStyle.Fill;
            pnlVetor.Dock = DockStyle.Fill;

            pnlImagem.Visible = false;
            pnlVetor.Visible = false;

            // imagem
            if (tipo == 1)
                pnlImagem.Visible = true;

            // vetor
            if (tipo == 2)
                pnlVetor.Visible = true;
        }       
        #endregion

        #region Vetor
        private void btnVetorResetar_Click(object sender, EventArgs e)
        {
            int quantidade = tamanhoArray;

            Random random = new Random();

            List<int> lsitadenumeros = new List<int>();
            for (int i = 0; i < quantidade; i++)
                lsitadenumeros.Add(0);

            txtVetorEntrada.Text = String.Join("-", lsitadenumeros);
            txtVetorSaida.Text = "";

        }
        private void btnVetorAutoPreencher_Click(object sender, EventArgs e)
        {
            int quantidade = tamanhoArray;

            Random random = new Random();

            List<int> lsitadenumeros = new List<int>();
            for (int i = 0; i < quantidade; i++)
                lsitadenumeros.Add(random.Next(0, 255));

            txtVetorEntrada.Text = String.Join("-", lsitadenumeros);
        }
        private void btnVetorConfirmar_Click(object sender, EventArgs e)
        {
            try
            {
                string valor = txtVetorEntrada.Text;
                if (!Utils.TextoContemSomenteNumeros(valor, new List<string>() { "-", " " }))
                    throw new Exception("Texto inválido ou incorreto! Verifique os valores novamente!");
                List<int> valores = valor.Split('-').Select(x => Convert.ToInt32(x)).ToList();
                List<int> valoresEqualizados = ExercicioProfessor.Equalizar(valores);
                txtVetorSaida.Text = String.Join("-", valoresEqualizados);
            }
            catch (Exception ex)
            {
                MessageBox.Show("Não foi possivel equalizar: " + ex.Message);
            }
        }

        #endregion

        #region Imagem
        private void btnEscolherImagem_Click(object sender, EventArgs e)
        {
            try
            {
                OpenFileDialog open = new OpenFileDialog();
                open.Filter = "Arquivos de Imagem (*.jpg) | *.jpg";

                if (open.ShowDialog() == DialogResult.OK)
                {
                    string imagemCaminho = open.FileName;
                    ExercicioNataly.Equalizar(imagemCaminho);
                }
            }
            catch (Exception ex)
            {
                MessageBox.Show("Não foi possivel equalizar: " + ex.Message);
            }
        }
        #endregion

        private void btnExemploProf_Click(object sender, EventArgs e)
        {
            var listinha = new List<int>()
            {  0, 0, 4, 6, 8, 8, 4, 7, 8, 9, 9, 4, 3, 2, 3, 8, 2, 2, 1, 0};

            txtVetorEntrada.Text = String.Join("-", listinha);
            txtVetorSaida.Text = "";
        }
    }
}
