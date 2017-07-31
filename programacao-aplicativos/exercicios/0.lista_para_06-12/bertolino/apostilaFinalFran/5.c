# include <stdio.h>

int main( void ){

    int age,i,dias;
    printf( "Idade no formato (anos meses dias), ex. 20 1 5 .\nZeros à frente de x para | 0 <= x <= 9 | não interferem no resultado.\n" );
    for( i = 0 ; i < 3 ; ++i ){
        scanf( " %d" , &age );
        switch( i ){
            case 0:
                dias = age * 365;
                continue;
            case 1:
                dias += age*30;
                continue;
            case 2:
                dias += age;
                continue;
            default:
                continue;
        }
    }
    printf( "O total de dias de vida é: %d\n" , dias );

    return 0;
}
