#include <stdio.h>
#include <stdlib.h>

int main( void ){
    int verify , i;
    unsigned int length;
    long double a , raz , *vet;

    printf( "Digite a quantidade de termos que sua P.A. deve ter:" );
    verify = scanf( "%u" , &length );
    if( verify != 1 ) printf( "Valor digitado inválido!" );

    vet = malloc( length * sizeof ( long double ) );

    printf( "Digite o primeiro termo da sua P.A.:" );
    verify = scanf( "%Lf" , &a );
    if( verify != 1 ) printf( "Valor digitado inválido!" );

    printf( "Digite a razão da sua P.A.: " );
    verify = scanf( "%Lf" , &raz );
    if( verify != 1 ) printf( "Valor digitado inválido!" );

    for( i = 0 ; i < length ; ++i ) ( i == 0 ) ? vet[i] = a : ( vet[i] =  vet[i-1] + raz );

    for( i = 0 ; i < length ; ++i ) printf( " '%Lf' " , vet[i] );

    getchar();

    return 0;
}
