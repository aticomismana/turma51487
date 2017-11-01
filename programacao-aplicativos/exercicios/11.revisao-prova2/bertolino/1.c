#include <stdio.h>

int multip_rec( int n1, int n2 );

int main(int argc, char *argv[]){
	int x,y,result;
	scanf("%d %d", &x, &y);

	result = multip_rec(x,y);

	printf("%d\n", result );
	return 0;
}

int multip_rec( int n1, int n2 ){

	if(!n2) return 0;
	return n1 + multip_rec( n1, n2-1 );

}
