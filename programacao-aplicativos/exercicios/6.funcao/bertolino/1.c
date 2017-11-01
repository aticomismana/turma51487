# include <stdio.h>
# define positivo(a) ( ( a > 0 ) ? printf( "Sim\n" ) : printf( "Nao\n" ) )

int main( void ){
    float x;
    scanf( "%f" , &x );
    positivo( x );
    return 0;
}
