#include <stdio.h>
#include <stdlib.h>

int * cria_vet( int n );
void printa_vet( int *vet, int n );
void libera_vet( int *vet );

int main( int argc, char const *argv[] ){
	int tam, *ptr;

	scanf( " %d", &tam );
	if( !(ptr = cria_vet( tam )) return 1;

	for(int i = 0; i < tam; ++i) scanf( " %d", &ptr[i] );

	printa_vet( ptr, tam );

	libera_vet( ptr );

	return 0;
}

int * cria_vet( int n ){ return malloc( n * sizeof( int ) ); }

void printa_vet( int *vet, int n ){
	int i;
	for( i = 0; i < n; ++i )
		printf( " %d\n", *(vet+i) );
}


void libera_vet( int *vet ){ free( vet ); }
