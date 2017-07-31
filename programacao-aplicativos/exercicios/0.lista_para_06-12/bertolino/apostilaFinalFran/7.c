# include <stdio.h>

int main( void ){

    float x;

    scanf( "%f" , &x );
    if( x >= 10 ){
        x+= 5;
    }else{
        x-= 7;
    }
    printf( "%.2f" , x );

    return 0;
}
