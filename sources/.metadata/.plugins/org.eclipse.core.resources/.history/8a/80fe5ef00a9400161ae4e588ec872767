package lista_agregacao;

public class Moto {

	private Roda roda1;
	private Roda roda2;
	private String motor;
	
	public Moto(Roda roda1, Roda roda2, String motor) {
		//Roda1
		if (roda1 == null) {
			throw new NullPointerException("A referência da roda1 não pode ser nula!");
		}	
		this.roda1 = roda1;
		//Roda2
		if (roda2 == null) {
			throw new NullPointerException("A referência da roda2 não pode ser nula!");
		}
		this.roda2 = roda2;
		//Motor
		if (motor == null) {
			throw new NullPointerException("A referência do motor não pode ser nula!");
		}		
		this.motor = motor;
	}

	public boolean trocaRoda1(Roda roda1) {
		boolean sucesso = false;
		
		if (roda1 != null) {
			this.roda1 = roda1;
			sucesso = true;
		}
		
		return sucesso;
	}

	public boolean trocaRoda2(Roda roda2) {
		boolean sucesso = false;
		
		if (roda2 != null) {
			this.roda2 = roda2;
			sucesso = true;
		}
		
		return sucesso;
	}

	public boolean trocaRodas(Roda roda1, Roda roda2) {
		boolean sucesso = false;
		
		if (roda1 != null && roda2 != null) {
			this.trocaRoda1(roda1);
			this.trocaRoda2(roda2);
			sucesso = true;
		}
		
		return sucesso;
	}

	public String getMotor() {
		return motor;
	}

	public boolean trocaMotor(String motor) {
		boolean sucesso = false;
		
		if (motor != null) {
			this.motor = motor;
			sucesso = true;
		}
		
		return sucesso;
	}

	@Override
	public String toString() {
		return "Moto [roda1=" + roda1 + " roda2=" + roda2 + " motor=" + motor + "]";
	}

	

}
