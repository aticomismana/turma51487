# include "string.variavel.h"
# define TAM 10

int main(void){

    int vet[TAM],x,i,j,c=0;

    for( i = 0 ; i < TAM ; scanf( " %d" , &vet[i] ) , ++i );
    for( i = 0 ; i < TAM ; printf( " %d" , vet[i] ) , ++i );
    scanf( "%d" , &x );
    for( i = 0; i < TAM - c ; ++i ){
        if( vet[i] == x ){
            ++c;
            for( j = i ; j < TAM - c ; ++j ){
                vet[j] = ( j != TAM - 1 ) ? vet[j+1] : 0 ;
            }
        }
    }
    for( i = 0 ; i < TAM - c ; printf( " %d" , vet[i] ) , ++i );

    return 0;
}
