#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

int main( void ){

	unsigned int tam ; int *ptr , x , i;

	scanf( " %u" , &tam );
	ptr = (int *) malloc( tam * sizeof( int ) );
	for( i = 0 ; i < tam ; scanf( " %d" , ptr+i++ ) );
	scanf( " %d" , &x );
	for( tam = 0 ; i - 1 >= 0 ;  ) if( *(ptr + (--i)) % x == 0 ) printf( "%d %d\n" , *( ptr + i ) , i ) , ++tam;
	printf( "Mult.: %d\n" , tam );

	return 0;
}