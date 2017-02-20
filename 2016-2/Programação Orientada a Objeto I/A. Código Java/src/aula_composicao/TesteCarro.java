package composicao;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro c = new Carro("Civic", "Honda", "A/G");				
		System.out.println(c.toString());
		
		c.trocarMotor("Ferrari", "G");
		System.out.println(c.toString());
		
	}	
}



