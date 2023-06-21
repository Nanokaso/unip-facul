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
