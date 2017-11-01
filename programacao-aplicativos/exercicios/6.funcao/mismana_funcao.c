
#include<stdio.h>
#include<math.h>

// -----------------------------------------------------------
void verificaPosNeg(int value2){
	if(value2>=0){
		printf("o valor eh positivo!\n");
	} else{
		printf("o valor eh negativo!\n");
	}
}

void questao1(){

	int value1;
	printf("Informe um valor inteiro positivo ou negativo: ");
	scanf("%d", &value1);
	
	verificaPosNeg(value1);	
}

// -----------------------------------------------------------
void verificaNulo(int value2){
	if(value2==0){
		printf("o valor eh nulo!\n");
	} else{
		printf("o valor nao eh nulo!\n");
	}
}

void questao2(){

	int value1;
	printf("Informe um valor inteiro: ");
	scanf("%d", &value1);
	
	verificaNulo(value1);	
}

// -----------------------------------------------------------
float calcularDelta(float *valores){
	return ( pow(valores[1],2)-(4*valores[0]*valores[2]) );
}

void questao3(){
	char letras[4]={'a','b','c','\0'};
	float delta, valores[3];
	int i;
	
	for(i=0;i<3;i++){
		printf("Informe o valor de %c: ",letras[0]);
		scanf("%f", &valores[i]);		
	}
	
	delta=calcularDelta(&valores);
	printf("O valor do binomio discriminante (delta) eh %.2f\n",delta);	
}

// -----------------------------------------------------------
void calcularEquacao2(float delta){
	if(delta){
		
	} else{
		
	}
}

void questao4(){
	
	char letras[4]={'a','b','c','\0'};
	float delta, valores[3];
	int i;
	
	for(i=0;i<3;i++){
		printf("Informe o valor de %c: ",letras[0]);
		scanf("%f", &valores[i]);		
	}
	
	delta=calcularDelta(&valores);
	
	calcularEquacao2(delta);
}

// -----------------------------------------------------------

int main(){
	
	//questao1();
	//questao2();
	//questao3();
	questao4();
	
	return 0;
}

// -----------------------------------------------------------
