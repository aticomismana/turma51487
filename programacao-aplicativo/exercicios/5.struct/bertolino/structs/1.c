#include "../string.variavel.h"

typedef struct{
    char *nome;
    char *disciplina;
    struct {
        float nota1;
        float nota2;
    } nota;
} boletim;

void pega_aluno( boletim *actbol ){
    printf( "\nDigite o nome do aluno: " );
    pegastr( &actbol->nome );
    printf( "\nDigite o nome da disciplina: " );
    pegastr( &actbol->disciplina );
    printf( "\nDigite, respectivamente, a primeira e segunda nota: " );
    scanf( " %f" , &actbol->nota.nota1 );
    scanf( " %f" , &actbol->nota.nota2 );
    printf( "Teste" );
}

void mostra_aluno( boletim *actbol ){
    printf( "\nO aluno %s matriculado na disciplina %s obteve nota final: %f!\n" , actbol->nome , actbol->disciplina , ( actbol->nota.nota1 + actbol->nota.nota2 ) / 2 );
}

int main(void){

    void pega_aluno( boletim *actbol );
    void mostra_aluno( boletim *actbol );

    boletim alunao;/*
    boletim *aluno1;
    aluno1 = &alunao;*/

    pega_aluno( &alunao );
    printf( "Teste" );
    printf( "%s %s %f %f" , aluno1->nome , aluno1->disciplina , aluno1->nota.nota1 , aluno1->nota.nota2 );/*
    mostra_aluno( aluno1 );*/

    return 0;
}
