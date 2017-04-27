using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication2
{
    class Program
    {
        static void Main(string[] args)
        {
            Professor funcProf = new Professor();
            Console.WriteLine("Nome do usuario professor: ");
            funcProf.nome = Console.ReadLine();
            Console.WriteLine("Salario: ");
            funcProf.salario = float.Parse(Console.ReadLine());
            funcProf.Bonificacao();

            Console.Write('\n');

            Diretor funcDir = new Diretor();
            Console.WriteLine("Nome do usuario diretor: ");
            funcDir.nome = Console.ReadLine();
            Console.WriteLine("Salario: ");
            funcDir.salario = float.Parse(Console.ReadLine());
            Console.WriteLine("Usuario: ");
            funcDir.usuario = Console.ReadLine();
            Console.WriteLine("Senha: ");
            funcDir.senha = Console.ReadLine();
            funcDir.Bonificacao();

            Console.Write('\n');

            Secretaria funcSecretaria = new Secretaria();
            Console.WriteLine("Nome do usuario secretaria: ");
            funcSecretaria.nome = Console.ReadLine();
            Console.WriteLine("Salario: ");
            funcSecretaria.salario = float.Parse(Console.ReadLine());
            Console.WriteLine("Número do ramal: ");
            funcSecretaria.numeroRamal = int.Parse(Console.ReadLine());
            funcSecretaria.Bonificacao();


            Console.Read();
        }
    }
}
