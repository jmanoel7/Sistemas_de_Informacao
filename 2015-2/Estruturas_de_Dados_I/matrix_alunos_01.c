#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAXSTR 100

int main(void) {
    /* Inicio do Programa */

    /* Declaracoes de Variaveis */
    int i=0, nAlunos;
    float mediaTurma=0.0, mediaAluno=0.0, menorMedia=0.0, maiorMedia=0.0;
    char maiorAluno[MAXSTR], menorAluno[MAXSTR];
    printf("\nInforme o numero de alunos: ");
    scanf("%d", &nAlunos);
    char vAlunos[nAlunos][3][MAXSTR];

    /* Entrada de Dados */
    for (i = 0; i < nAlunos; i++) {
        printf("\nNome=");
        scanf("%s", &vAlunos[i][0]);
        printf("N1=");
        scanf("%s", &vAlunos[i][1]);
        printf("N2=");
        scanf("%s", &vAlunos[i][2]);
        mediaTurma += ((strtof(vAlunos[i][1], NULL) + strtof(vAlunos[i][2], NULL)) / (float) 2.0);
    }
    mediaTurma /= nAlunos;
    menorMedia = mediaTurma;
    maiorMedia = mediaTurma;

    /* Processamento de Dados */
    for (i = 0; i < nAlunos; i++) {
        mediaAluno = (strtof(vAlunos[i][1], NULL) + strtof(vAlunos[i][2], NULL)) / (float) 2.0;
        if ( mediaAluno < menorMedia ) {
            menorMedia = mediaAluno;
            strcpy(menorAluno, vAlunos[i][0]);
        }
        if ( mediaAluno > maiorMedia ) {
            maiorMedia = mediaAluno;
            strcpy(maiorAluno, vAlunos[i][0]);
        }
    }

    /* Saida de Dados */
    printf("\nMedia da Turma:\n    %.2f\n", mediaTurma);
    printf("\nMenor Media da Turma:\n    %s    %.2f\n", menorAluno, menorMedia);
    printf("\nMaior Media da Turma:\n    %s    %.2f\n\n", maiorAluno, maiorMedia);

    /* Fim do Programa */
    return 0;
}
