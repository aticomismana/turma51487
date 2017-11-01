using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Heranca
{
    class Mamifero : Animal
    {
        public override void Defecar(double qtdComida)
        {
            this.Peso -= (qtdComida * 0.1);
        }
    }
}
