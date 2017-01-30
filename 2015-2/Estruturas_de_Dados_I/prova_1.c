#include <stdio.h>

main() {
  int n, i = 0, c;
  scanf("%d", &n);
  printf("Termos são: \n");

  for( c = 1 ; c <= n ; c++ ) {
    printf("%d\n", ProgramaS (i));
    i++;
  }
  return 0;
}

int ProgramaS (int n) {
  if ( n == 0 )
    return 0;
  else if ( n == 1 )
    return 1;
  else
    return ( ProgramaS (n-1) + ProgramaS (n-2) );
}
