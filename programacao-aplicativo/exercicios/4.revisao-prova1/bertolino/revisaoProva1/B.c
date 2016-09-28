# include <stdio.h>
# include <locale.h>

int main(void){
	int i=0,j=0,none=0,verificar=0,vet[5],pos[5];
	for( i = 0 ; i < 5 ; ++i ){
		scanf( " %d" , &vet[i] );
	}
	scanf( "%d" , &verificar );
	for( i = 0 ; i < 5 ; ++i ){
		if( vet[i] == verificar ) {
			pos[j] = i;
			++j;
		}else{
			++none;
		}
	}
	if ( none == 5 ){
		printf( "\nValor inexistente!\n" );
	}else{
		printf( "Se encontra na: " );
		for( i = 0 ; i < j ; ++i ){
			printf( " pos. %d", pos[i] + 1 );
		}
	}
	return 0;
}
