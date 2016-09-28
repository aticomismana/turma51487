# include <stdio.h>
# define delta( a , b ,c ) ( b*b - 4*a*c)

int main( void ){
    float a , b , c ;
    scanf( "%f" , &a );
    scanf( "%f" , &b );
    scanf( "%f" , &c );
    printf( "Delta é igual a: %f\n" , delta( a , b , c ) );
    return 0;
}
