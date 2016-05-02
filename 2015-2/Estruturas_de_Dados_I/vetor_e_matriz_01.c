#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    char *C[10], *nome;
    unsigned int achei=0;
    int i;
    for (i = 0; i < 10; ++i) {
        printf("Digite um nome: ");
        C[i] = (char *) malloc(100 * sizeof(char));
        scanf(" %100[^\n]s", C[i]);
    }
    nome = (char *) malloc(100 * sizeof(char));
    printf("Digite um nome para pesquisa: ");
    scanf(" %100[^\n]s", nome);
    for (i = 0; i < 10; ++i)
        if (strcmp(nome,C[i]) == 0) {
            achei=1;
            break;
        }
    if (achei==1)
        printf("ACHEI\n");
    else
        printf("NÃO ACHEI\n");
    for (i = 0; i < 10; ++i) {
        free(C[i]);
        C[i] = NULL;
    }
    free(nome);
    nome = NULL;
    return 0;
}
