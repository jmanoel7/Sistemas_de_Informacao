package lista_composicao;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro c = new Carro("João Manoel", "Gol", "Volkswagen", "9BWHE21JX24060960");
		System.out.println(c);
		
		c.trocaChassi("Ford", "9BWHE21JX24060960");
		System.out.println(c);
	}
}
