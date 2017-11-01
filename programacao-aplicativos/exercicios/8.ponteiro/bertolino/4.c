#include <stdio.h>

int main(void){

	float vetor[5] = {1,2,3,4,5};
	float *ptrVet;

	printf( "Os valores do vetor sendo varrido por um ponteiro são:" );
	for( ptrVet = vetor ; ptrVet <= &vetor[4] ; *ptrVet*=2 , printf( " %.2f" , *ptrVet ) , ++ptrVet );

	printf( "\n" );
	return 0;
}