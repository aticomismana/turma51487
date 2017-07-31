#include <stdio.h>
#include <stdlib.h>
#include "../string.variavel.h"

short evogal( char let );

int main( void ){
	int x, i = 0 , tam; char *ptr;
	scanf( " %d" , &tam );
	ptr = (char *) malloc( tam * sizeof( char ) );
	pegastr( &ptr , tam );
	printf( "%s\n" , ptr );
	while( *ptr != '\0' ) if( !evogal( *ptr ) ) putc( *ptr++ , stdout );
	putc( '\n' , stdout );
	return 0;
}

short evogal( char let ){
	switch( let ){
		case 65:
		case 69:
		case 73:
		case 79:
		case 85:
		case 65+32:
		case 69+32:
		case 73+32:
		case 79+32:
		case 85+32:
			return 1;
		default:
			return 0;
	}
}