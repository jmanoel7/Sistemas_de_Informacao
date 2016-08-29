/*
 * my_grep.c
 *
 * lê um arquivo e imprime somente as linhas que casarem com a 
 * expressão regular passada
 *
 * argv[1] = expressão regular
 * argv[2] = arquivo
 *
 * ex: ./my_grep '^er' arquivo.txt
 */

/* headers necessários */
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
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
	
	fprintf(stderr,"Erro: %s\n",buffer);
	free(buffer);
	exit(1);
}

/* lê uma linha inteira do arquivo */
int get_line(char **line, FILE *fp)
{
	int tam=32;
	int start=0;

	if ((*line = (char *) malloc(tam)) == NULL) {
		fprintf(stderr, "Erro: malloc line\n");
		exit(1);
	}
	while (fgets(*line+start, tam, fp) != NULL) {
		if (strchr(*line, '\n') != NULL)
			return 1;
		start += tam-1;
		*line = (char *)realloc(*line, start+1+tam);
	}
	return -1;
}

/* tenta casar uma ER com o input */
void er_match(char *er, FILE *fp)
{
	int i;
	char *line = NULL;
	/* aloca espaço para a estrutura do tipo regex_t */
	regex_t reg;

	/* compila a ER passada em argv[1]
	 * em caso de erro, a função retorna diferente de zero */
	if ((i=regcomp(&reg , er, REG_EXTENDED|REG_NEWLINE|REG_NOSUB)) != 0)
		/* imprime uma string do erro */
		er_error(i,reg);	

	/* lê o arquivo linha por linha */
	/* while ((i = getline(&line, &len, fp)) != -1) { */
	 while ((i = get_line(&line, fp)) != -1) { 
		/* teste se a linha lida casa com a ER */
		if ((regexec(&reg, line, 0, (regmatch_t *)NULL, 0)) == 0)
			printf("%s",line);
		free(line);
	}
}

int main(int argc, char **argv)
{
	FILE *fp;

	if (argc != 3) {
		fprintf(stderr,"Uso: my_grep <ER> <arquivo>\n");
		exit(1);
	}
	if ((fp = fopen(argv[2], "r")) == NULL) {
		fprintf(stderr,"Erro ao abrir %s\n",argv[2]);
		exit(1);
	}
	er_match(argv[1], fp);
	fclose(fp);
	exit(0);
}

