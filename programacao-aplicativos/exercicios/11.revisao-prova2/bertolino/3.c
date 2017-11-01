#include <stdio.h>
#include <math.h>

unsigned long long int sf( unsigned long long int n );

int main( int argc, char const *argv[] ){
	unsigned int x;
	scanf( " %u", &x );
	printf( "%llu\n", sf( x ) );

	return 0;
}
/*

*** Modelo ágil : Manipulação matemática na vertical ***

int sf( int n ){
	static int k = 0;
	if( ++k >= n ) return 1;
	return pow( n-k+1, k ) * sf( n );
}
*/

/*
*** Modelo passo-a-passo : Manipulação do maior fatorial até o menor ***
*/

unsigned long long int sf( unsigned long long int n ){
	static unsigned long long int k = 0;
    if(k>0) return k-- * sf( n );
    if(n>0) return n * sf( k = n-1 );
    return 1;
}

/*
sf(3)

1 *
1 * 2 *
1 * 2 * 3 


n * (n-1)² * (n-2)³

(n - k)⁽k⁺¹⁾
*/

