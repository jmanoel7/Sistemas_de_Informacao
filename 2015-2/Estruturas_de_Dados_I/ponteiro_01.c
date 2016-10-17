#include <stdio.h>
#include <stdlib.h>

int main(void) {
    /* Inicio do Programa */

    /* Declaracoes de Variaveis */
    int x=10, *pi;

    /* Processamento de Dados */
    pi=&x;
    *pi /= 2;
    *pi += 2;

    /* Saida de Dados */
    printf("\n  x=%d  *pi=%d  pi=%p  pi=%ld\n\n", x, *pi, pi, pi);

    /* Fim do Programa */
    return 0;
}
