# include "../string.variavel.h"

typedef struct{
    unsigned int idade;
    char *sexo;
    float salario;
    unsigned int filhos;
} cidadao;

void pega_cidadao( cidadao *pessoa ){
    printf( "\nDigite a idade do cidadao: " );
    scanf( "%u" , &pessoa->idade );
    printf( "\nDigite o sexo do cidadao: " );
    pegastr( &pessoa->sexo );
    printf( "\nDigite o salario do cidadao: " );
    scanf( " %f" , &pessoa->salario );
    printf( "\nDigite o numero de filhos do cidadao" );
    scanf( " %u" , &pessoa->filhos );
}

void mostra_cidadao( cidadao *pessoa ){
    printf( "\nO cidadao possui %u anos, é do sexo %s, ganha %f reais e possui %u filhos!\n" , pessoa->idade , pessoa->sexo , pessoa->salario , pessoa->filhos );
}

int main(void){

    cidadao pessoa1 , pessoa2;

    pega_cidadao( &pessoa1 );
    pega_cidadao( &pessoa2 );
    mostra_cidadao( &pessoa1 );
    mostra_cidadao( &pessoa2 );

    return 0;
}
