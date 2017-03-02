#include <stdio.h>
#include <stdlib.h>

//prototipo
int * f_realoc(int n2, int n, int *v);

main() {

  int n, n2, i;
  int *v_int;

  printf("\n Digite o tamanho do vetor: ");
  scanf("%d", &n);

  v_int = (int *) malloc( n * sizeof(int) );

  printf("\n Cadastro dos valores no vetor \n");
  for (i=0; i < n; i++) {
      printf(" Vetor[ %d ]: ", i+1);
      scanf("%d", &v_int[i]);
  }

  printf("\n Lista dos valores no vetor \n");
  for (i=0; i < n; i++) {
      printf(" Vetor[ %d ]: %d \n", i, v_int[i]);
  }

  system("PAUSE");
  system("cls");

  printf("\n Digite o novo tamanho do vetor: ");
  scanf("%d", &n2);

  v_int = f_realoc(n2, n, v_int);

  printf("\n Lista dos valores no vetor \n");
  for (i=0; i < n2; i++) {
      printf("\n Vetor[ %d ]: %d", i, v_int[i]);
  }
  free(v_int);
  v_int = NULL;
}

//função que faz a realocação da memória estilo realloc()
int * f_realoc(int n2, int n, int *v){

    int i;
    int *ptemp;

    ptemp = (int *) malloc(n2 * sizeof(int));

    for (i=0; i < n2; i++) {
        ptemp[i] = v[i];
    }

    //for (i=n; i < n2; i++) {
    //    ptemp[i] = NULL;
    //}
    return ptemp;
};

