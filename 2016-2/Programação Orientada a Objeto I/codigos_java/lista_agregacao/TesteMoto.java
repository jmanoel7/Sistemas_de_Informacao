package lista_agregacao;

public class TesteMoto {

	public static void main(String[] args) {
		Roda r1 = new Roda("6 palitos", "Biz 100 125");
		Roda r2 = new Roda("6 palitos", "Biz 100 125");
		Roda r3 = null;
		Roda r4 = null;
		Moto m1 = null;
		
		try {
			m1 = new Moto(r1, r2, null);
		} catch (NullPointerException e) {
			System.err.println(e.getMessage());
		}

		try {
			m1 = new Moto(r1, r4, "Honda");
		} catch (NullPointerException e) {
			System.err.println(e.getMessage());
		}
		
		try {
			m1 = new Moto(r3, r2, "Honda");
		} catch (NullPointerException e) {
			System.err.println(e.getMessage());
		}
		
		try {
			m1 = new Moto(r1, r2, "Honda");
		} catch (NullPointerException e) {
			System.err.println(e.getMessage());
		}

		System.out.println(m1);
		
		m1.trocaMotor("Yamaha");
				
		System.out.println("O motor da moto foi trocado para:\n\t" + m1.getMotor());
		
		r3 = new Roda("6 palitos", "Fan 150");
		r4 = new Roda("6 palitos", "Fan 150");
		m1.trocaRodas(r3, r4);
						
		System.out.println("As rodas da moto foram trocadas para:\n\t" + r3 + "\n\t" + r4);
		
		System.out.println(m1);
	}

}
