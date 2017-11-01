#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int funcao3(int x,int y){
    int *px = &x, *py = &y, w;
    w = y;
    y = *px;
    px = &w;
    
    printf("Depois da função= Valor de A:%d e B:%d.\n", *px, *py);
}

main(){
    setlocale(LC_ALL,"portuguese");
    int a=2, b=3;        
    printf("Antes da função= Valor de A:%d e B:%d.\n", a, b);
    
    funcao3(a, b);
    system("PAUSE");
}


