#include <stdio.h>
#include <stdlib.h>
#include <locale.h>


int main(){

	setlocale(LC_ALL,"Portuguese");

	int x,y,linhas1,linhas2,col1,col2,igual = 0;

	/*Requisição das linhas e colunas.*/

	printf("Digite a quantidade de linhas para a matriz 1 : ");
	scanf("%d",&linhas1);
	printf("\n\n");

	printf("Digite a quantidade de colunas para a matriz 1 : ");
	scanf("%d",&col1);
	printf("\n\n");

	printf("Digite a quantidade de linhas para a matriz 2 : ");
	scanf("%d",&linhas2);
	printf("\n\n");

	printf("Digite a quantidade de colunas para a matriz 2 : ");
	scanf("%d",&col2);
	printf("\n\n");

	int m1[linhas1][col1],m2[linhas2][col2];

	/*Obtenção dos valores das matrizes.*/

	for (x=0;x < linhas1;x++)
		for (y=0;y<col1;y++){
			printf("Digite o valor para a posição [%d] X [%d] da matriz 1 : ",x,y);
			scanf("%d",&m1[x][y]);
			printf("\n");
		}

	for (x=0;x < linhas2;x++)
		for (y=0;y<col2;y++){
			printf("Digite o valor para a posição [%d] X [%d] da matriz 2 : ",x,y);
			scanf("%d",&m2[x][y]);
			printf("\n");
		}

	/*Comparação do tamanho das matrizes e verificação da igualdade dos valores.*/

	if (linhas1 == linhas2 && col1 == col2){
		printf("O tamanho das duas matrizes são iguais.\n\n");
		for (x=0;x < linhas1;x++)
			for (y=0;y<col1;y++){
				if (m1[x][y] == m2[x][y]){
					igual+= 1;
				}
			}

	}else{
		printf("O tamanho das duas matrizes são diferentes.\n\n");
	}

	/*Verificação final dos valores.*/

	if (igual == linhas1 * col1){
		printf("Os valores das duas matrizes são iguais.\n\n");
	}

    system("Pause");

}
