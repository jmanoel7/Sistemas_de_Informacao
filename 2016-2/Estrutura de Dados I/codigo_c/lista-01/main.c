/*
 * Copyright 2017 João Manoel <joao.manoel@academico.ifg.edu.br>
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#include "ex_01.h"
#include "ex_02.h"
#include "ex_03.h"
#include "ex_04.h"
#include "ex_05.h"

int main(void) {
    int op=0, sair=0;

    do
    {
        do {
            printf("\nMenu de Opções:\n\n");
            printf("\t(1) -> Exercício 01\n");
            printf("\t(2) -> Exercício 02\n");
            printf("\t(3) -> Exercício 03\n");
            printf("\t(4) -> Exercício 04\n");
            printf("\t(5) -> Exercício 05\n");
            printf("\t(6) -> Sair\n");
            printf("\nInforme a sua opção -> ");
            scanf("%d", &op);

            if (op < 1 || op > 6) {
                printf("\nA opção informada: %d, é inválida!\n", op);
                printf("Favor digitar novamente.\n");
                continue;
            }

            break;
        } while (1);

        switch (op)
        {
        case 1:
            exercicio_01();
            break;
        case 2:
            exercicio_02();
            break;
        case 3:
            exercicio_03();
            break;
        case 4:
            exercicio_04();
            break;
        case 5:
            exercicio_05();
            break;
        default:
            sair=1;
            break;
        }
    } while (!sair);

  return 0;
}
