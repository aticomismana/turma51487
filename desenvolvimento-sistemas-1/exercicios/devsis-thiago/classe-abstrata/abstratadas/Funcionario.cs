using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace abstrata
{
    abstract class Funcionario
    {
        public string Nome { get; set; }
        public int Matricula { get; set; }
        public double Salario { get; set; }

        public void RegistrarPonto()
        {

        }

        abstract public double Bonificacao();
    }
}
