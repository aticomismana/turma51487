#include <stdio.h>
#include <math.h>

int inversor( int num );

int main(void){

	int n;
	scanf("%d",&n);
	
	printf( "O valor %d invertido é: %d\n" , n , inversor(n) );
	
	return 0;
}

int inversor( int num ){

	static int pos = 0;
	
	if( num / 10 == 0 ) { ++pos; return num; }
		
	return inversor( num / 10 ) +  ( num % 10 ) * pow( 10 , pos++ ) ;
	
}