using System;

namespace Atividade
{
     class Operacao
    {
        public double resultado;

        public double soma(double num2, double num1)
        {
            resultado = num1 + num2;
            return resultado;
        }

        public double multiplicacao(double num1, double num2)
        {
            resultado = num1 * num2;
            return resultado;
        }

        public double divisao(double num1, double num2)
        {
            resultado = num1 / num2;
            return resultado;
        }

        public double subtracao(double num1, double num2)
        {
            resultado = num1 - num2;
            return resultado;
        }

        public static implicit operator int(Operacao v)
        {
            throw new NotImplementedException();
        }
    }
}