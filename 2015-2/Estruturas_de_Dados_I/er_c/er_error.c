/*
 * er_error.c
 *
 * Testa se uma expressão regular casa (match)
 * com uma linha e faz tratamento de erro para ER inválidas...
 */

/* headers necessários */
#include <stdio.h>
#include <stdlib.h>
#include <regex.h>

/* mostra uma mensagem do erro usando regerror */
int er_error(int i, regex_t reg)
{
	size_t length;
	char *buffer=NULL;

	/* pega o tamanho da mensagen de erro */
	length = regerror (i, &reg, NULL, 0);

	/* aloca espaço para a mensagem de erro */
	if ((buffer = (char *)malloc (length)) == NULL) {
		fprintf(stderr, "error: malloc buffer\n");
		exit(1);
	}
	
	/* coloca em buffer a mensagem de erro */
	regerror (i, &reg, buffer, length);
	
	fprintf(stderr,"%s\n",buffer);
	free(buffer);
	exit(1);
}

/* tenta casar uma ER com o input */
void er_match(char *argv[])
{
	/* aloca espaço para a estrutura do tipo regex_t */
	regex_t reg;
	int i;

	/* compila a ER passada em argv[1]
	 * em caso de erro, a função retorna diferente de zero */
	if ((i=regcomp(&reg , argv[1], REG_EXTENDED|REG_NOSUB)) != 0)
		/* imprime a string do erro */
		er_error(i,reg);	

	/* tenta casar a ER compilada (&reg) com a entrada (argv[2]) 
	 * se a função regexec retornar 0 casou, caso contrário não */
	if ((regexec(&reg, argv[2], 0, (regmatch_t *)NULL, 0)) == 0)
		printf("Casou\n");
	else
		printf("Não Casou\n");
}

int main(int argc, char **argv)
{
	if (argc != 3) {
		fprintf(stderr,"Uso: er_error <ER> <input>\n");
		return 1;
	}
	er_match(argv);
	return 0;
}

