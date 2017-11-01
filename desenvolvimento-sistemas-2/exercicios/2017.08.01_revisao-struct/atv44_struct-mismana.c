/*
44- Usando a estrutura fornecida, referente atletas, elabore um programa para ler os dados de 15 atletas de uma equipe,
calcular a média das idades e das alturas, e finalmente, exibir os dados lidos e as duas médias calculadas.

struct TipoAtleta{
	int matricula;
	int idade;
	float altura;
}
*/

#include <stdio.h>
#include <locale.h>

#define QTDATLETAS 2

typedef struct {
	int matricula;
	int idade;
	float altura;
} TipoAtleta;

void inputAtletasGuiDesktop(TipoAtleta* atletas){
	int i;

	for(i=0;i<QTDATLETAS;i++){
		printf("\n-> Cadastro de Atleta:\n");
		
		printf("Informe a matricula: ");
		scanf("%d",&atletas[i].matricula);
		
		printf("Informe a idade: ");
		scanf("%d",&atletas[i].idade);
		
		printf("Informe a altura: ");
		scanf("%f",&atletas[i].altura);
	}
	printf("\n-> Atletas cadastrados com sucesso!\n");
	
}

void calcularMedia(TipoAtleta* atletas, float* mediaIdade, float* mediaAltura){
	int i;
	for(i=0;i<QTDATLETAS;i++){
		*mediaIdade += atletas[i].idade;
		*mediaAltura += atletas[i].altura;
	}
	*mediaIdade/=QTDATLETAS;
	*mediaAltura/=QTDATLETAS;
}

void imprimirAtletasGuiDesktop(TipoAtleta* atletas){
	printf("\n\n-> Relação de Atletas:");
	int i;
	for(i=0;i<QTDATLETAS;i++){
		printf("\n\nMatricula: %d", atletas[i].matricula);
		printf("\nIdade: %d", atletas[i].idade);
		printf("\nAltura: %.2f", atletas[i].altura);
	}	
}

void imprimirMediasGuiDesktop(float* idadeMedia, float* alturaMedia){
	printf("\n\n\n-> Relação de Médias:");
	printf("\nIdade Média: %.2f",*idadeMedia);
	printf("\nAltura Média: %.2f",*alturaMedia);
}

int main(){
	setlocale(LC_ALL, "portuguese");
	TipoAtleta atletas[QTDATLETAS];
	float idadeMedia=0, alturaMedia=0;

	inputAtletasGuiDesktop(atletas);
	calcularMedia(atletas, &idadeMedia, &alturaMedia);
	imprimirAtletasGuiDesktop(atletas);
	imprimirMediasGuiDesktop(&idadeMedia, &alturaMedia);
	
	getchar();
	return 0;
}
