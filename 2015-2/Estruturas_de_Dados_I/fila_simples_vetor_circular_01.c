#include <stdio.h>
#include <stdlib.h>

#define MAX 10

void inserir(int vet[MAX], int *ini, int *fim, int *num) {
    if ( *num == MAX ) {
        printf("\n\a\tA fila esta cheia!\n");
        return;
    }
    int val;
    printf("\n\tDigite um valor -> ");
    scanf("%d", &val);
    if ( *num == 0 ) {
        ++(*ini);
        ++(*fim);
    } else if (*fim == MAX-1)
        *fim = 0;
    else
        ++(*fim);
    vet[*fim] = val;
    ++(*num);
    return;
}

void remover(int vet[MAX], int *ini, int *fim, int *num) {
    if ( *num == 0 ) {
        printf("\n\a\tA fila esta vazia!\n");
        return;
    }
    vet[*ini] = 0;
    if ( *num == 1 ) {
        *ini = -1;
        *fim = -1;
        *num = 0;
    } else if ( *ini == MAX-1 ) {
        *ini = 0;
        (*num)--;
    } else {
        (*ini)++;
        (*num)--;
    }
    return;
}

void imprimir (int vet[MAX], int *ini, int *fim, int *num) {
    int i;
    if ( *num == 0 ) {
        printf("\n\a\tA fila esta vazia!\n");
        return;
    }
    printf("\n\tFila:");
    if (*ini <= *fim)
        for (i = *ini; i <= *fim; i++)
            printf("  %d", vet[i]);
    else {
        for (i = *ini; i <= MAX - 1; i++)
            printf("  %d", vet[i]);
        for (i = 0; i <= *fim; i++)
            printf("  %d", vet[i]);
    }
    printf("\n");
    return;
}

int main(void) {
    int vet[MAX], ini=-1, fim=-1, num=0, opc=0, i=0;
    for (i=0; i<MAX; ++i)
        vet[i] = 0;
    while (1) {
        printf("\n\tMenu:\n\t\t1) Inserir\n\t\t2) Remover\n\t\t3) Imprimir\n\t\t4) Sair\n\t\tOpcao -> ");
        scanf("%d", &opc);
        if (opc == 1)
            inserir(&vet[0], &ini, &fim, &num);
        else if (opc == 2)
            remover(&vet[0], &ini, &fim, &num);
        else if (opc == 3)
            imprimir(&vet[0], &ini, &fim, &num);
        else if (opc == 4)
            break;
        else
            printf("\n\a\tOpcao invalida!!!\n");
    }
    exit(0);
}
