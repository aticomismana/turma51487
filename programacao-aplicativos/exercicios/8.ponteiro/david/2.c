#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

main(){
    float a[] = {1.1, 1.2, 1.3, 1.4, 1.5, 1.6, 1.7, 1.8, 1.9, 2.0, 2.1};
    int i;
    float *pont;
    
    for(i = 0; i<10; i++){
          pont = &a[i];
          printf("Posição da array de float %d tem valor %d.\n", i+1, pont);
    }
    system("PAUSE");
}
