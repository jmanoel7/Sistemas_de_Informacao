package composicao;

public class TesteEscola {

	public static void main(String[] args) {

		Escola e = new Escola("IFG");
		System.out.println(e);
		
		e.addDepto("Depto I");
		e.addDepto("Depto II");
		e.addDepto("Depto III");
		e.addDepto("Depto IV");
		System.out.println(e);
		
		e.removeDepto("Depto II");
		e.removeDepto("Depto III");
		System.out.println(e);		
		
	}	
}



