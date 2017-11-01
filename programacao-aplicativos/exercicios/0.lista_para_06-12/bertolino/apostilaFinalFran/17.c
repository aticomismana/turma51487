# include "string.variavel.h"

int main( void ){

    float preco;
    unsigned int qtd;
    char *nome;

    pegastr( &nome );
    scanf( "%u %f" , &qtd , &preco );

    printf( "Valor total do produto %s: %.2f\n" , nome , qtd*preco );

    if( qtd <= 5 ){
        printf( "\tDesconto total: %.2f\n\tTotal a pagar: %f\n" , qtd*preco*0.02 , qtd*preco*0.98 );
    }else if( qtd <= 10 ){
        printf( "\tDesconto total: %.2f\n\tTotal a pagar: %f\n" , qtd*preco*0.02 , qtd*preco*0.98 );
    }else{
        printf( "\tDesconto total: %.2f\n\tTotal a pagar: %f\n" , qtd*preco*0.02 , qtd*preco*0.98 );
    }

    return 0;
}
