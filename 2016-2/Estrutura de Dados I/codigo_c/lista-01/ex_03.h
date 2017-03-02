/*
 * Aluno:       João Manoel Leite Ribeiro Nogueira <joao.manoel@academico.ifg.edu.br>
 * Matrícula:   20131011090230
 * Lista:       01
 * Exercício:   03
 * Disciplina:  Estrutura de Dados I
 * Curso:       Bacharelado em Sistemas de Informação
 * Professor:   Dory Gonzaga Rodrigues
 * IFG:         Câmpus Goiânia
 */

#ifndef EX_03_H
#define EX_03_H

int exercicio_03(void)
{
     unsigned int i, j, k, l, m, n, valores_repetidos;

     printf("\nInforme as dimensões da matriz A(m x n):\n\n");
     printf("\tm = "); scanf("%u", &m);
     printf("\tn = "); scanf("%u", &n);

     float A[m][n];

     printf("\nInforme  agora os elementos (números reais) da matriz A(%u x %u):\n\n", m, n);
     for (i = 0; i < m; i++)
          for (j = 0; j < n; j++) {
               printf("\tA(%u,%u) = ", i+1, j+1);
               scanf("%f", &A[i][j]);
          }

     printf("\nA matriz A(%u x %u) tem valores repetidos?\n\n", m, n);
     valores_repetidos = 0;
     for (i = 0; i < m; i++) {
          for (j = 0; j < n; j++) {
               for (k = i; k < m; k++) {
                    for (l = (k == i) ? j + 1 : 0; l < n; l++) {
                         if (A[i][j] == A[k][l]) {
                              valores_repetidos = 1;
                              break;
                         } /* end if */
                    } /* end for l */
                    if (valores_repetidos)
                         break;
               } /* end for k */
               if (valores_repetidos)
                    break;
          } /* end for j */
          if (valores_repetidos)
               break;
     } /* end for i */

     if (valores_repetidos)
          printf("\tSIM\n\n");
     else
          printf("\tNÃO\n\n");

     return 0;
}

#endif /* EX_03_H */
