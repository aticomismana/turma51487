#include <stdio.h>

int quad_fat( int n, int teto );

int main( int argc, char const *argv[] ){
	unsigned int x;
	scanf( " %u", &x );

	printf( "%d\n", quad_fat( x, 2*x ) );

	return 0;
}

int quad_fat( int n, int teto ){
	if( n+1 >= teto ) return n+1;
	return (n+1) * quad_fat( n + 1, teto );
}
