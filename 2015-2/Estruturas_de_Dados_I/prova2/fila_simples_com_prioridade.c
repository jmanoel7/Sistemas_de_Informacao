#include <stdio.h>
#include <stdlib.h>

#define QUANTIDADE 3
#define PRIORIDADE 60

struct Celula {
    int valor;
    struct Celula *prox;
};

typedef struct Celula Nodo;

void inserir(Nodo *ptr) {
    Nodo *aux = (Nodo *) malloc( sizeof(Nodo) );
    printf("Digite um valor inteiro -> ");
    scanf("%i", &aux->valor);
    aux->prox = (Nodo *) malloc( sizeof(Nodo) );
    ptr->prox = aux;
    aux = aux->prox;
    aux->valor = 0;
    aux->prox = NULL;
    return;
}

void remover(Nodo *ptr, int *cont) {
    if (ptr->prox == NULL) {
        printf("\n\a\tA Fila esta vazia\n");
        return;
    }
    Nodo *anterior = ptr, *atual = ptr;
    if (*cont <= QUANTIDADE) {
        if (atual->valor >= PRIORIDADE) {
            atual = atual->prox;
            free(anterior);
            anterior = NULL;
            (*cont)++;
            return;
        }
        do {
            anterior = atual;
            atual = atual->prox;
        } while (atual->prox != NULL && atual->valor < PRIORIDADE);
        if (atual->valor >= PRIORIDADE) {
            anterior->prox = atual->prox;
            free(atual);
            atual = NULL;
            (*cont)++;
            return;
        } else {
            anterior = ptr;
            ptr = ptr->prox;
            free(anterior);
            anterior = NULL;
            return;
        }
    } else {
        if (atual->valor < PRIORIDADE) {
            atual = atual->prox;
            free(anterior);
            anterior = NULL;
            *cont = 1;
            return;
        }
        do {
            anterior = atual;
            atual = atual->prox;
        } while (atual->prox != NULL && atual->valor >= PRIORIDADE);
        if (atual->valor < PRIORIDADE) {
            anterior->prox = atual->prox;
            free(atual);
            atual = NULL;
            *cont = 1;
            return;
        } else {
            anterior = ptr;
            ptr = ptr->prox;
            free(anterior);
            anterior = NULL;
            return;
        }
    }
    return;
}

void imprimir(Nodo *ptr) {
    if (ptr->prox == NULL) {
        printf("\n\a\tA Fila esta vazia\n");
        return;
    }
    Nodo *aux = ptr;
    printf("\n\tFila:");
    do {
        printf("  %d", aux->valor);
        aux = aux->prox;
    } while(aux->prox != NULL);
    printf("\n");
    return;
}

int main() {
    int op = 0, cont = 1;
    Nodo *ini = (Nodo *) malloc( sizeof(Nodo) );
    ini->prox = NULL;
    ini->valor = 0;
    while (1) {
        printf("\n\aMenu:\n\t1) Inserir\n\t2) Remover\n\t3) Imprimir\n\t4) Sair\n\tOpcao -> ");
        scanf("%d", &op);
        if (op == 1)
            inserir(ini);
        else if (op == 2)
            remover(ini, &cont);
        else if (op == 3)
            imprimir(ini);
        else if (op == 4)
            break;
        else
            printf("\n\aOpcao invalida!");
    }
    exit(0);
}
