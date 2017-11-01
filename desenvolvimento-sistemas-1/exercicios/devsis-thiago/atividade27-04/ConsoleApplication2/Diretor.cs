using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication2
{
    class Diretor : Funcionario
    {
        public string usuario;
        public string senha;

        public new void Bonificacao()
        {
            salario = salario + salario * 20 / 100;
            Console.Write("Novo salario do direitor: " + salario);
        }
    }
}
