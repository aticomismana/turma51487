# include "string.variavel.h"
# include <string.h>

int main(void){

    char *nomes[10] = { NULL } , *pesquisa = NULL ; unsigned short int i;

    for( i = 0 ; i < 10 ; ++i ) pegastr( &nomes[i] );

    pegastr( &pesquisa );

    for( i = 0 ; i < 10 ; ++i ) if( strcmp( nomes[i] , pesquisa ) == 0 ){ printf( "Achei\n" ); break; } else if( i == 9 ){ printf( "Não achei\n" ); } ;

    return 0;
}

