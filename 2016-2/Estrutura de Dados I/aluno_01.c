#include <stdlib.h>
#include <stdio.h>
#include <string.h>

struct Aluno {
    int id;
    char nome[30];
    char sexo;
    int idade;
};

int main(void) {

    int i;
    char *nome;
    struct Aluno a[3];

    for (i=0; i<3; ++i) {
        nome = (char *) malloc(30 * sizeof(char) );
        printf("Informe os dados do aluno %i:\n\n", i+1);
        a[i].id=i+1;
        printf("Nome:\n");
        scanf("%[^\n]s\n", nome);
        printf("Nome = \"%s\"\n", nome);
        strcpy(a[i].nome, nome);
        free(nome);
        printf("Sexo:\n");
        scanf("%c\n", &a[i].sexo);
        printf("Sexo = \"%c\"\n", a[i].sexo);
        printf("Idade:\n");
        scanf("%i\n", &a[i].idade);
    }

    system("cls || clear");

    i=1;
    do {
        printf("PESQUISA DE ALUNOS:\n\n");
        printf("PS: para sair informe o id=5\n\n");
        printf("Informe a posicao do aluno (id):\n");
        scanf("%i\n", &i);
        if ( ( i<1 || i>3 ) && i!=5 ) {
            printf("O Id digitado (%i) eh invalido!\n", i);
            system("pause || read");
            system("cls || clear");
            continue;
        }
        if (i!=5) {
            printf("%s %s %40s %s\n", "Id", "Nome", "Sexo", "Idade");
            printf("%i %s %40s %s\n", a[i].id, a[i].nome, a[i].sexo, a[i].idade);
            printf("\nPressione <Enter> para continuar.\n");
            system("pause || read");
            system("cls || clear");
        }
    } while (i!=5);

    return 0;
}
