using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication2
{
    class Funcionario
    {
        public string nome { get; set; }
        public float salario { get; set; }

        public Funcionario()
        {

        }

        public void Bonificacao()
        {
            salario = salario + salario * 10 / 100;
            Console.WriteLine("Nome do funcionario: " + nome);
            Console.Write("Novo salario do funcionario: " + salario);
        }

    }


}
