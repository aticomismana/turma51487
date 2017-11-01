# include <stdio.h>

int main( void ){

    float x , y;

    scanf( "%f %f" , &x , &y );

    if( x > y ){
        printf( "LUCRO\n" );
    }else if( x != y ){
        printf( "PREJUÍZO\n" );
    }else{
        printf( "SEM LUCRO OU PREJUÍZO\n" );
    }

    return 0;
}
