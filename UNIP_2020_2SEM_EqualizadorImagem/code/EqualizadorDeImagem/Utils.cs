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
