#include <stdio.h>

unsigned int i ;
int main(void){

    void hanoi( unsigned int n , char Ori , char Dest , char Aux );
    unsigned int Ndiscos;

    scanf( "%u" , &Ndiscos );

    hanoi( Ndiscos , '1' , '2' , '3' );
    printf( "Número total de movimentos: %u\n" , i );

    return 0;
}

void hanoi( unsigned int n , char Ori , char Dest , char Aux ){
    if( n <= 1 ){
        printf( "Movendo disco %u do pilar %c para o %c\n" , n , Ori , Dest);
        ++i;
    }else{
        hanoi( n - 1 , Ori , Aux , Dest );
        printf( "Movendo disco %u do pilar %c para o %c\n" , n , Ori , Dest );
        ++i;
        hanoi( n - 1 , Aux , Dest , Ori );
    }
}
