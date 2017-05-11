using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Heranca
{
    class Animal
    {
        public String Nome { get; private set; }
        public double Peso { get; private set; }

        public void DefinirNome(String nome)
        {
            this.Nome = nome;
        }

        public void Comer(double qtdComida)
        {
            Console.WriteLine("Animal comendo");
                this.Peso += qtdComida;
        }

        public void Anda()
        {
            Console.WriteLine("Animal andando");
        }

        public void Defecar(double qtdComida)
        {
            this.Peso -= (qtdComida * 0.3);
        }
            


    }

}
