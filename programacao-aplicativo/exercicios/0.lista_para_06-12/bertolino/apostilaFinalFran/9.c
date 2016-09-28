# include <stdio.h>

int main( void ){

    int x;
    scanf( "%d" , &x );

    ( x % 2 == 0 ) ? printf( "PAR\n" ) : printf( "ÍMPAR\n" );

    return 0;
}
