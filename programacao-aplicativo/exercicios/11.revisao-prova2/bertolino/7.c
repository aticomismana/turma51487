#include <stdio.h>
#include <stdlib.h>

int ** cria_mat( int m, int n );
void libera_mat( int **ptr, int m );

int main( int argc, char const *argv[] ){
	int **teste, lin, col;

	scanf( " %d %d", &lin, &col );
	teste = cria_mat( lin, col );
	libera_mat( teste, lin );

	teste = NULL;

	return 0;
}

int ** cria_mat( int m, int n ){
	int **aux;
	if( (aux = malloc( m * sizeof( int * ) )) )
		while( --m >= 0 )
			if( !(aux[m] = malloc( n * sizeof( int ) )) )
				break;
	return aux;
}

void libera_mat( int **ptr, int m ){
	for( int i = 0; i < m; ++i ) free( ptr[i] );
	free( ptr );
}
