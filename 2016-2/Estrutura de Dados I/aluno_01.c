#include <stdlib.h>
#include <stdio.h>

#define NUM_ALUNOS 3

struct aluno {
    int id;
    char nome[30];
    char sexo;
    int idade;
};

typedef struct aluno Aluno;

int main() {

    int i;
    Aluno a[NUM_ALUNOS];

    for (i=0; i<NUM_ALUNOS; i++) {
        printf("Informe os dados do aluno %d:\n\n", i+1);
        a[i].id=i+1;
        printf("Nome=");
        scanf("%s", &a[i].nome);
        printf("Sexo=");
        scanf("%c", &a[i].sexo);
        printf("Idade=");
        scanf("%d", &a[i].idade);
    }

    system("clear || cls");

    do {
        printf("PESQUISA DE ALUNOS:\n\n");
        printf("PS: para sair informe o id=5\n\n");
        printf("Informe a posição do aluno:\nId=");
        scanf("%d", &i);
        if ( ( i<1 || i>3 ) && i!=5 ) {
            printf("O Id digitado (%d) eh invalido!\n", i);
            system("clear || cls");
            continue;
        }
        if (i!=5) {
            printf("%s %s %40s %s\n", "Id", "Nome", "Sexo", "Idade");
            printf("%d %s %40s %s\n", a[i].id, a[i].nome, a[i].sexo, a[i].idade);
            printf("\nPressione <Enter> para continuar.\n");
            system("read || pause");
            system("clear || cls");
        }
    } while (i!=5);

    return 0;
}
