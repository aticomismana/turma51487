#include <stdio.h>

int main(void){

	float vetor[10];
	float *ptrVet;

	printf( "Os enderecos dos índices vetor sendo varrido por um ponteiro são:" );
	for( ptrVet = vetor ; ptrVet <= &vetor[9] ; printf( "\n\t%d" , (int)ptrVet ) , ++ptrVet );

	printf( "\n" );
	return 0;
}