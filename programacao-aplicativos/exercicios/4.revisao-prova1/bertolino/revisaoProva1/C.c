#include <stdio.h>
#include <string.h>

int main( void ){

    unsigned int i, tamPal, j=0,k=0;
    char palavra[50],letra[50];

    scanf( "%s" , palavra );
    tamPal = strlen( palavra );

    for( i = 0 ; i < tamPal ; ++i ){
        switch( palavra[i] ){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                letra[j] = palavra[i];
                ++j;
        }
    }

    for( i = 0 ; i < j ; ++i ){
        if( letra[i] == letra[j-i-1] ){
            ++k;
        }else{
            printf( "N\n" );
            break;
        }
    }
    if( j == k ) printf( "S\n" );
    return 0;
}
