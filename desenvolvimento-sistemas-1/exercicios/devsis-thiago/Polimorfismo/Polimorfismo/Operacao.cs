using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Polimorfismo
{
    class Operacao
    {
        public int Soma(int num1, int num2)
        {
            return (num1 + num2);
        }

        public int Soma(int num1, int num2, int num3)
        {
            return (num1 + num2 + num3);
        }
    }
}
