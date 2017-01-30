#include <stdlib.h>
#include <stdio.h>

#define MAX_STR 10

int
main (void)
{
    char *str1, *str2, lida[MAX_STR], copiada[MAX_STR];

    printf("\nDigite uma string de no máximo %i caracteres:\n", MAX_STR);
    scanf("%[^\n]s", lida);
    lida[MAX_STR] = '\0';
    
    str1 = lida;
    str2 = copiada;
    
    while ( *(str2++) = *(str1++) );
    
    printf("\nA string lida:\n\"%s\"\n", lida);
    printf("\nA string copiada:\n\"%s\"\n", copiada);

    return 0;
}
