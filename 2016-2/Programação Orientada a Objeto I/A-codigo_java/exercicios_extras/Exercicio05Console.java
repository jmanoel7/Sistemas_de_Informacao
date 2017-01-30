public class Exercicio05Console {
    public static void main (String args[]) {
	int ano, i=1;

	try {
	    if (args[i].length() == 0) {
		System.out.println ("Uso: java Exercicio05Console numero1 [ numero2 ... ]");
		return;
	    }
	}
	catch (java.lang.ArrayIndexOutOfBoundsException e) {
	    System.out.println ("Uso: java Exercicio05Console numero1 [ numero2 ... ]");
	    return;
	}

	do {
	    
	    try {
		ano = Integer.parseInt (args[i]);
		if (( ano % 4 == 0 && ano % 100 != 0 ) || ano % 400 == 0 )
		    System.out.println ("O ano: " + ano + " é bissexto!");
		else
		    System.out.println ("O ano: " + ano + " é comum!");
	    }
	    
	    catch (java.lang.NumberFormatException e) {
		System.out.println ("O argumento: " + args[i] + " não é um inteiro!");
	    }

	} while (args[++i].length() != 0);

	return;
    }
}
