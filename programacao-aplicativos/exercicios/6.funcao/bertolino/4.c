# include <stdio.h>
# define positivo(a) ( ( a >= 0 ) ? 1 : 0 ) /*UTILIZEI >= POIS DELTA NULO NÃO DETERMINA RAÍZES COMPLEXAS, APENAS DETERMINA QUE AS DUAS RAÍZES SERÃO IGUAIS! */
# define nulo(a) ( ( a != 0 ) ? 1 : 0 )
# define delta( a , b ,c ) ( b*b - 4*a*c)

int main( void ){
    int calcula_raiz( float a , float b , float c);
    float a , b , c ; int i;
    scanf( "%f" , &a );
    scanf( "%f" , &b );
    scanf( "%f" , &c );
    i = calcula_raiz( a , b , c );
    ( i == 1 ) ? printf( "Calculado com sucesso!\n" ) : printf( "Cálculo falho!\n" );
    return 0;
}

int calcula_raiz( float a , float b , float c){
    float DELTA;
    if( nulo(a) == 0 ){ printf( "Não é do 2º grau!\n" ); return 0;}
    DELTA = delta( a , b , c );
    if( positivo( DELTA ) == 1 ){
        printf( "As raízes são: %.2f e %.2f\n" , ( -b + DELTA ) / 2*a , ( -b - DELTA ) / 2*a );
    }else{
        printf( "As raízes são: %.2f + i%.2f e %.2f -i%.2f\n" ,
        -b/2*a , DELTA/2*a , -b/2*a , DELTA/2*a );
    }
    return 1;
}
