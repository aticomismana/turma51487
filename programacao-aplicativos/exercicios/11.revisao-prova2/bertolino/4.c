#include <stdio.h>

int catalan( int n );

int main( int argc, char const *argv[] ){
	unsigned int x;
	scanf( " %u", &x );
	printf( "%d\n", catalan( x ) );

	for(int i = 0; i < x; ++i) printf( "%d -> %d\n", i, catalan( i ) );

	return 0;
}

int catalan( int n ){
	if( !n ) return 1;
	return (4*n - 2) * catalan( n - 1 ) / (n + 1);
}