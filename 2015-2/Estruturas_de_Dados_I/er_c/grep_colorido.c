/*
 * grep_colorido.c
 *
 * imprime somente as linhas que casarem com a expressão regular
 * passada e colore a parte da linha que casa com a ER.
 * 
 * argv[1] = expressão regular
 * argv[2] = arquivo
 *
 * ex: ./grep_colorido '^er' arquivo.txt
 */

/* headers necessários */
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <regex.h>

/* caracteres de controle 
 * cor azul */
#define START_COLOR "\033[36;1m"
#define END_COLOR   "\033[m"

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
	int i,error, start;
	char *line = NULL;
	/* aloca espaço para a estrutura do tipo regmatch_t */
	regmatch_t match;
	/* aloca espaço para a estrutura do tipo regex_t */
	regex_t reg;

	/* compila a ER passada em argv[1]
	 * em caso de erro, a função retorna diferente de zero */
	if ((i=regcomp(&reg , er, REG_EXTENDED|REG_NEWLINE)) != 0)
		/* imprime uma string do erro */
		er_error(i,reg);	

	/* lê o arquivo linha por linha */
	while ((i = get_line(&line, fp)) != -1) {
		/* coloca o offset para o início da linha */
		start = 0;
		error = regexec(&reg, line, 1, &match, 0);
		/* enquanto a linha casar com a ER */
		while (error == 0) {
			/* imprime do início da string até o caractere antes do match */
			fwrite(line+start, 1, match.rm_so, stdout);
			printf("%s",START_COLOR); /* caracteres de controle */
			/* imprime a parte da string que casa com a ER */
			fwrite(line+start+match.rm_so, 1, match.rm_eo - match.rm_so, stdout);
			printf("%s",END_COLOR); /* caracteres de controle */
			
			/* atualiza o offset de início da string */
			start += match.rm_eo;
			error = regexec(&reg, line+start, 1, &match, REG_NOTBOL);
		}
		/* caso ocorreu algum match, se necessário, imprime o resto da linha */
		if (start != 0) fwrite(line+start, 1, strlen(line+start), stdout);
		/* caso queira imprimir todo o arquivo, comente a linha com o if
		 * acima e descomente a próxma linha 
		fwrite(line+start, 1, strlen(line+start), stdout); */
	}
}

int main(int argc, char **argv)
{
	FILE *fp;

	if (argc != 3) {
		fprintf(stderr,"Uso: grep_colorido <ER> <arquivo>\n");
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

