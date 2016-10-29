/*		    ATIVIDADE EM SALA

Altere o programa abaixo e que foi desenvolvido na aula anterior da seguinte forma:

1) Crie uma fun��o para cada uma das rotinas (cadastrar, ordenar e listar)

2) Crie um menu com as seguintes op��es:

	Menu
	1 - Cadastrar
	2 - Ordenar
	3 - Listar
	4 - Sair

*/


#include <stdio.h>
#include <stdlib.h>

typedef struct {
	int   mat;
	char  nome[50];
	char  sexo;
	int   idade;
	float salario;
} empregado;

int main(void){

	empregado emp[3], aux;
	int i,j;

	/* cadastro dos funcion�rios */
	printf("\nCadastro de Funcionarios\n\n");
	for (i=0; i<3; i++) {

	    printf("Funcionario %d:\n\n", i+1);

		printf("Matricula: ");
		scanf(" %d", &emp[i].mat);

		printf("Nome: ");
		scanf(" %s", emp[i].nome);

		printf("Sexo: ");
		scanf(" %c", &emp[i].sexo);

		printf("Idade: ");
		scanf(" %d", &emp[i].idade);

		printf("Salario: ");
		scanf(" %f", &emp[i].salario);

	}

	/* Ordena��o do vetor de funcionarios */
	for (i=0; i<3 ; i++)
		for (j=i+1; j<3; j++)
			if (emp[i].idade > emp[j].idade) {

				aux = emp[j];
				emp[j] = emp[i];
				emp[i] = aux;
			}

	/* Apresenta��o dos Funcion�rios */
	system("cls");
	printf("\nLista Ordenada de Funcionarios\n\n");
	for (i=0; i<3; i++) {

		printf("\n *******************************");
		printf("\n Matricula: %d", emp[i].mat);
		printf("\n Nome     : %s", emp[i].nome);
		printf("\n Idade    : %d", emp[i].idade);
		printf("\n Sexo     : %c", emp[i].sexo);
		printf("\n Salario  : %f", emp[i].salario);
		printf("\n *******************************");
	}
	system("PAUSE || read");

	return 0;
}

