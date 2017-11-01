# include <stdio.h>

int main( void ){

    float salario , novo_salario;

    scanf( "%f" , &salario );

    if( salario <= 500 ){
        novo_salario = salario * 1.15;
    }else if( salario <= 1000 ){
        novo_salario = salario * 1.10;
    }else{
        novo_salario = salario * 1.05;
    }
    printf( "%.2f" , novo_salario );

    return 0;
}
