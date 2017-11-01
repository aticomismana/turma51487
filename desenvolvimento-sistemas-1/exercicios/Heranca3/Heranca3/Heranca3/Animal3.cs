using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Heranca
{
    class Animal3
    {
        public String Nome { get; protected set; }
        public double Peso { get; protected set; }
        public String Tam { get; protected set; }

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

        public virtual void Defecar(double qtdComida)
        {
            if(this.Peso > qtdComida)
        
        {
            this.Peso -= (qtdComida * 0.3);
                Console.WriteLine("Animal ta Pesando" + Peso);
        }



    }

}
