/*
 * Aluno:       João Manoel Leite Ribeiro Nogueira
 * Matrícula:   20131011090230
 * Lista:       01
 * Exercício:   02
 * Disciplina:  Estrutura de Dados I
 * Curso:       Bacharelado em Sistemas de Informação
 * Professor:   Dory Gonzaga Rodrigues
 * IFG:         Câmpus Goiânia
*/

#include <stdio.h>
#include <stdlib.h>

#define MAX_VETOR 10

int main(void) {

  int i, j, k, c, vetor[MAX_VETOR], impressos[MAX_VETOR/2], salvar;

  printf("\nInforme um vetor de números inteiros com %i elementos:\n\n", MAX_VETOR);

  for (i = 0; i < MAX_VETOR; i++) {
    printf("\tvetor[%i] = ", i);
    scanf("%i", &vetor[i]);
  }

  c = 0;
  for (i = 0; i < MAX_VETOR; i++) {
    for (j = i+1; j < MAX_VETOR; j++)
      // verifica se tem valores repetidos
      if (vetor[i] == vetor[j]) {
	salvar = 1;
	for (k = 0; k < c; k++)
	  // verifica se já está salvo no vetor impressos
	  if (vetor[i] == impressos[k]) {
	    salvar = 0;
	    break; // for k
	  }
	// se eh para salvar, então salva o valor no vetor impressos
	if ( salvar )
	  impressos[c++] = vetor[i];
	break; // for j
      } // end if vetor[i] == vetor[j]
  } // end for i

  // verifica se há números repetidos para imprimir
  if ( c > 0 ) {
    //imprime os números repetidos
    printf("\nOs números repetidos no vetor informado são:\n\n");
    for (i = 0; i < c; i++)
      printf("\t%d\n", impressos[i]);
    printf("\n");
  } else
    // imprime que não possui números repetidos
    printf("\nO vetor informado não possui números repetidos.\n\n");

  return 0;
}
