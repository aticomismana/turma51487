using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Heranca
{
    class Program
    {
        static void Main(string[] args)
        {
            Animal a1 = new Animal();


            a1.DefinirNome("Porco");
            a1.Comer(80);
            a1.Definirtamanho(1.8);
            Console.WriteLine("Animal: " + a1.Nome + " Pesa " + a1.Peso + " kg Seu tamanho é " + a1.Tam);
            a1.Defecar(40);


            Mamifero m1 = new Mamifero();
            m1.DefinirNome("Orca");
            m1.Comer(5000);
            m1.DefTam(6.00);
            Console.WriteLine("Animal: " + m1.Nome + " Pesa " + m1.Peso + " kg Seu tamanho é " + m1.Tam);
            m1.Defecar(550);
            Console.ReadKey();
        }
    }
}
