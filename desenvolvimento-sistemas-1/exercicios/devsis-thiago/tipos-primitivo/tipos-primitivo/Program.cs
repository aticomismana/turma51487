using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace tipos_primitivo{

    class Program{
        // enum - Estrutura de números
        enum dias {
            domingo, segunda, terca, quarta, quinta, sexta, sabado
        };
        static void Main(string[] args){

            // Tipos de dados do C# - Obs. Existem outros mais especificos
            // bool  -  char  -  decimal  -  double  -  float  -  int   -  long  -  object   -   string

            int number = 2;
            float number2 = 10f;
            string texto = "O número é esse: ";
            Console.WriteLine(texto + number);

            // Fazendo cast(Convertendo {domingo} para o indice que ele está na estrutura enum
            int x = (int)dias.domingo;
            Console.WriteLine(x);

            // Mostrando a variavel texto e concatenando com Number // Mostrará 2
            Console.WriteLine("O número float é: {0} ", number2);
            // Subistituindo {0} pela variavel number - o número indica o indice das variaveis apartir da 

            // Dias se transformou em um tipo de dado
            dias dia = dias.domingo;
            Console.WriteLine("A referencia do dia é: "+ dia);

            //EXERCICIO DE REPASSE
            //Crie 3 variáveis
            //Uma string chamada productName valor TV.
            //Uma integer chamada productYear valor 2012.
            //E outra double chamada productPrice valor 279.99.
                string productName = "LG";
                double productPrice = 279.99f;
                int productYear = 2012;
                Console.WriteLine("TV {0} preço do produto: R$ {1} ano do produto {2}", productName, productPrice,productYear);
            //FIM DO EXERCICIO DE REPASSE

            //Declarando e atribuindo valores vetor unidimensional
            int[] vet = { 0, 2, 1, 5, 1, 4, 4, 1, 4, 10 };

            //Declarando o tamanho do vetor
            int[] arr = new int[10];

            // Imprimindo o valor na posicao 4 ou seja o valor: 1
            Console.WriteLine(vet[4]);

            // Matriz
            int[,] matriz = new int[5, 5];

            //Atribuindo valores a matriz
            matriz[0, 1] = 1;
            matriz[0, 2] = 10;

            // Criando Listas
            List<string> frutas = new List<string>();
            List<int> sorteio = new List<int>();
            //Adicionando elementos
            frutas.Add("pera");
            frutas.Add("pera");
            frutas.Add("Maçã");
            frutas.Add("Banana");
            sorteio.Add(1);
            sorteio.Add(2);
            sorteio.Add(3);
            sorteio.Add(4);

            //Remover valor
            frutas.Remove("pera");

            //Imprimindo o valor pelo indice
            Console.WriteLine(sorteio[0]);

            //Estrutura de repetição forEach
            //Imprimindo todos os valores da lista fruta
            foreach (string fruta in frutas){
                Console.WriteLine(fruta);
            }

            for(int i=0; i <= frutas.Count; i++){
                Console.WriteLine(sorteio[i]);
            }

            // Faz com que o programa só encerre com a tecla enter
            Console.ReadLine();
        }
    }
}

