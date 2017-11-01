#include <stdio.h>

int main(void){

	int x , y , *ptrx , *ptry;

	x = y = 10;

	ptrx = &x;
	ptry = &y;

	printf( "%i %i\n" , ptrx , ptry );

	printf( "O maior endereco é: %c %i\n" , ( ptrx > ptry ) ? 'x' , (int)ptrx : 'y' , (int)ptry );

	return 0;
}