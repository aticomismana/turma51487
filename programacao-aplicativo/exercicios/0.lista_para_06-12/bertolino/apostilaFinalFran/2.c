# include <stdio.h>

int main(void){

    int a , b , temp;

    a = 10;
    b = 20;
    printf( "Valores atuais: A -> %d ; B -> %d\n" , a , b );
    temp = b;
    b = a;
    a = temp;
    printf( "Valores atuais: A -> %d ; B -> %d\n" , a , b );


    return 0;
}
