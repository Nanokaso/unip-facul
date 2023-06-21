using Mundo;
using Brasil.Unip.Anchieta;
using Brasil.Unip.Anchieta.Alunos;

namespace EqualizadorDeImagem.CapaTrabalho
{
    public class IdentificacaoAluno
    {
        public EnMateria Materia = Materia.PI;
        public string Turma = "CC6P39";
        public string Nome = "Nataly Noria Karol Sousa Goncalves";
        public string RA = "N3336A7";
        public string LinkGitHub = "https://github.com/Nanokaso/EqualizadorImagem2020";
    }
}

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace EqualizadorDeImagem
{
    public class ExercicioProfessor
    {
        public static void MainFake()
        {
            var resultado = Equalizar(new List<int>()
            {  0, 0, 4, 6, 8, 8, 4, 7, 8, 9, 9, 4, 3, 2, 3, 8, 2, 2, 1, 0});            
        }

        public static List<int> Equalizar(List<int> valores)
        {           
            var N = valores.Count;

            var L = 0;

            List<int> contagem = new List<int>();
            for (int i = 0; i < valores.Count; i++)
            {
                if (!contagem.Contains(valores[i]))
                    contagem.Add(valores[i]);

                if (contagem.Count > 0)
                    L = contagem.OrderByDescending(x => x).First() + 1;
            }

            List<int> Hk = new List<int>();
            for (int i = 0; i < 256; i++) { Hk.Add(0); }
           
            for (int i = 0; i < valores.Count; i++)
            {               
                for (int lugark = 0; lugark < Hk.Count; lugark++)
                {
                    if (valores[i] == lugark)
                    {                        
                        Hk[lugark] = Hk[lugark] + 1;
                    }
                }
            }

            List<int> HaK = new List<int>();
            for (int i = 0; i < 256; i++) { HaK.Add(0); }
                       
            for (int lugark = 0; lugark < HaK.Count; lugark++)
            {
                if (lugark == 0)
                    HaK[0] = Hk[0];

                if (lugark > 0)
                    HaK[lugark] = HaK[lugark - 1] + Hk[lugark];
            }

            List<decimal> Pk = new List<decimal>();
            for (int i = 0; i < 256; i++) { Pk.Add(0); }

            for (int i = 0; i < Pk.Count; i++)
            {
                int valorlugar = HaK[i];
                decimal valorzinho = Convert.ToDecimal(valorlugar) / Convert.ToDecimal(N);
                Pk[i] = valorzinho;
            }

            List<int> k2 = new List<int>();
            for (int i = 0; i < 256; i++) { k2.Add(0); }

            for (int i = 0; i < k2.Count; i++)
            {
                int aa = (L - 1);
                var resultadoMulti = aa * Pk[i];
                var item = Math.Round(resultadoMulti, MidpointRounding.ToEven);
                k2[i] = Convert.ToInt32(item);
            }

            List<int> g = new List<int>();
            for (int i = 0; i < valores.Count; i++) { g.Add(0); }

            for (int i = 0; i < valores.Count; i++)
            {
                for (int ij = 0; ij < k2.Count; ij++)
                {
                    int item = valores[i];
                    if (item == ij)
                    {
                        g[i] = k2[ij];
                    }
                }
            }

            return g;
        }
    }
}

using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Drawing;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace EqualizadorDeImagem
{
    public class ExercicioNataly
    {
        public static void Equalizar(string caminhoImagem, bool comCor = false)
        {
            Bitmap imagem = new Bitmap(caminhoImagem);
            Bitmap imagemEqualizada = new Bitmap(caminhoImagem);

            List<ImagemModel> imagemObj = new List<ImagemModel>();

            int contador = 0;
            for (int i = 0; i < imagem.Width; i++)
            {
                for (int j = 0; j < imagem.Height; j++)
                {
                    ImagemModel a = new ImagemModel();
                    Color pixel = imagem.GetPixel(i, j);

                    a.corOriginal = pixel;
                    a.identificador = contador;
                    if (comCor)
                    {
                        a.K = Utils.CorGetLuminosidade(pixel);
                        a.KAzul = pixel.B;
                        a.KVerde = pixel.G;
                        a.KVermelho = pixel.R;
                    }
                    else
                    {
                        a.K = Utils.CorGetLuminosidade(pixel);
                    }

                    a.localizacaoPixel = new Point(i, j);
                    imagemObj.Add(a);
                    contador++;
                }
            }

            var listinha = imagemObj.OrderBy(x => x.identificador).ToList();
            List<int> K = new List<int>();
            List<int> KAzul = new List<int>();
            List<int> KVerde = new List<int>();
            List<int> KVermelho = new List<int>();
            if (comCor)
            {
                KAzul = ExercicioProfessor.Equalizar(listinha.Select(x => x.KAzul).ToList());
                KVerde = ExercicioProfessor.Equalizar(listinha.Select(x => x.KVerde).ToList());
                KVermelho = ExercicioProfessor.Equalizar(listinha.Select(x => x.KVermelho).ToList());
            }
            else
            {
                K = ExercicioProfessor.Equalizar(listinha.Select(x => x.K).ToList());
            }

            foreach (ImagemModel item in listinha)
            {
                Color cor = new Color();
                var i = item.identificador;
                if (comCor)
                    cor = Color.FromArgb(KVermelho[i], KVerde[i], KAzul[i]);
                else
                    cor = Color.FromArgb(K[i], K[i], K[i]);

                imagemEqualizada.SetPixel(item.localizacaoPixel.X, item.localizacaoPixel.Y, cor);
            }

            SaveFileDialog save = new SaveFileDialog();
            save.FileName = caminhoImagem.Replace(".jpg", "") + Guid.NewGuid().ToString() + ".jpg";
            save.DefaultExt = Path.GetExtension(caminhoImagem);
            if (save.ShowDialog() == DialogResult.OK)
            {
                imagemEqualizada.Save(save.FileName);
                Process.Start(Path.GetDirectoryName(save.FileName));
            }
        }
    }
}
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

using System;
using System.Collections.Generic;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EqualizadorDeImagem
{
    public class ImagemModel
    {
        public int identificador { get; set; }
        public Point localizacaoPixel { get; set; }        
        public Color corOriginal { get; set; }        
        public int K { get; set; }
        public int KVermelho { get; set; }
        public int KAzul { get; set; }
        public int KVerde { get; set; }       

    }
}

using System;
using System.Collections.Generic;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EqualizadorDeImagem
{
    public class Utils
    {
        public static bool TextoContemSomenteNumeros(string text, List<string> ignore = null)
        {
            if (text == null)
                return false;

            if (ignore != null && ignore.Count > 0)
            {
                foreach (var a in ignore)
                {
                    text = text.Replace(a, "");
                }
            }

            List<int> valuesnumber = new List<int>() { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

            foreach (var a in valuesnumber)
            {
                text = text.Replace(a.ToString(), "");
            }

            return string.IsNullOrWhiteSpace(text);
        }
        public static int CorGetLuminosidade(Color cor)
        {
            return Convert.ToInt32(0.299 * cor.R + 0.587 * cor.G + 0.114 * cor.B);
        }
    }
}

