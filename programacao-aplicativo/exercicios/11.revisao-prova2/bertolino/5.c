#include "../../string.variavel.h"
#include <string.h>

unsigned int qtd;
typedef struct{
	char *nome, *endereco, *telefone;
} PESSOA;

void reordena( PESSOA *vet );
void troca_pal( char **pal1, char **pal2 );

int main( int argc, char const *argv[] ){

	PESSOA *lista;

	scanf( " %u", &qtd );
	lista = malloc( qtd * sizeof( PESSOA ) );


	for(int i = 0; i < qtd; ++i){
		pegastr( &(lista[i].nome) );
		pegastr( &(lista[i].endereco) );
		pegastr( &(lista[i].telefone) );
	}

	reordena( lista );

	for(int i = 0; i < qtd; ++i){
		printf( "ID: %d\n", i+1 );
		printf( "Nome: %s\n", lista[i].nome );
		printf( "Endereco: %s\n", lista[i].endereco );
		printf( "Telefone: %s\n", lista[i].telefone );
		printf( "\n" );
	}

	free( lista );
	return 0;
}

void reordena( PESSOA *vet ){
	int n = qtd - 1;
	while( n > 0 ){
		for(int i = 0; i < n; ++i){
			if( strcmp( vet[i].nome, vet[i+1].nome ) > 0 )
				troca_pal( &vet[i].nome, &vet[i+1].nome ),
				troca_pal( &vet[i].endereco, &vet[i+1].endereco ),
				troca_pal( &vet[i].telefone, &vet[i+1].telefone );
		}
		--n;
	}

}

void troca_pal( char **pal1, char **pal2 ){
	char *aux;

	aux = *pal1;
	*pal1 = *pal2;
	*pal2 = aux;

}

