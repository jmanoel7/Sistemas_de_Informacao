package lista_heranca;


public class Cachorro extends Mamifero {
	
	private float volumeLatido;
	private String raca;

	public Cachorro(float volumeLatido, String raca) {
		super("Cachorro", 9.3f);
		this.volumeLatido = volumeLatido;
		this.raca = raca;
	}
	
	public float velocidade(float fatorRaca) {
		return 1.0f * fatorRaca;
	}
	
	public boolean prematuro(float tempoGestacao) {
		boolean isPrematuro = false;
		
		if (tempoGestacao < 0.92f * this.tempoGestacao) {
			isPrematuro = true;
		}
		
		return isPrematuro;
	}

	public float getVolumeLatido() {
		return volumeLatido;
	}

	public void setVolumeLatido(float volumeLatido) {
		this.volumeLatido = volumeLatido;
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
		Cachorro other = (Cachorro) obj;
		if (raca == null) {
			if (other.raca != null)
				return false;
		} else if (!raca.equals(other.raca))
			return false;
		if (Float.floatToIntBits(volumeLatido) != Float.floatToIntBits(other.volumeLatido))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cachorro [volumeLatido=" + volumeLatido + ", raca=" + raca + "]";
	}
	
}