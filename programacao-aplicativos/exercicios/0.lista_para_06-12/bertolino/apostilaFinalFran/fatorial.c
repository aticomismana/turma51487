#include <stdio.h>

int main (void){

    int numero;

    int fatorial( int n ){
        if( n <= 1 ){
            return 1;
        }else{
            return  n * fatorial( n - 1 );
        }
    }

    printf( "Caro usuário, nos diga o número para o fatorial: " );
    scanf( "%d" , &numero );

    printf( "O fatorial desse número é: %d" , fatorial( numero ) );

    return 0;
}
