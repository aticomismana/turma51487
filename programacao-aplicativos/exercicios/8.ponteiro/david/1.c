#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

main(){
    int x,y;
    printf("Digite o valor de x!");
    scanf("%d",&x);    
    
    printf("Digite o valor de y!");
    scanf("%d",&y);
    
    int *hi = &x;
    int *ha = &y;

    
    if( hi > ha){
        printf("X com o valor na memoria de %d é o maior!\n", hi);
      
    }
    else{
         printf("Y com o valor na memoria de %d é o maior!\n", ha);
    
    }
    system("PAUSE");
}
int comparacao(){


}    
