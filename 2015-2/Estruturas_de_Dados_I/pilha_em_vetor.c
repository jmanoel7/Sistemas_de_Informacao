#include <stdio.h>
#include <stdlib.h>

#define MAX 10

void inserir(int vet[MAX], int *topo) {
    if ( *topo == MAX - 1) {
        printf("\n\a\tA pilha esta cheia!\n");
        return;
    }
    int val=0;
    printf("\n\tDigite um valor -> ");
    scanf("%d", &val);
    vet[++(*topo)] = val;
    return;
}

void remover(int vet[MAX], int *topo) {
    if ( *topo == -1) {
        printf("\n\a\tA pilha esta vazia!\n");
        return;
    }
    vet[(*topo)--] = 0;
    return;
}

void imprimir (int vet[MAX], int *topo) {
    if ( *topo == -1 ) {
        printf("\n\a\tA pilha esta vazia!\n");
        return;
    }
    printf("\n\tPilha:\n");
    int i;
    for (i = *topo; i >= 0; --i)
        printf("\t\t%d\n", vet[i]);
    return;
}

int main(void) {
    int vet[MAX], topo=-1, opc=0, i=0;
    for (i = 0; i < MAX; ++i)
        vet[i] = 0;
    while (1) {
        printf("\n\tMenu:\n\t\t1) Inserir\n\t\t2) Remover\n\t\t3) Imprimir\n\t\t4) Sair\n\t\tOpcao -> ");
        scanf("%d", &opc);
        if (opc == 1)
            inserir(&vet[0], &topo);
        else if (opc == 2)
            remover(&vet[0], &topo);
        else if (opc == 3)
            imprimir(&vet[0], &topo);
        else if (opc == 4)
            break;
        else
            printf("\n\a\tOpcao invalida!!!\n");
    }
    exit(0);
}
