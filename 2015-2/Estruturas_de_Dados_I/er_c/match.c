/*
 * match.c
 *
 * Este programa simplesmente testa se uma express�o regular casa (match)
 * com uma entrada (input).
 *
 * argv[1] = express�o regular
 * argv[2] = input
 *
 * ex: ./match '^12' '1234567890'
 */

/* headers necess�rios */
#include <stdio.h>
#include <stdlib.h>
#include <regex.h>

/* recebe como par�metro a express�o regular e o input para
 * tentar casar */
void er_match(char *argv[])
{
	/* aloca espa�o para a estrutura do tipo regex_t */
	regex_t reg;

	/* compila a ER passada em argv[1]
	 * em caso de erro, a fun��o retorna diferente de zero */
	if (regcomp(&reg , argv[1], REG_EXTENDED|REG_NOSUB) != 0) {
		fprintf(stderr,"erro regcomp\n");
		exit(1);
	}
	/* tenta casar a ER compilada (&reg) com a entrada (argv[2]) 
	 * se a fun��o regexec retornar 0 casou, caso contr�rio n�o */
	if ((regexec(&reg, argv[2], 0, (regmatch_t *)NULL, 0)) == 0)
		printf("Casou\n");
	else
		printf("N�o Casou\n");
}

int main(int argc, char **argv)
{
	if (argc != 3) {
		fprintf(stderr,"Uso: match <ER> <input>\n");
		return 1;
	}
	er_match(argv);
	return 0;
}
