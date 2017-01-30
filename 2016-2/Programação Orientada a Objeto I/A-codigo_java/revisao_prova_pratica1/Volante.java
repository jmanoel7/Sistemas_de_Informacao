package revisao_prova_pratica1;

public class Volante {

	private int numSerie;

	public Volante(int numSerie) {
		this.numSerie = numSerie;
	}

	public int getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(int numSerie) {
		this.numSerie = numSerie;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Volante other = (Volante) obj;
		if (numSerie != other.numSerie)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Volante [numSerie=" + numSerie + "]";
	}


}
