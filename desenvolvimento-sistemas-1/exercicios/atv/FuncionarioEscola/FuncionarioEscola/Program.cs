using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FuncionarioEscola
{
    class Program
    {
        public double Salario { protected get; set; }
        public String Nome { protected get; set; }

        public virtual void Bonificacao(double Salario)
        {
            if (this.Salario >= 900.00)
            {
                this.Salario += Salario * 0.10;
            }

        }
        static void Main(string[] args)
        {
            Diretor d1 = new Diretor();

            Console.Write("Escreva seu nome");
            d1.Nome = Console.ReadLine();
            
            Console.Write("Escreva sua senha");
            d1.Senha = Console.ReadLine();
        }
    }
}
