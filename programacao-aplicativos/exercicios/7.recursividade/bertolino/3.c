#include <stdio.h>
#include <stdlib.h>

int somaVet( int *vet , unsigned int tamVet  );

int main(void){

	int n , i , *vetor;
	scanf( "%d" , &n );

	vetor = malloc( n * sizeof( int ) );

	printf( "Preencha os valores consecutivamente dos elementos do seu vetor de %d índices: ", n );
	for( i = 0 ; n > i ; ++i ) scanf( " %d" , &vetor[i] );

	printf( "O somatório de todos os elementos do vetor é: %d\n" , somaVet( vetor , n ) );

	return 0;
}

int somaVet( int *vet , unsigned int tamVet){

	static unsigned int i = 0;

	if( tamVet - 1 == i ) return vet[i];

	return vet[i++] + somaVet( vet , tamVet );

}
