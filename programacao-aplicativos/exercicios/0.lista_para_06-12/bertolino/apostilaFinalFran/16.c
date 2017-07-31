# include <stdio.h>

int main( void ){

    float x , y ;
    scanf( "%f %f" , &x , &y );

    ( x > y ) ? printf( "Primeiro é maior\n" ) : ( x == y ) ? printf( "Números iguais\n" ) : printf( "Segundo maior\n" ) ;

    return 0;
}

