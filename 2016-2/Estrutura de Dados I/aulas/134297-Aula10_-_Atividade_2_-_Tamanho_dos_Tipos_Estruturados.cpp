#include <stdio.h>
#include <stdlib.h>

typedef struct produto {
        char    descricao[30];
        int     quantidade;
        double  preco_unitario;
        double  desconto;
        double  preco_total;
};

main() {
  printf("\n Tipos Estruturado e Tamanho ocupado \n");
  printf("\nO tamanho de um produto: %d bytes\n", sizeof(produto) );
}

