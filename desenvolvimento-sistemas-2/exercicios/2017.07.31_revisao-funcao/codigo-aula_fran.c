// importacao de bibliotecas
// -------------------------------------------
#include <stdlib.h>
#include <string.h>

// prototipo das funcoes
// -------------------------------------------
char* classificarIMC(float imc);
char* calcularIMC(float peso, float altura);
void calcularImcGuiDesktop();

// metodo principal
// -------------------------------------------
void main(){
	// funcao para interface Desktop
	calcularImcGuiDesktop();
	
	//funcao para interface Web
	//TO-DO
	
	//funcao para interface Mobile
	//TO-DO
	
	// chamada sem cLitério de interface
	//printf("%s", calcularIMC(70, 1.64) );
	
	getchar(); // em substituíção a SYSTEM("PAUSE");
}


//funcoes gerais
// -------------------------------------------
char* calcularIMC(float peso, float altura){
	float imc = peso/pow(altura,2);
	return classificarIMC(imc);
}

char* classificarIMC(float imc){
	
	/* Tabela IMC
	Abaixo de 17		Muito abaixo do peso
	Entre 17 e 18,49	Abaixo do peso
	Entre 18,5 e 24,99	Peso normal
	Entre 25 e 29,99	Acima do peso
	Entre 30 e 34,99	Obesidade I
	Entre 35 e 39,99	Obesidade II (severa)
	Acima de 40			Obesidade III (mórbida)	*/

	char *cIMC; cIMC = calloc(100, sizeof(char));
	if (imc < 17.00){
		strcpy(cIMC, "Muito abaixo do peso");
	} else if (imc>=17 && imc<= 18.49){
		strcpy(cIMC,"Abaixo do peso");
	} else if (imc>=18.5 && imc<=24.99){
		strcpy(cIMC, "Peso normal");	
	} else if(imc>=25 && imc<=29.99){
		strcpy(cIMC,"Acima do peso");	
	} else if (imc>=30 && imc<=34.99){
		strcpy(cIMC, "Obesidade I");
	} else if (imc>=35 && imc<=39.99){
		strcpy(cIMC,"Obesidade II (severa)");
	} else {	// imc > 40
		strcpy(cIMC,"Obsidade III (mórbida)");
	}

	return cIMC;
}


//funcoes gui
// -------------------------------------------
void calcularImcGuiDesktop(){
	float peso;
	float altura, imc;
	
	printf("Informe o peso: ");
	scanf("%f",&peso);
	
	printf("Informe a altura: ");
	scanf("%f",&altura);
	
	printf("\nResultado do seu IMC: %s\n", calcularIMC(70, 1.64) );
}
