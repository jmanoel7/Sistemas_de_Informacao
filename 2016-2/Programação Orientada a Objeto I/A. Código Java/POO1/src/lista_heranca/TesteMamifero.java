package lista_heranca;

public class TesteMamifero {

	public static void main(String[] args) {

		Cachorro c = new Cachorro(8.54f, "Pastor Alemão");
		
		System.out.println(c);
		System.out.println("Velocidade do Cão: " + c.velocidade(2.0f));
		System.out.println("Velocidade do Cão como Mamífero: " + c.velocidade());
		System.out.println("Um cachorro que nasceu em 8 semanas e meia é prematuro?\nResposta => " + c.prematuro(8.5f));
		
		Vaca v = new Vaca("Nelori");
		
		System.out.println(v);
		System.out.println("Velocidade da vaca: " + v.velocidade(0.98f));
		System.out.println("Velocidade da vaca como Mamífero: " + v.velocidade());
		System.out.println("Uma vaca que nasceu em 39 semanas e meia é prematura?\nResposta => " + v.prematuro(39.5f));
		
	}

}
