import javax.swing.JOptionPane;

public class Exercicio05 {
    public static void main (String args[]) {
	String a;
	int ano;

	a = JOptionPane.showInputDialog ("Digite o ano: ");
	ano = Integer.parseInt (a);

	if (( ano % 4 == 0 && ano % 100 != 0 ) || ano % 400 == 0 )
	    System.out.println ("O ano: " + ano + " é bissexto!");
	else
	    System.out.println ("O ano: " + ano + " é comum!");
	return;
    }
}
