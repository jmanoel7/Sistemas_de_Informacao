#include <stdio.h>
#include <stdlib.h>

main() {

  int n, i;
  int *v_int;

  //aloca o vetor para 10 números inicialmente
  v_int = (int *) malloc(10 * sizeof(int) );

  printf("\n Digite o tamanho do vetor: ");
  scanf("%d", &n);

  //realoca o vetor para n números usando a função realloc()
  v_int = (int *) realloc(v_int, n * sizeof(int) );

  printf("\n Cadastro dos valores no vetor \n");
  for (i=0; i < n; i++) {
      printf("\n Vetor[ %d ]: ", i+1);
      scanf("%d", &v_int[i]);
  }

  printf("\n Lista dos valores no vetor \n");
  for (i=0; i < n; i++) {
      printf("\n Vetor[ %d ]: %d", i, v_int[i]);
  }

  free(v_int);
  v_int = NULL;
}
