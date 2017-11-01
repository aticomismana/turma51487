# include <stdio.h>
# include <stdlib.h>

int main( void ){
    int n , i , j , k , l = 0 , m ; double *seq ;
    scanf( "%d" , &n );/* Determina o tamanho da sequência principal */
    seq = malloc( n * sizeof( double ) );/* Alocação de memória dinâmica para o vetor */

    for ( i = 0 ; i < n ; ++i ) scanf( " %lf" , &seq[i] );/* Inserção dos valores em cada bloco de memória do vetor */
    for ( k = n / 2 ; k >= 2 ; --k ) {/* Iteração que determina o tamanho da sub-sequência, baseado no arredondamento pra baixo, caso a divisão entre n / 2 não seja inteira */
        for ( m = 0 ; m <= n - ( 2 * k ) ; ++m , l = 0 ) {/* Iteração que determina o início, dentro da sequência principal, da primeira sub-sequência */
            for ( i = m , j = m + k ; i < m + k && j < m + ( 2 * k ) ; ++i , ++j ) if ( seq[i] == seq[j] ) {/* Iteração que avalia os valores, respectivos, das duas sub-sequências consecutivas e determina uma variável que detecta sua positividade */
                ++l;
            }
            if ( l == k ){/* Após verificada a positividade de toda a comparação das duas sub-sequências, é verificada se os "matches" são em mesma quantidade à variável que determina o tamanho da sub-sequência. Dessa forma, é possível averiguar se toda a comparação das sub-sequências obteve equivalencia */
                printf( "\nA seguinte sub-sequencia " );
                for( i = m ; i < m + k ; ++i ) printf( " %g," , seq[i] );/* Imprime cada um dos valores da sub-sequência cuja qual foi verificada a total equivalência */
                printf( " existe consecutivamentente na sequencia principal!\nSeus valores de I e M são: %d e %d\n" , m + 1 , k );/* Imprime os valores, respectivamente, de posição de início da sequência e de tamanho da sequência */
            }
        }
    }
    return 0;
}
/* *Observação, o código foi restritivo ao tratar qualquer sequência como sendo de menor tamanho possível 2 e, logicamente, de maior tamanho sendo a metade possível dentro da sequência principal. */
