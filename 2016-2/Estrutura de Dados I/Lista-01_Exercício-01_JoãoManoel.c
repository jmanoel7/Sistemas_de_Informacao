/*
 * Aluno:       João Manoel Leite Ribeiro Nogueira
 * Matrícula:   20131011090230
 * Lista:       01
 * Exercício:   01
 * Disciplina:  Estrutura de Dados I
 * Curso:       Bacharelado em Sistemas de Informação
 * Professor:   Dory Gonzaga Rodrigues
 * IFG:         Câmpus Goiânia
*/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main (void) {

    int i;
    char palavra[5], teste1[5], teste2[5];
    //void *ptr;

    do {

        printf("Digite uma palavra com 5 letras:\n");
        scanf("%s", palavra);

        if (strlen(palavra) == 5)
            break;

        printf("\nERRO: a palavra informada (%s) não possui 5 letras!!!\n\nInforme-a novamente!!!\n\n", palavra);

    } while (1);

    printf("\nA palavra da: ESQUERDA  para: DIREITA  -> ");
    for (i=0; i<=4; ++i) {
        printf("%c", palavra[i]);
        teste1[i] = palavra[i];
    }

    printf("\nA palavra da: DIREITA   para: ESQUERDA -> ");
    for (i=4; i>=0; --i) {
        printf("%c", palavra[i]);
        teste2[4-i] = palavra[i];
    }

    if (strcmp(teste1, teste2) == 0)
        printf("\n\nA palavra informada (%s) é palíndroma!\n", palavra);
    else
        printf("\n\nA palavra informada (%s) NÃO é palíndroma!\n", palavra);

    return 0;
}

