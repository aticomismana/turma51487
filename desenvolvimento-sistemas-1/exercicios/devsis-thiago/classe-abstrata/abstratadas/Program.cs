using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace abstrata
{
    class Program
    {
        static void Main(string[] args)
        {
            Gerente G1 = new Gerente();
            Funcionario F1 = new Gerente();
            Recepcionista R1 = new Recepcionista();
            Funcionario F2 = new Recepcionista();

            G1.Nome = "Thiago";
            G1.Salario = 1500;
            G1.senha = 123456;

            G1.Bonificacao();
            Console.Write(G1.Salario);

            Console.ReadLine();
        }
    }
}
