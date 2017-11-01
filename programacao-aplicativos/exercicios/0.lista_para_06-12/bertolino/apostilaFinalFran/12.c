# include <stdio.h>

int main( void ){

    float x , y=0,i;

    for( i = 0 ; i < 4 ; ++i ){
        scanf( " %f" , &x );
        y += x/4;
    }
    ( y >= 7 ) ? printf( "APROVADO\n" ) : printf( "REPROVADO\n" ) ;





    return 0;
}

