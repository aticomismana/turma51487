# include <stdio.h>

int main( void ){

    float x , y;

    scanf( "%f %f" , &x , &y );

    ( x*y > 0 ) ? printf( "+\n" ) : printf( "-\n" );


    return 0;
}
