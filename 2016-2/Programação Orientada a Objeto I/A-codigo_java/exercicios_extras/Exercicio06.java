// imprime os fatoriais de 1 até 15

public class Exercicio06 {

    public static void main (String args[]) {

	for (long i=1; i<=15; i++) {
	    long fat = fatorial(i);
	    System.out.println ("O fatorial de: " + i + " é: " + fat);
	}
	return;
    }

    public static long fatorial (long f) {
	if ( f == (long) 0 || f == (long) 1 )
	    return (long) 1;
	else
	    return f * fatorial (f-1);
    }

}
