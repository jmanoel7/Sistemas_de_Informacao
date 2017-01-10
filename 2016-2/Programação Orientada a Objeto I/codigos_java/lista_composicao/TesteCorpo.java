package lista_composicao;

public class TesteCorpo {

	public static void main(String[] args) {
		
		Corpo c = new Corpo( (float) 1.86, (float) 0.56);
		System.out.println(c);
		
		// Adiciona uma perna direita
		c.addPerna( (float) 0.92, 'D' );
		System.out.println(c);
		
		// Adiciona uma perna esquerda
		c.addPerna( (float) 0.95, 'E' );
		System.out.println(c);
		
		// // não remove a perna direita 
		c.removePerna( (float) 0.95, 'D' );
		System.out.println(c);
		
		// remove a perna esquerda
		c.removePerna( (float) 0.95, 'E' );
		System.out.println(c);

		// remove a perna direita
		c.removePerna( (float) 0.92, 'D' );
		System.out.println(c);

	}
	
}
