#include <stdio.h>

#define MAX 100
#define FALSE 0
#define TRUE  1

int main() {

  int n,         /* comprimento da sequencia dada    */ 
      i, j,
      m,         /* comprimento do segmento repetido */
      seq[MAX],  
      achou;     

  printf("Digite o comprimento da sequencia: ");
  scanf("%d", &n);
  printf("Digite uma sequencia de %d inteiros: ", n);
  for (i = 0; i < n; i++)
    scanf("%d", &seq[i]);

  achou = FALSE;

  for (m = 1; !achou && m <= n/2; m++) {
    /* procura dois segmentos iguais de comprimento m consecutivos */
    for (i = 0; !achou && i <= n-2*m; i++) {
      /* i indica o inicio do primeiro segmento        */
      /* testa se os dois segmentos sao de fato iguais */
      achou = TRUE;
      for (j = 0; achou && j < m; j++) 
	if (seq[i+j] != seq[i+m+j])
	  achou = FALSE;
    }
  }

  if (achou) {
    printf("Sim, existem dois segmentos iguais consecutivos.\n");
    printf("Tome, por exemplo, i = %d e m = %d.\n", i-1, m-1);
  }
  else
    printf("Nao, nao existem dois segmentos iguais consecutivos.\n");

  return 0;
}
