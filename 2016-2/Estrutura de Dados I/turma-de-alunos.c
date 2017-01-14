#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_TURMA 3
#define MAX_NOME  100
#define MAX_NOTAS 4

typedef struct data {
  unsigned int dia;
  unsigned int mes;
  unsigned int ano;
} tp_data;

typedef struct aluno {
  char     nome[MAX_NOME];
  tp_data  data_nascimento;
  float    notas[MAX_NOTAS];
} tp_aluno;

tp_aluno cadastra_aluno(void);
void lista_turma(tp_aluno turma[MAX_TURMA], int n);
void imprime_aluno(tp_aluno aluno);

int main(void)
{
  int i;
  tp_aluno turma[MAX_TURMA];

  for (i=0; i<MAX_TURMA; ++i) {
    printf("\n\nCadastro do Aluno %d:\n\n", i+1);
    turma[i] = cadastra_aluno();
  }

  lista_turma(turma, MAX_TURMA);

  return (0);
}

tp_aluno cadastra_aluno(void) {
  int i;
  tp_aluno aluno_novo;

  printf("\tNome = ");
  scanf(" %[^\n]s", aluno_novo.nome);

  printf("\tData de nascimento:\n");
  printf("\tdia = "); scanf(" %u", &aluno_novo.data_nascimento.dia);
  printf("\tmês = "); scanf(" %u", &aluno_novo.data_nascimento.mes);
  printf("\tano = "); scanf(" %u", &aluno_novo.data_nascimento.ano);

  printf("\tNotas:\n");
  for (i=0; i<MAX_NOTAS; ++i) {
    printf("\tnota%d = ", i+1);
    scanf(" %f", &aluno_novo.notas[i]);
  }

  return (aluno_novo);
}

void lista_turma(tp_aluno turma[MAX_TURMA], int n) {
  int i, j;

  for (i = 0; i < n; ++i) {
    printf("\n\nImpressão do Aluno %d:\n\n", i+1);
    imprime_aluno(turma[i]);
  }

  return;
}

void imprime_aluno(tp_aluno aluno) {
  int i;

  printf("\tNome = %s\n", aluno.nome);
  printf("\tData de Nascimento = %u/%u/%u\n", aluno.data_nascimento.dia, aluno.data_nascimento.mes, aluno.data_nascimento.ano);
  printf("\tNotas:\n");
  for (i = 0; i < MAX_NOTAS; ++i)
    printf("\tnota%d = %'.2f\n", i+1, aluno.notas[i]);

  return;
}
