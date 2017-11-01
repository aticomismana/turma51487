#include <stdio.h>
#include <stdlib.h>

int main( void ){
	int *ptr , i;
	ptr = malloc( 5 * sizeof( int ) );

	for( i = 0 ; i < 5 ; printf( "%d\n" , ptr ) , scanf( " %d" , ptr+i++ ) );
	for( i = 0 ; i++ < 5 ; printf( "%d\n" , ptr ) , printf( "%d\n" , *ptr++ ) );
	
	free( (ptr-(--i)) );

	return 0;
}