# include "../string.variavel.h"

int main(void){

    unsigned int i;
    float mediaPag=0;
    typedef struct{
        char *titulo;
        int ano;
        unsigned int pag;
        float preco;
    } livro;
    livro lista[5];

    for( i = 0 ; i < 5 ; ++i ){
        printf( "%u -> Titulo " , i );
        pegastr( &lista[i].titulo );
        printf( "%u -> Ano " , i );
        scanf( "%d" , &lista[i].ano );
        printf( "%u -> Paginas " , i );
        scanf( "%u" , &lista[i].pag );
        printf( "%u -> Preco " , i );
        scanf( "%float" , &lista[i].preco );
        mediaPag += lista[i].preco;
    }
    printf( "A média do total de livros é: %f\n" , mediaPag / 5 );


    return 0;
}
