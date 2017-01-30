#include <stdio.h>
#include <stdlib.h>

int main() {

    int mat[3][3], i, j;

    printf("Matriz Quadrada 3x3:\n\n");

    for (i=0; i<3; i++)
        for (j=0; j<3; j++) {
            printf("mat[%d][%d] = ", i+1, j+1);
            scanf("%i", &mat[i][j]);
        }

    printf("Mostrando a Diagonal Prncipal:\n\n");

    for(i=0; i<3; i++) {
        for (j=0; j<3; j++) {
            if (i==j)
                printf("%5d %3c", mat[i][j], ' ');
            else
                printf("    -   ");
        }
        printf("\n");
    }
    return 0;
}
