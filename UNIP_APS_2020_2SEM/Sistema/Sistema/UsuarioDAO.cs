//using DlibDotNet;
using System;
using System.Collections.Generic;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
//using FaceRecognitionDotNet;
using System.Windows.Forms;
using System.ComponentModel;
using System.Data;
using System.IO;
using Emgu.CV;
using Emgu.CV.Structure;
using Emgu.CV.CvEnum;

namespace Sistema
{
    public class UsuarioDAO
    {

        public static int rostosTreinados { get; set; }
        public static List<Image<Gray, byte>> ImagensTreinadas { get; set; }

        public static List<string> NomesTreinados { get; set; }

        public static string capturarImagem()
        {
            string a = null;

            try
            {
                OpenFileDialog o = new OpenFileDialog();
                o.Filter = "Imagem | *.jpg; *.jpeg;";
                if (o.ShowDialog() == DialogResult.OK)
                { a = o.FileName; }
            }
            catch (Exception ex)
            {
                throw new Exception("Erro ao capturar a imagem!", ex);
            }
            return a;
        }

        public static HaarCascade BuscarCascade()
        {
            string caminho = Path.Combine(Directory.GetCurrentDirectory(), "haarcascade_frontalface_default.xml");
            File.WriteAllText(caminho, Sistema.Properties.Resources.haarcascade_frontalface_default);
            HaarCascade treinamento = new HaarCascade(caminho);
            return treinamento;
        }

        public static void SalvarCarregarRostos()
        {
            string pastaSave = Path.Combine(Application.StartupPath, "RegistrosRostos");
            string arquivoNomes = Path.Combine(pastaSave, "RegistroTags.txt");

            if (ImagensTreinadas == null)
            { ImagensTreinadas = new List<Image<Gray, byte>>(); }

            if (NomesTreinados == null)
            { NomesTreinados = new List<string>(); }

            if (!Directory.Exists(pastaSave))
            {
                var a = Directory.CreateDirectory(pastaSave);
            }

            if (!File.Exists(arquivoNomes))
            {
                var a = File.Create(arquivoNomes);
                a.Close();
                a.Dispose();
            }

            // salvar 
            try
            {
                if (ImagensTreinadas != null && ImagensTreinadas.Count > 0 && NomesTreinados != null && NomesTreinados.Count > 0)
                {                    
                    File.WriteAllText(arquivoNomes, "");
                    for (int i = 0; i < ImagensTreinadas.Count; i++)
                    {
                        Image<Gray, byte> rosto = ImagensTreinadas[i];
                        ImagensTreinadas.ToArray()[i].Save(Path.Combine(pastaSave, "Rosto" + i + ".bmp"));
                        File.AppendAllText(arquivoNomes, NomesTreinados.ToArray()[i] + ">");
                    }

                }
            }
            catch (Exception ex)
            {
                throw new Exception("Falha ao salvar a imagem ");
            }

            // carregar
            try
            {
                if (File.Exists(arquivoNomes))
                {
                    var nomesInformacao = File.ReadAllText(arquivoNomes);
                    if (!string.IsNullOrWhiteSpace(nomesInformacao) && nomesInformacao.Contains(">"))
                    {
                        string[] Labels = nomesInformacao.Split('>');
                        rostosTreinados = Labels.Count() - 1;
                        ImagensTreinadas = new List<Image<Gray, byte>>();
                        NomesTreinados = new List<string>();
                        for (int i = 0; i < rostosTreinados; i++)
                        {
                            string nomeRosto = "Rosto" + i + ".bmp";
                            ImagensTreinadas.Add(new Image<Gray, byte>(Path.Combine(pastaSave, nomeRosto)));
                            NomesTreinados.Add(Labels[i]);
                        }
                    }
                }

            }
            catch (Exception ex)
            {
                string a = "";
                //throw new Exception("Falha ao carregar dados");
            }

        }

        public static void Cadastrar(string caminho, string nome, int perfil)
        {

            SalvarCarregarRostos();

            HaarCascade treinamento = BuscarCascade();


            var imagemAtual = new Image<Bgr, byte>(caminho);
            var modeloCinza = imagemAtual.Convert<Gray, Byte>();

            var rostosachados = modeloCinza.DetectHaarCascade(treinamento, 1.2, 10, Emgu.CV.CvEnum.HAAR_DETECTION_TYPE.DO_CANNY_PRUNING, new Size(20, 20));

            Image<Gray, byte> resultado = null;
            Image<Gray, byte> rostoTreinado = null;
            foreach (MCvAvgComp face in rostosachados[0])
            {
                resultado = imagemAtual.Copy(face.rect).Convert<Gray, byte>().Resize(100, 100, Emgu.CV.CvEnum.INTER.CV_INTER_CUBIC);
                rostoTreinado = imagemAtual.Copy(face.rect).Convert<Gray, byte>();
                break;
            }

            ImagensTreinadas.Add(rostoTreinado);
            NomesTreinados.Add(nome + "_" + perfil);

            SalvarCarregarRostos();
        }
        public static UsuarioTO Logar(string caminho)
        {
            UsuarioTO u = null;

            SalvarCarregarRostos();

            HaarCascade treinamento = BuscarCascade();

            var imagematual = new Image<Bgr, byte>(caminho);
            var escalacinza = imagematual.Convert<Gray, Byte>();

            var rostoslocalizados = escalacinza.DetectHaarCascade(treinamento, 1.2, 10, Emgu.CV.CvEnum.HAAR_DETECTION_TYPE.DO_CANNY_PRUNING, new Size(20, 20));

            Image<Gray, byte> resultado = null;
            Image<Gray, byte> rostoTreinado = null;
            string nomezinho = "";
            foreach (MCvAvgComp face in rostoslocalizados[0])
            {
                if (ImagensTreinadas != null && ImagensTreinadas.Count > 0)
                {
                    resultado = imagematual.Copy(face.rect).Convert<Gray, byte>().Resize(100, 100, Emgu.CV.CvEnum.INTER.CV_INTER_CUBIC);
                    rostoTreinado = imagematual.Copy(face.rect).Convert<Gray, byte>();
                    //resultado = currentFrame.Copy(f.rect).Convert<Gray, byte>().Resize(gray.Width, gray.Height, Emgu.CV.CvEnum.INTER.CV_INTER_CUBIC);

                    resultado = imagematual.Copy(face.rect).Convert<Gray, byte>().Resize(100, 100, Emgu.CV.CvEnum.INTER.CV_INTER_CUBIC);
                    rostoTreinado = imagematual.Copy(face.rect).Convert<Gray, byte>();

                    MCvTermCriteria termCrit = new MCvTermCriteria(rostosTreinados + 1, 0.001);
                    EigenObjectRecognizer recognizer = new EigenObjectRecognizer(ImagensTreinadas.ToArray(), NomesTreinados.ToArray(), 3000, ref termCrit);

                    var recon = recognizer.Recognize(rostoTreinado);
                    if (recon == null)
                    { throw new Exception("usuario não localizado!"); }
                    nomezinho = recon.Label;
                }
                break;
            }

            if (!string.IsNullOrEmpty(nomezinho))
            {
                u = new UsuarioTO();
                u.Nome = nomezinho.Split('_')[0];
                u.Perfil = Convert.ToInt32(nomezinho.Split('_')[1]);
            }

            return u;
        }
       
    }
}
