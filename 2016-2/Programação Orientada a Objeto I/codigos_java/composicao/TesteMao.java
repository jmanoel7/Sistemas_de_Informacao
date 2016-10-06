package composicao;

public class TesteMao {

	public static void main(String[] args) {
		
		Mao m = new Mao("Renan");
		System.out.println(m);
		
		m.addDedo(1);
		m.addDedo(2);
		m.addDedo(2);
		m.addDedo(6);
		m.addDedo(3);
		System.out.println(m);
		
		m.removerDedo(2);
		System.out.println(m);
		
		m.addDedo(2);
		System.out.println(m);
	}	
}



