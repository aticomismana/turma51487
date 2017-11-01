#include <stdio.h>
#include <stdlib.h>

int main(void){

    int i , j , x = 0 , verify;
    unsigned int a , b , c , d;
    long double **m , **n;

    do{
        printf( "\nDigite a quantidade de linhas e colunas que sua 1a matriz deve ter:" );
        verify = scanf( "%u %u" , &a , &b );
        if( verify != 2 ) printf( "\nValor digitado inválido!\n" );

        printf( "Digite a quantidade de linhas e colunas que sua 2a matriz deve ter:" );
        verify = scanf( "%u %u" , &c , &d );
        if( verify != 2 ) printf( "\nValor digitado inválido!\n" );

        if ( a != c || b != d ) printf( "\nO número de linhas e colunas das duas matrizes é diferente!\nMatrizes não são idênticas!\n" );

    }while( a != c || b != d );

    m = malloc( a * sizeof ( long double * ) );
    for ( i = 0 ; i < a ; ++i ) m[i] = malloc( b * sizeof ( long double ) );

    n = malloc( c * sizeof ( long double * ) );
    for ( i = 0 ; i < c ; ++i ) n[i] = malloc( d * sizeof ( long double ) );

    for ( i = 0 ; i < a ; ++i ) for ( j = 0 ; j < b ; ++j ) ( printf( "\nPopule a matriz na posição M[%d][%d]: " , i , j ) , verify = scanf( "%Lf" , &m[i][j] ) , ( verify != 1 ) ? printf( "\nValor inválido inserido!" ) : printf(" ") );

    for ( i = 0 ; i < c ; ++i ) for ( j = 0 ; j < d ; ++j ) ( printf( "\nPopule a matriz na posição N[%d][%d]: " , i , j ) , verify = scanf( "%Lf" , &n[i][j] ) , ( verify != 1 ) ? printf( "\nValor inválido inserido!" ) : printf(" ") );

    for ( i = 0 ; i < a ; ++i ) for ( j = 0 ; j < b ; ++j ) { if ( m[i][j] != n[i][j] ) ++x ; }

    ( x == 0 ) ? printf( "\nMatrizes são iguais!" ) : printf( "\nMatrizes são diferentes!" ) ;



    getchar();
    return 0;
}
