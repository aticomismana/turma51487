using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace abstrata
{
    class Gerente : Funcionario
    {
        public int senha { get; set; }

        public override double Bonificacao()
        {
            return this.Salario = (this.Salario + 300) * 1.20;
        }
    }
}
