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
                    L = contagem.Count;
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
