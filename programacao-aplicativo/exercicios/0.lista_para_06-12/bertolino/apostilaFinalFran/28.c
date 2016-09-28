# include "string.variavel.h"
# define n 15

int main(void){

    double x; unsigned short int i , j;

    typedef struct {
        double num;
        int qtd;
        int pos[15];
    } valorQtd;

    valorQtd padrao = { 0 , -1 , { 0 } };

    valorQtd *salvos = malloc( n * sizeof( valorQtd ) );
    for( i = 0 ; i < n ; ++i ) salvos[i] = padrao;

    void pesquisa_valor( double num ){
        for( i = 0 ; i < n ; ++i ){
            if( salvos[i].num == num && salvos[i].qtd != -1 ){
                ++salvos[i].qtd;
                salvos[i].pos[salvos[i].qtd-1] = j+1;
                break;
            }else{
                if( salvos[i].num == 0 && salvos[i].qtd == -1 ){
                    salvos[i].num = num;
                    salvos[i].qtd = 1;
                    salvos[i].pos[0] = j+1;
                    break;
                }
            }
        }
    }

    for( j = 0 ; j < n ; ++j ) {
        scanf( " %lf" , &x );
        pesquisa_valor( x );
    }

    for( i = 0 ; i < n ; ++i ) if( salvos[i].qtd != -1 ) { printf( "\nO número %10.2f ocorre nas posições: " , salvos[i].num ) ; for( j = 0 ; j < salvos[i].qtd ; ++j ) printf( "%2d " , salvos[i].pos[j] ) ; };


    return 0;
}
