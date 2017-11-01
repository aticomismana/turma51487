# include "string.variavel.h"

int main(void){

    unsigned int i , count = 0;

    for( i = 1000 ; i < 2000 ; ++i ) if( i % 11 == 5 ) { printf( "%u\n" , i ) ;  if( ++count == 20 ) break ; } ;

    return 0;
}

