class InverteTexto
{
    public static void main(String args[])
    {
	if (args.length>0) {
	    for (int i = args.length-1; i>=0; i--) {
		System.out.print( InverteString( args[i] ) );
		System.out.print(" ");
	    }
	    System.out.println();
	}
	else
	    System.out.println("\tUso: java InverteTexto <texto a ser invertido>");
    }
    public static String InverteString(String a_inverter) 
    {
	String invertida = "";
	if (a_inverter.length()>1)
	    for (int i = a_inverter.length()-1; i>=0; i--)
		invertida = invertida + a_inverter.charAt(i);
	else
	    invertida = a_inverter;
	return invertida;
    }
}
