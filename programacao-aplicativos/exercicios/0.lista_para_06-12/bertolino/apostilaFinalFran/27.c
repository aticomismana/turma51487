# include "string.variavel.h"

int main(void){

    double A[10] , M[10] , x; unsigned int i;

    for( i = 0 ; i < 10 ; scanf( " %lf" , &A[i] ) , ++i );

    scanf( " %lf" , &x );

    for( i = 0 ; i < 10 ; M[i] = A[i] * x , printf( " %.2f\n" , M[i] ) , ++i );

    return 0;
}
