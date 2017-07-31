# include <stdio.h>
# define nulo(a) ( ( a != 0 ) ? printf( "Nao-nulo\n" ) : printf( "Nulo\n" ) )

int main( void ){
    float x;
    scanf( "%f" , &x );
    nulo(x);
    return 0;
}
