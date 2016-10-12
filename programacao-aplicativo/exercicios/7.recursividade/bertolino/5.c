#include <stdio.h>

void tetranacci( long long int pos , long long int n1 , long long int n2 , long long int n3 , long long int n4 );

int main( void ){

	long long int enesimo;

	scanf( "%lli" , &enesimo );

	printf( "A sequência tetranacci até o %lli-ésimo termo é:" , enesimo );

	tetranacci( enesimo , 0 , 0 , 0 , 1 );

	printf( "\n" );

	return 0;
}


void tetranacci( long long int pos , long long int n1 , long long int n2 , long long int n3 , long long int n4 ){

 	printf( " %lli" , n1 );

	if( pos <= 1 ) return;
	return tetranacci( pos - 1 , n2 , n3 , n4 , n1 + n2 + n3 + n4 );

}
