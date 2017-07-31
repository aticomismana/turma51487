#include "../string.variavel.h"

typedef struct{
    char *nome;
    char *autor;
    unsigned int cod;
} biblioteca;

void pega_livro( biblioteca *livro ){
    printf( "\nDigite o nome do livro: " );
    pegastr( &livro->nome );
    printf( "\nDigite o nome do autor: " );
    pegastr( &livro->autor );
    printf( "\nDigite o código do livro: " );
    scanf( "%u" , &livro->cod );
}

void mostra_livro( biblioteca *livro ){
    printf( "\nO livro %s do autor %s possui código: %u!\n" , livro->nome , livro->autor , livro->cod );
}
int main(void){

    void pega_livro( biblioteca *livro );
    void mostra_livro( biblioteca *livro );

    biblioteca livro1 , livro2;
    pega_livro( &livro1 );
    pega_livro( &livro2 );
    mostra_livro( &livro1 );
    mostra_livro( &livro2 );

    return 0;
}
