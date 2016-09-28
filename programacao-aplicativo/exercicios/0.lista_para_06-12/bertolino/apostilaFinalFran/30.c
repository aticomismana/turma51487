# include "string.variavel.h"
# define MAX 4

int main(void){

    int V1[MAX] , V2[MAX] , i , c = 0 ;

    for( i = 0 ; i < MAX ; scanf( " %d" , &V1[i] ) , ++i );
    for( i = 0 ; i < MAX ; scanf( " %d" , &V2[i] ) , ++i );
    for( i = 0 ; i < MAX ; ++i ) if( V1[i] == V2[i] ) ++c;

    printf( "%d\n" , c );

    return 0;
}

