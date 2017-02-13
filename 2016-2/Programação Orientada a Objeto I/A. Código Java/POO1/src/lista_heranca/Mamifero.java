package lista_heranca;

public class Mamifero {

	private String especie;
	protected float tempoGestacao;

	public Mamifero(String especie, float tempoGestacao) {
		this.especie = especie;
		this.tempoGestacao = tempoGestacao;
	}

	public float velocidade() {
		return 1.0f;
	}
	
	public boolean prematuro(float tempoGestacao) {
		boolean isPrematuro = false;
		
		if (tempoGestacao < 0.95f * this.tempoGestacao) {
			isPrematuro = true;
		}
		
		return isPrematuro;
	}
	
	public String getEspecie() {
		return especie;
	}

	public float getTempoGestacao() {
		return tempoGestacao;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mamifero other = (Mamifero) obj;
		if (especie == null) {
			if (other.especie != null)
				return false;
		} else if (!especie.equals(other.especie))
			return false;
		if (Float.floatToIntBits(tempoGestacao) != Float.floatToIntBits(other.tempoGestacao))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Mamifero [especie=" + especie + ", tempoGestacao=" + tempoGestacao + "]";
	}
	
}
