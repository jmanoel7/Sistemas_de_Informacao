#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAXSTR 100

struct sTurma {
    char nome[MAXSTR];
    float N1, N2;
    struct sTurma *prox;
};

typedef struct sTurma _sTurma;

int main(void) {
    /* Inicio do Programa */

    /* Declaracoes de Variaveis */
    _sTurma *pTurma, *iTurma, *aTurma;
    int i=0, nAlunos;
    float mediaTurma=0.0, mediaAluno=0.0, menorMedia=0.0, maiorMedia=0.0;
    char maiorAluno[MAXSTR], menorAluno[MAXSTR];

    /* Entrada de Dados */
    printf("\nInforme o numero de alunos: ");
    scanf("%d", &nAlunos);
    iTurma = (_sTurma *) malloc( sizeof(_sTurma) );
    iTurma->prox = NULL;
    pTurma = iTurma;
    for (i = 0; i < nAlunos; ++i) {
        aTurma = pTurma;
        printf("\nREGISTRO %d:\n", i+1);
        printf("Nome=");
        scanf("%s", pTurma->nome);
        printf("N1=");
        scanf("%f", &pTurma->N1);
        printf("N2=");
        scanf("%f", &pTurma->N2);
        mediaTurma += ((pTurma->N1 + pTurma->N2) / (float) 2.0);
        pTurma = (_sTurma *) malloc( sizeof(_sTurma) );
        pTurma->prox = NULL;
        aTurma->prox = pTurma;
    }
    free( pTurma );
    pTurma = NULL;
    aTurma->prox = NULL;

    /* Processamento de Dados */
    mediaTurma /= ((float) nAlunos);
    menorMedia = mediaTurma;
    maiorMedia = mediaTurma;
    pTurma = iTurma;
    while ( pTurma != NULL) {
        mediaAluno = (pTurma->N1 + pTurma->N2) / (float) 2.0;
        if ( mediaAluno < menorMedia ) {
            menorMedia = mediaAluno;
            strcpy(menorAluno, pTurma->nome);
        }
        if ( mediaAluno > maiorMedia ) {
            maiorMedia = mediaAluno;
            strcpy(maiorAluno, pTurma->nome);
        }
        pTurma = pTurma->prox;
    }

    /* Saida de Dados */
    printf("\nMedia da Turma:\n    %.2f\n", mediaTurma);
    printf("\nMenor Media da Turma:\n    %s    %.2f\n", menorAluno, menorMedia);
    printf("\nMaior Media da Turma:\n    %s    %.2f\n\n", maiorAluno, maiorMedia);

    /* Fim do Programa */
    return 0;
}
