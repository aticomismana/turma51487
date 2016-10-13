#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int funcao3(int x,int y){

}

main(){
    setlocale(LC_ALL,"portuguese");
    int a[5], i, *pa;
    for(i = 0; i <5; i++){
          printf("Digite o %dº valor para sua array.\n", i+1);
          scanf("%d", &a[i]);
          pa = &a[i];
          printf("O resultado da multiplicação por ele mesmo é de: %d.\n", ((*pa)*(*pa)));
    }
    
    system("PAUSE");
}
