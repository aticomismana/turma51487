#include <stdio.h>

void fibonacci( int pos , int act , int ant );

int main(void){
	
	int n;
	scanf( "%d" , &n );
	
	printf( "A serie fibonacci ate o N-esimo numero e:" );
	fibonacci( n , 1 , 0 );
	
	return 0;
}

void fibonacci( int pos , int act , int ant ){

	printf( " %d" , ant );
	
	if ( pos <= 1 ) return;
	
	fibonacci( pos - 1 ,  act + ant , act );
	return;
}