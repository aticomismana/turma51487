# include <stdio.h>
# include <locale.h>

double soma( double val1 , double val2 ){
	return printf( "\nO valor da soma entre %.2f e %.2f é: %.2f\n" , val1 , val2 , ( val1 + val2 ) );
}
double subtracao( double val1 , double val2 ){
	return printf( "\nO valor da subtração entre %.2f e %.2f é: %.2f\n" , val1 , val2 , ( val1 - val2 ) );
}
double produto( double val1 , double val2 ){
	return printf( "\nO valor do produto entre %.2f e %.2f é: %.2f\n" , val1 , val2 , ( val1*val2 ) );
}
double divisao( double val1 , double val2 ){
	return ( val2 != 0 ) ? printf( "\nO valor da divisão entre %.2f e %f é: %.2f\n" , val1 , val2 , ( val1/val2 ) ) :
		printf( "\nOs números digitados foram: %.2f, %.2f, porém, na divisão, não é aceito divisão com denominador nulo (%.2f)!\n" , val1 , val2 , val2 );
}

int pegaValor(){
	double num1, num2; char operacao; short int verifyOperacao;
	printf( "\nDigite os dois valores: " );
	scanf( "%lf %lf" , &num1 , &num2 );
	do{
		fflush( stdin );
		verifyOperacao = 1;
		printf( "\nQual a sua operação? ( + , - , * , / ): " );
		scanf( "%c" , &operacao );
		switch( operacao ){
			case '+':
				return soma( num1 , num2 );
			case '-':
				return subtracao( num1 , num2 );
			case '*':
				return produto( num1 , num2 );
			case '/':
				return divisao( num1 , num2 );
			default:
				printf( "\nOperação desconhecida!\n" );
				verifyOperacao = 0;
		}
	}while( verifyOperacao == 0 );
}

int main(void){
	setlocale( LC_ALL , "Portuguese" );
	char desejo;
	printf( "Olá, usuário!\nBem vindo à sua calculadora virtual!\n" );
	do{
		printf( "\nDeseja continuar a calcular? (digite S ou N): " );
		scanf( "%c" , &desejo );
		if( desejo == 'S' , 's' ) pegaValor();
	}while( desejo != 'N' , 'n' );

	return 0;
}
