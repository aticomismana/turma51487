# include <stdio.h>
# include <stdlib.h>

int main(void){

    double x; unsigned short int n , i , j; /* Declaração dos índices utilizados nas iterações de forma Unsigned, para previnir problemas com valores negativos */

    typedef struct {
        double num;
        int qtd;
    } valorQtd; /* Criação do tipo de dado "valorQtd" que é um apelido pra Struct declarada em cima */

    valorQtd padrao = { 0 , -1 }; /* Criação dos valores 'defaults' para os dados desse tipo de struct */

    scanf( "%hu" , &n ); /* Obtenção do número de elementos da sequência */

    valorQtd *salvos = malloc( n * sizeof( valorQtd ) ); /* Alocação de memória para os structs conforme o valor 'n' informado */
    for( i = 0 ; i < n ; ++i ) salvos[i] = padrao; /* Remanejamento dos dados do vetor salvos já criado para os valores padrões */

    void pesquisa_valor( double num ){ /* Criação da função que recebe o valor digitado pelo usuário e o verifica dentre os valores já registrados se eles existem e adiciona 1 à sua quantidade, se não, procura criar esse valor inexistente */
        for( i = 0 ; i < n ; ++i ){ /* Varre os índices do vetor salvo */
            if( salvos[i].num == num && salvos[i].qtd != -1 ){ /* Verifica se o valor digitado já é existente nessa posição do vetor (note que o != -1 é para verificar se o valor já foi registrado, mesmo sendo 0) */
                ++salvos[i].qtd;
                break;
            }else{ /* Caso o valor não seja existente nessa posição */
                if( salvos[i].num == 0 && salvos[i].qtd == -1 ){ /* Caso o valor não seja existente nem registrado nesta posição */
                    salvos[i].num = num; /* Registra o novo número */
                    salvos[i].qtd = 1; /* Novo número registrado passa a ter quantidade 1 */
                    break;
                }
            }
        }
    }

    for( j = 0 ; j < n ; ++j ) { /* Iteração que recebe os valores de cada elemento da sequência */
        scanf( " %lf" , &x );
        pesquisa_valor( x ); /* Chamada da função passando como argumento o valor acima digitado */
    }

    for( i = 0 ; i < n ; ++i ) if( salvos[i].qtd != -1 ) ( printf( "O número %g ocorre %d vez" , salvos[i].num , salvos[i].qtd ) , ( salvos[i].qtd <= 1 ) ? printf( ".\n" ) : printf( "es.\n" ) ); /* Imprime na tela todo os valores registrados e suas respectivas quantidades */


    return 0;
}
