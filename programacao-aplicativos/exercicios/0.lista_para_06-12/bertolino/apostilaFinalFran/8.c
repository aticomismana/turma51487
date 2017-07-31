# include <stdio.h>

int main( void ){

    float x , y;

    scanf( "%f %f" , &x , &y );

    if( x >= y ){
        printf( "%.2f" , x );
    }else{
        printf( "%.2f" , y );
    }

    return 0;
}
