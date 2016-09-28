# include <stdio.h>

int main( void ){

    unsigned int tot, nul, bra, val;
    scanf( "%u" , &tot );
    scanf( "%u" , &nul );
    scanf( "%u" , &bra );
    scanf( "%u" , &val );

    printf( "O total de eleitores: %u\n\tNulos: %.2f%%\n\tBrancos: %.2f%%\n\tVálidos: %.2f%%\n" , tot , (float) nul / tot * 100 , (float) bra / tot * 100 , (float) val / tot * 100 );

    return 0;
}
