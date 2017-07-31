#include <stdio.h>
#include <stdlib.h>

int main( void ){

    int a , i , verify;
    int max[2] , min[2];
    int *vet;

    do{
        printf( "Digite o tamanho do seu vetor: " );
        verify = scanf( "%id" , &a );
        if( verify != 1 ) { printf( "Valor inválido!" ); continue; };
    }while( a <= 0 );

    vet = malloc( a * sizeof ( int ) );

    for ( i = 0 ; i < a ; ++i )
        verify = scanf( "%id" , &vet[i] ),
        ( ! ( verify != 1 ) ) ? printf( "" ) : printf( "Valor inválido!" ) ,
        i == 0 ? ( max[0] = min[0] = vet[i] , max[1] = min[1] = i ) :
            ( vet[i] > max[0] ) ? max[0] = vet[i] , max[1] = i :
                ( vet[i] < min[0] ) ? min[0] = vet[i] , min[1] = i :
                    printf("");

    printf( "O maior valor foi: %d na posicao vet[%d].\nO menor valor foi: %d na posicao vet[%d]." , max[0] , max[1] , min[0] , min[1] );

    getchar();

    return 0;
}
