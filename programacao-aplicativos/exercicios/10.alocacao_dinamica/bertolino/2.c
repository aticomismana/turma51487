#include <stdio.h>
#include <stdlib.h>

int main( void ){

	size_t tam; int *ptr , i , par = 0;
	scanf( " %d" , &tam );
	ptr = (int *) malloc( tam * sizeof( int ) );
	for( i = 0 ; i < tam ; scanf( " %d" , (ptr+i) ) , par = ( *(ptr+i++) % 2 == 0 ) ? par + 1 : par );
	printf( "%d %d\n" , par , tam - par );

	return 0;
}