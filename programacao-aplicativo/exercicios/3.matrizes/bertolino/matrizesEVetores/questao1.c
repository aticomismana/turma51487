#include <stdio.h>
#include <stdlib.h>

int main(void){

    int i , j , a;
    double **m , x;

    do{
        printf( "Qual valor de linha e coluna da matriz M?" );
        scanf( "%d" , &a );
    }while( a <= 0 );

    m = malloc( a * sizeof ( double * ) );
    for ( i = 0 ; i < a ; ++i ) m[i] = malloc( a * sizeof ( double ) );

    for ( i = 0 ; i < a ; ++i ) for ( j = 0 ; j < a ; ++j ) ( printf( "Popule a matriz M[%d][%d]: ", i , j ) , scanf( "%lf" , &m[i][j] ) );

    for ( i = 0 ; i < a ; ++i ) for ( j = 0 ; j < a ; ++j ) ( x = ( i == j ) ? x + m[i][j] : x );

    x /= a;

    printf( "A média dos %d elementos da matriz %dx%d é: %f" , a , a , a , x );

    getchar();

    return 0;
}
