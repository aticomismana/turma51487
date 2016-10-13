#include <stdio.h>

void trocaVal( int *a , int *b ){

	int aux;

	aux = *a;
	*a = *b;
	*b = aux;

}

int main(void){

	int varA , varB;

	scanf( "%d %d" , &varA , &varB );

	trocaVal( &varA , &varB );

	printf( "%d %d\n" , varA , varB );

	return 0;
}