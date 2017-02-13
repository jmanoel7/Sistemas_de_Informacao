package lista_heranca;

public class TesteTelefone {

	public static void main(String[] args) {

		Fixo tf = new Fixo("30912345", 61, "Embratel", "Tone");
		System.out.println(tf);
		System.out.println("Atende em menos de 60 segundos? " + tf.atenderChamada(45.6f));
		System.out.println("Atende em mais de 60 segundos? " + tf.atenderChamada(61.9f));
		System.out.println("Fazer Cahamada: " + tf.fazerChamada("39012567"));
		
		Movel tm = new Movel("82013256", 62, "LG", "Google", true);
		System.out.println(tm);
		System.out.println("Atende em menos de 45 segundos? " + tm.atenderChamada(35.6f));
		System.out.println("Atende em mais de 45 segundos? " + tm.atenderChamada(45.9f));
		System.out.println("Fazer Cahamada: " + tm.fazerChamada("89012567"));
		
	}

}
