#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct {
    int id;
    char nome[30];
    char sexo;
    int idade;
} Aluno;

int main(void) {

    Aluno a[3];
    int i;
    char format[30];

    for (i=0; i<3; i++) {
        printf("\nInforme os dados do aluno %d:\n\n", i+1);
        a[i].id=i+1;
        printf("Nome: ");
        scanf(" %[^\n]30", a[i].nome);
        printf("Sexo: ");
        scanf(" %c", &(a[i].sexo));
        printf("Idade: ");
        scanf(" %d", &(a[i].idade));
    }

    system("cls || clear");

    i=1;
    do {
        printf("PESQUISA DE ALUNOS:\n\n");
        printf("PS: para sair informe o id=5\n\n");
        printf("Informe a posicao do aluno (id): ");
        scanf(" %d", &i);
        if ( ( i<1 || i>3 ) && i!=5 ) {
            printf("\nO Id digitado (%d) eh invalido!\n", i);
            system("pause || read teste");
            system("cls || clear");
            continue;
        }
        if (i!=5) {
            printf("\n%s %s %40s %s\n", "Id", "Nome", "Sexo", "Idade");
            sprintf(format, "%%2d %%s %%%zdc %%5d\n", 40 - strlen(a[i-1].nome) + 4);
            printf(format, a[i-1].id, a[i-1].nome, a[i-1].sexo, a[i-1].idade);
            printf("\nPressione <Enter> para continuar.\n");
            system("pause || read teste");
            system("cls || clear");
        }
    } while (i!=5);

    return 0;
}
