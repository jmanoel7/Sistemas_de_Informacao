#include <stdio.h>
#include <stdlib.h>

#define TAM 3

// criando um novo tipo
typedef struct {
    int     mat;
    char    nome[35];
    char    sexo[10];
} pessoa;

// protótipos
int menu();
void cadastra_pessoas(pessoa *p);
void lista_pessoas(pessoa *p);

//função principal
main(){

    int      op;
    pessoa   vendedores[TAM];
    pessoa   clientes[TAM];

    while (1){
        system("cls");
        op = menu();
        system("cls");
        switch(op) {
            case 1: printf(" Cadastrar - Vendedor \n");
                    cadastra_pessoas(vendedores);
                    break;
            case 2: printf(" Lista dos Vendedores \n");
                    lista_pessoas(vendedores);
                    break;
            case 3: printf(" Cadastrar - Cliente \n");
                    cadastra_pessoas(clientes);
                    break;
            case 4: printf(" Cadastrar - Cliente \n");
                    lista_pessoas(clientes);
                    break;
            case 5: exit(0);
        }
    }
}

int menu(){
    int op;

    printf("\t Menu\n");
    printf("\n 1 - Cadastrar Vendedor");
    printf("\n 2 - Listagem de Vendedores");
    printf("\n 3 - Cadastrar Vendedor");
    printf("\n 4 - Listagem de Clientes");
    printf("\n 5 - Sair");
    printf("\n\n Opcao: ");
    scanf("%d", &op);
    return op;
}

void cadastra_pessoas(pessoa *p){
    int  i;
    for (i=0; i < TAM; i++) {

        printf("\n Matricula: %i", i+1);
        (*p).mat = i+1;

        printf("\n Nome: ");
        scanf("%s", (*p).nome );

        printf(" Sexo: ");
         scanf("%s", (*p).sexo );
        p++;
    }
};

void lista_pessoas(pessoa *p){
    int  i;

        printf("\n Matricula %3s Nome  %30s Sexo ", "", "");

    for (i=0; i < TAM; i++) {
        printf("\n %-6i  %5s %-30s %4s  %-10s", (*p).mat, "", (*p).nome, "", (*p).sexo);
        p++;
    }
    printf("\n\n");
    system("Pause");
};
