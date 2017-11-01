#include <stdio.h>
#include <stdlib.h>

#define mod( __u ) ( ( __u >= 0.0L ) ? __u : -__u )

#define PRECISAO 18

#define INFP (1.0/0)
#define INFN (-1.0/0)
/*
#define MAXLB 18446744073709551616.0L
#define MINLB -18446744073709551616.0L
*/
#define NaN ( 0.0L / 0.0L )

// A limitação de tamanho está impedindo que valores, que ainda são double, permanecam
//#define passouLB( __y ) ( ( __y >= MAXLB || __y <= MINLB ) ? 1 : 0 )
#define einfinito( __x ) ( ( __x == INFP || __x == INFN ) ? 1 : 0 )
#define enan( __w ) ( ( __w == NaN ) ? 1 : 0 )

#define eLB( __v ) ( (/* passouLB( __v ) == 0 &&*/ einfinito( __v ) == 0 && enan( __v ) == 0 ) ? 1 : 0 )

#define e( __n ) ( potencia( 1.0e1L , __n ) )

#define RESTO_PRECISO ( e( -PRECISAO ) )

long double elevacao( long double k , long double n );
long double potencia( long double k , long long int n );
long double radiciacao( long double k , long long int n );
long double procuraProximo( long double k , long long int n );
long double limpaDecimal( long double m , long double mTeste , unsigned int *virgula );

unsigned int einteiro( long double __x , int linha ){
	long double resto; long long int inteiro;

	inteiro = (long long int) __x / 1;
	resto = __x - inteiro;

	if( mod( resto ) <= mod( RESTO_PRECISO ) ) return 1;
	return 0;
}


int main(void){

	long double k , n;

	scanf( "%LF %LF" , &k , &n );

	printf( "%Lg elevado a %Lg resulta em: %+Lg\n" , k , n , elevacao( k , n ) );

	return 0;
}

long double limpaDecimal( long double m , long double mTeste , unsigned int *virgula ){

	static unsigned int passadas = 0;

	if( einteiro( m , __LINE__ ) == 0 && eLB( mTeste ) == 1 && passadas < PRECISAO ) { if( m != mTeste ) *virgula += 1; ++passadas; return limpaDecimal( mTeste , mTeste * e( 1.0L )  , virgula ); }
	if( eLB( m ) == 0 ) fprintf(stderr, "O número excedeu os limites do bom senso.\nAcho melhor ser justo.\n" ) , exit(1);
	passadas = 0;
	return m;
}

long double elevacao( long double k , long double n ){

	long double base; unsigned int indice = 0;

	if( einteiro( n , __LINE__ ) == 1 ) return potencia( k , n );

	n = limpaDecimal( n , n , &indice );

	if( indice >= 5 ) { printf( "Expoente com casas decimais acima do suportado.\nTenha bom senso\n" ); exit( 1 ); }

	base = radiciacao( k , e( indice ) );

	return potencia( base , n );

}

long double potencia( long double k , long long int n ){

	if( n == 0 ) return 1;

	if( n < 0 ) return (1/k) * potencia( k , n + 1 );

	return k * potencia( k , n - 1 );

}

long double radiciacao( long double k , long long int n ){

	long double raiz , denum; unsigned int iteracao = 0; unsigned short int kNegativo = 0;

	k = limpaDecimal( k , k , &iteracao );

	if( k >= 0 ) raiz = procuraProximo( k , n );
	else raiz = procuraProximo( -k , n ) , kNegativo = 1 , printf( "Base negativa, o resultado não comporta raízes complexas!\n" );

	denum = procuraProximo( e( iteracao ) , n );

	return ( kNegativo == 1 ) ? -(raiz /= denum) : (raiz /= denum) ;

}

long double procuraProximo( long double k , long long int n ){

	static unsigned int passo = 0; static long double val = 1 , i = 0;
	long double pot = potencia( i , n );

	if( eLB( pot ) == 1 && passo < PRECISAO ){	
		if( pot >= k ){
			i-=val; val= 1/e( ++passo ); return procuraProximo( k , n );
		}else{
			i+= val; return procuraProximo( k , n ); }
	}else{ long double resp = i; passo = i = 0; val = 1; return resp;}

}
