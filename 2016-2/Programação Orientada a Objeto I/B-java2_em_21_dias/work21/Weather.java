package jmanoel.java2.work21;

class Weather 
{
   public static void main(String[] arguments)
     {
	float fah = 86;
	System.out.println(fah + " degrees Fahrenheit is ...");
	// Para converter Fahrenheit em Celsius
	// Comeca pela subtracao 32
	fah = fah - 32;
	// Divide a resposta por 9
	fah = fah / 9;
	// Multiplica essa resposta por 5
	fah = fah * 5;
	System.out.println(fah + " degrees Celsius\n");
	
	float cel = 33;
	System.out.println(cel + " degrees Celsius is ...");
	// Para converter Celsius em Fahrenheit
	// Comeca multiplicando por 9
	cel = cel * 9;
	// Divide a resposta por 5
	cel = cel / 5;
	// Soma 32 a a resposta
	cel = cel + 32;
	System.out.println(cel + " degrees Fahrenheit");
     }
}