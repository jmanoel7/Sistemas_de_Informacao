#include <stdio.h>
#include <stdlib.h>

struct QAluno {
    char nome[100];
    float media;
    int faltas;
};

int main(void)
{
    /* Inicio do Programa */

    /* Declaracao de Variaveis */
    struct QAluno QTurma;

    /* Entrada de Dados */
    printf("\nInforme os dados do aluno:\n\n");
    printf("Nome=");
    scanf("%s", &QTurma.nome);
    printf("Media=");
    scanf("%f", &QTurma.media);
    printf("Faltas=");
    scanf("%d", &QTurma.faltas);

    /* Saida de Dados */
    printf("\nOs dados do aluno informado:\n\n");
    printf("Nome=%s\nMedia=%.2f\nFaltas=%d\n",
        QTurma.nome,
        QTurma.media,
        QTurma.faltas
    );

    /* Fim do Programa */
    return 0;
}
