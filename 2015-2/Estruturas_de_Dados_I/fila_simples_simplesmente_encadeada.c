#include <stdio.h>
#include <stdlib.h>

struct Celula {
    int valor;
    struct Celula ant;
    struct Celula prox;
}

typedef struct Celula Nodo;

void inserir(Nodo *ptr) {
    Nodo *aux = (*Nodo) malloc( sizeof(Nodo) );
    printf("Digite um valor inteiro -> ");
    scanf("%i", &aux->valor);
    
    return;
}

void remover(Nodo *ptr) {
    return;
}

void imprimir(Nodo *ptr, int rev=0) {
    return;
}

int main() {
    int op=0;
    Nodo *ini, *fim;
    ini = (*Nodo) malloc( sizeof(Nodo) );
    ini->ant = NULL;
    ini->prox = NULL;
    ini->valor = 0;
    fim = ini;
    while (1) {
        printf("\n\aMenu:\n\t1) Inserir\n\t2) Remover\n\t3) Imprimir\n\t4) Imprimir reverso\n\t5) Sair\n\tOpcao -> ");
        scanf("%d", &op);
        if (op == 1)
            inserir(fim);
        else if (op == 2)
            remover(ini);
        else if (op == 3)
            imprimir(ini);
        else if (op == 4)
            imprimir(ini, 1);
        else if (op == 5)
            break;
        else
            printf("\n\aOpcao invalida!");
    }
    return 0;
}
