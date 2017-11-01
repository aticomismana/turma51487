# include "string.variavel.h"

int main(void){

    long int n , i;
    scanf( "%ld" , &n );

    for( i = 1 ; i <= n ; ++i ) if( n % i == 0 ) printf( "%ld\n" , i );

    return 0;
}

