using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FuncionarioEscola
{
    class Diretor: Program
    {
        public String Nome { get; set; }
        public String Senha { get; set; }

        public override void Bonificacao(double Salario)
        {
            if (this.Salario >= 900.00){
                this.Salario += Salario * 0.20;
            }
        }
    }
}
