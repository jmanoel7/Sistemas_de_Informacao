#include <stdio.h>
#include <stdlib.h>

struct QAluno {
    char nome[100];
    float N1, N2, N3;
    int faltas;
};

int main(void)
{
    /* Inicio do Programa */

    /* Declaracao de Variaveis */
    struct QAluno QTurma;

    /* Entrada de Dados */
    printf("\nInforme os dados do aluno:\n");
    printf("\nNome=");
    scanf("%s", &QTurma.nome);
    printf("N1=");
    scanf("%f", &QTurma.N1);
    printf("N2=");
    scanf("%f", &QTurma.N2);
    printf("N3=");
    scanf("%f", &QTurma.N3);
    printf("Faltas=");
    scanf("%d", &QTurma.faltas);

    /* Saida de Dados */
    printf("\nOs dados do aluno informado:\n");
    printf("\nNome=%s\nMedia=%.2f\nFaltas=%d\n",
        QTurma.nome,
        (QTurma.N1 + QTurma.N2 + QTurma.N3) / (3.0),
        QTurma.faltas
    );

    /* Fim do Programa */
    return 0;
}
