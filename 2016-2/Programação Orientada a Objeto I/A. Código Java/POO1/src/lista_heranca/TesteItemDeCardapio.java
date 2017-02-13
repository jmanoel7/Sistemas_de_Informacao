package lista_heranca;

public class TesteItemDeCardapio {

	public static void main(String[] args) {

		Bebida b = new Bebida(5f, 350f);
		System.out.println(b);
		System.out.println("O valor da bebida com a gorjeta = " + b.valorItem());
		if (b.cancelarItem(349f))
			System.out.println("A bebida foi cancelada.");
		else
			System.out.println("A bebida NÃO foi cancelada.");
		// o garçom ganha de qualquer jeito
		System.out.println("O valor da bebida com a gorjeta = " + b.valorItem());
		System.out.println(b);
		
		Comida c = new Comida(24.75f, 800f);
		System.out.println(c);
		System.out.println("O valor da comida com a gorjeta = " + c.valorItem());
		if (c.cancelarItem(775f, false))
			System.out.println("A comida foi cancelada.");
		else
			System.out.println("A comida NÃO foi cancelada.");
		// o garçom ganha de qualquer jeito
		System.out.println("O valor da comida com a gorjeta = " + c.valorItem());
		System.out.println(c);
		
		Sobremesa s = new Sobremesa(18.0f, false);
		System.out.println(s);
		System.out.println("O valor da sobremesa com a gorjeta = " + s.valorItem());
		if (s.cancelarItem(false))
			System.out.println("A sobremesa foi cancelada.");
		else
			System.out.println("A sobremesa NÃO foi cancelada.");
		// o garçom ganha de qualquer jeito
		System.out.println("O valor da sobremesa com a gorjeta = " + s.valorItem());
		System.out.println(s);
		
	}

}
