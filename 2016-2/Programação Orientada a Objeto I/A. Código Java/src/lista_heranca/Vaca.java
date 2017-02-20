package lista_heranca;

public class Vaca extends Mamifero {
	
	private String raca;

	public Vaca(String raca) {
		super("Bovina", 40.4f);
		this.raca = raca;
	}
	
	public float velocidade(float fatorRaca) {
		return 0.8f * fatorRaca;
	}
	
	public boolean prematuro(float tempoGestacao) {
		boolean isPrematuro = false;
		
		if (tempoGestacao < 0.97f * this.tempoGestacao) {
			isPrematuro = true;
		}
		
		return isPrematuro;
	}

	public String getRaca() {
		return raca;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vaca other = (Vaca) obj;
		if (raca == null) {
			if (other.raca != null)
				return false;
		} else if (!raca.equals(other.raca))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Vaca [raca=" + raca + "]";
	}

}
