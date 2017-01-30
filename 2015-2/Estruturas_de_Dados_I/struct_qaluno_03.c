#include <stdio.h>
#include <stdlib.h>

#define MAX_ALUNOS 30

struct QAluno {
    char nome[100];
    float N1, N2, N3;
    int faltas;
};

int main(void)
{
    /* Inicio do Programa */

    /* Declaracao de Variaveis */
    struct QAluno QTurma[MAX_ALUNOS];
    int i;

    /* Entrada de Dados */
    printf("\nInforme os dados da turma:\n");
    for (i = 0; i < MAX_ALUNOS; i++) {
        printf("\nNome=");
        scanf("%s", &QTurma[i].nome);
        printf("N1=");
        scanf("%f", &QTurma[i].N1);
        printf("N2=");
        scanf("%f", &QTurma[i].N2);
        printf("N3=");
        scanf("%f", &QTurma[i].N3);
        printf("Faltas=");
        scanf("%d", &QTurma[i].faltas);
    }

    /* Saida de Dados */
    printf("\nOs dados da turma informada:\n");
    for (i = 0; i < MAX_ALUNOS; i++)
        printf("\nNome=%s\nMedia=%.2f\nFaltas=%d\n",
            QTurma[i].nome,
            (QTurma[i].N1 + QTurma[i].N2 + QTurma[i].N3) / (3.0),
            QTurma[i].faltas
        );

    /* Fim do Programa */
    return 0;
}
