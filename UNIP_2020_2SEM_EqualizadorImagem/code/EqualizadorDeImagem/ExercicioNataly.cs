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
