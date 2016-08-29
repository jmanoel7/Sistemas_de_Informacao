#include <stdio.h>
#include <stdlib.h>

int main(void) {
    /* Inicio do Programa */

    /* Declaracoes de Variaveis */
    int *pi;

    /* Processamento de Dados */
    pi = malloc( sizeof(int) );
    *pi = 14;
    *pi /= 2;
    *pi += 2;

    /* Saida de Dados */
    printf("\n  *pi=%d  pi=%p  pi=%ld\n\n", *pi, pi, pi);

    /* Fim do Programa */
    free(pi);
    return 0;
}
