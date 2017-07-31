# include "string.variavel.h"

int main(void){

    char *palavrao , *torrada;

    pegastr( &palavrao );

    pegastr( &torrada );

    printf( "%s\n%s" , palavrao , torrada );

    pegastr( &palavrao , 15 );
    printf( "%s\n" , palavrao );

    return 0;
}
