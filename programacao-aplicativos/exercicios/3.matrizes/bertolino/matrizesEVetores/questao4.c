#include <stdio.h>
#include <stdlib.h>

int main(void){

    int verify , i , j;
    unsigned int length;
    int **vet;

    printf( "Digite a quantidade de linhas e colunas que sua matriz deve ter:" );
    verify = scanf( "%u" , &length );
    if( verify != 1 ) printf( "\nValor digitado inválido!\n" );

    vet = malloc( length * sizeof ( int *) );
    for ( i = 0 ; i < length ; ++i ) vet[i] = malloc( length * sizeof ( int ) );

    for ( i = 0 ; i < length ; ++i ) for ( j = 0 ; j < length ; ++j ) vet[i][j] = ( i == j ) ? 1 : 0 ;

    for ( i = 0 ; i < length ; ++i ) for ( j = 0 ; j < length ; ++j ) j == length - 1  ? printf( " %d \n" , vet[i][j] ) : printf( " %d " , vet[i][j] ) ;

    getchar();
    return 0;
}
