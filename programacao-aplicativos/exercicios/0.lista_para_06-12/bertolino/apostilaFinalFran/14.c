# include <stdio.h>

int main( void ){

    float x ;
    scanf( "%f" , &x );

    ( x > 100.0 ) ? printf( "maior do que 100\n" ) : ( x == 100.0 ) ? : printf( "menor do que 100\n" );
    /* *Observação: Como na questão não consta o que imprimir caso o valor seja igual a 100, a expressão de caso verdadeiro do operador ternário interno não foi preenchida. */

    return 0;
}

