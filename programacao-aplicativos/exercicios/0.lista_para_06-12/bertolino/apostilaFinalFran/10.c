# include <stdio.h>

int main( void ){

    float x , y;
    scanf( "%f %f" , &x , &y );

    if( x >= y && y != 0 ){
        printf( "%.2f\n" , x/y );
    }else if( y > x && x != 0 ){
        printf( "%.2f\n" , y/x );
    }else{
        printf( "Divisão pro zero não permitida!\n" );
    }

    return 0;
}
