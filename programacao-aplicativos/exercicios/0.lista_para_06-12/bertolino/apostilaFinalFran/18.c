# include "string.variavel.h"
# define ACT_YEAR 2016

int main( void ){

    char *codigo; int ano_nasc , ano_admiss;

    pegastr( &codigo );

    scanf( " %d %d" , &ano_nasc , &ano_admiss );

    printf( "Funcionário %s,\nPossui, em anos, idade %d e tempo de serviço: %d\n" , codigo , ACT_YEAR - ano_nasc , ACT_YEAR - ano_admiss );

    if( ( ACT_YEAR - ano_nasc >= 65 ) || ( ACT_YEAR - ano_admiss >= 30 ) || ( ( ACT_YEAR - ano_nasc >= 60 ) && ( ACT_YEAR - ano_admiss >= 25 ) ) ){
        printf( "Requerer aposentadoria\n" );
    }else{
        printf( "Não requerer\n" );
    }

    return 0;
}
