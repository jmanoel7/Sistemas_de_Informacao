package aula_dependencia;

public class TesteCarro {

	public static void main(String[] args) {
		
		Chave chave = new Chave("ABC");
		Carro carro = new Carro("New Fiesta");
		
		System.out.println(carro);
		
		carro.andar();
				
		carro.ligarCarro(chave);
		carro.andar();
		
		System.out.println(carro);
	}	
}

