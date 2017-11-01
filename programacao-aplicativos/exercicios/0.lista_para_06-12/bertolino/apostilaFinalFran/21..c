# include "string.variavel.h"

int main(void){

    unsigned int i;
    unsigned long int fatorial( unsigned long int n );

    scanf( "%u" , &i );
    printf( "Fatorial: %lu\n" , fatorial( i ) );

    return 0;
}

unsigned long int fatorial( unsigned long int n ){
    if( n <= 1 ){
        return 1;
    }else{
        return  n * fatorial( n - 1 );
    }
}
