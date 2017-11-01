/*
 *
 * Para incluir esse arquivo no seu arquivo principal, caso esteja na
 * mesma pasta em que será chamado, escreva:
 *
 * # include "string.variavel.h"
 *
 * Caso esteja em outra pasta:
 *
 * # include < <caminho/do/arquivo/completo> >
 *
 * Observe que não há a necessidade de incluir <stdio.h> nem <stdlib.h>
 * uma vez que já estão incluídas nesse arquivo.
 *
 * A chamada da função `pegastr()` deve ser feita passando um ponteiro
 * pré-declarado por "referência" (passando o endereço de memória dele,
 * já que C não possui passagem por referência).
 *
 * Dessa forma, a chamada dentro do seu arquivo principal deve ser feita
 * da seguinte forma:
 *
 *      pegastr( &<ponteiro> );
 *
 * O ponteiro deve ser previamente declarado como tipo char:
 *
 *      char *<ponteiro>;
 *
 * Resultado final, ex:
 *
 *      char *mariaBonita;
 *      pegastr( &mariaBonita );
 *
 * A utilização da função se dá no mesmo formato que o scanf(), porém,
 * ela armazena todo o texto inserido pelo usuário formatado para o tipo
 * "string" (char) e armazena todo o valor até a inserção do ENTER '\n'.
 *
 * OBS:
 *
 *      Em caso de criação de um vetor de strings, a declaração deve ser
 *      feita a seguinte forma:
 *
 *          char *<ponteiro>[<tamanho>];
 *
 *      O <tamanho> deve ser um valor inteiro positivo, podendo ser uma
 *      variável ou um número direto na declaração.
 *
 *      E a chamada da função é feita da seguinte forma:
 *
 *          pegastr( &<ponteiro>[<indice-atual>] );
 *
 *      Ex.:
 *
 *          char *isaac[10] , *asimov[x];
 *
 *          //Dentro da iteração:
 *              pegastr( &isaac[i] ); pegastr( &asimov[i] );
 *
 * OBS2:
 *
 *      Em caso de inicializar o ponteiro, proceda da seguinte forma:
 *
 *          char *<ponteiro> = NULL , *<ponteiro>[tamanho] = { NULL };
 *
 *      Ex.:
 *
 *          char *bertolino = NULL , *descricoes[n] = { NULL };
 *
 */

# include <stdio.h>
# include <stdlib.h>

void pegastr( char **str ){

    char x , *guardaStr ;
    unsigned int j ;

    guardaStr = malloc( 1 );
    if( guardaStr == NULL ) exit(1);
    guardaStr[0] = '\0';

    j = 1;
    while( 1 ){

        x = getc( stdin );
        if( x == '\n' ) break;

        guardaStr = realloc( guardaStr , j + 1 );
        if( guardaStr == NULL ) exit(1);
        guardaStr[j-1] = x;
        guardaStr[j] = '\0';

        ++j;
    }

    *str = guardaStr;
    fflush( stdin );
}







