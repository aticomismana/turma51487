using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace abstrata
{
    class Recepcionista : Funcionario
    {
        public int ramal { get; set; }

        public override double Bonificacao()
        {
            return this.Salario = (this.Salario + 300) * 1.10;
        }
    }
}
