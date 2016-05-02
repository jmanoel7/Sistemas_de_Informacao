#include <stdio.h>
#include <stdlib.h>

struct Celula {
    int Valor;
    struct Celula *prox;
};
typedef struct Celula Nodo;

int main(void) {
    /* Declaracao de Variaveis */
    Nodo Cabeca, *Ponteiro, *Aux;
    int i, NumeroElementos;
    printf("Quantos Elementos?\n");
    scanf("%d", &NumeroElementos);
    Cabeca.prox=NULL;

    /* Entrada de dados */
    for (i = 0; i < NumeroElementos; ++i) {
        Ponteiro = (Nodo *) malloc(sizeof(Nodo));
        Ponteiro->prox=NULL;
        printf("Digite o valo do elemento %d: ", i+1);
        scanf("%d", &Ponteiro->Valor);
        if (i==0) {
            Cabeca.prox = Ponteiro;
        } else {
            Aux->prox = Ponteiro;
        }
        Aux = Ponteiro;
    }

    /* Saida de dados */
    Aux = Cabeca.prox;
    i = 1;
    while (Aux != NULL) {
        printf("Elemento %d: %d\n", i, Aux->Valor);
        ++i;
        Aux = Aux->prox;
    }

    return 0;
}
