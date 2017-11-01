# include "string.variavel.h"

int main(void){

    unsigned long int n , i , count;

    scanf( "%lu" , &n );
    for( i = n , count = 0 ; i > 0 ; --i ) if( n % i == 0 ) ++count;
    ( count == 2 ) ? printf( "Primo\n" ) : printf( "Não é primo\n" );

    return 0;
}
