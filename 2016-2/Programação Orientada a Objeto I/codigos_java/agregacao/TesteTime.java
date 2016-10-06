package agregacao;

public class TesteTime {

	public static void main(String[] args) {
				
		Tecnico t1 = null;
		Tecnico t2 = new Tecnico("Dunga");
		Tecnico t3 = new Tecnico("Felip�o");		
		
		Time tm;
		
		try {
			tm = new Time("Brasil", t1);
		} catch (NullPointerException e) {
			System.err.println(e.getMessage());
		}
		
		tm = new Time("Brasil", t2);
		System.out.println(tm);
		
		tm.trocaTecnico(t3);
		System.out.println(tm);			
	}	
}



