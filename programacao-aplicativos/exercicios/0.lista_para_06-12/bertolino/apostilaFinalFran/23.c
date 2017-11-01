# include "string.variavel.h"

int main(void){

    unsigned long int n , seq[3] = { 0 , 1 , 0 };

    scanf( "%lu" , &n );

    for(  ; n > 0 ; --n ) seq[2] = seq[1] + seq[0] , printf( "%lu\n" , seq[0] ) , seq[0] = seq[1] , seq[1] = seq[2];



    return 0;
}
