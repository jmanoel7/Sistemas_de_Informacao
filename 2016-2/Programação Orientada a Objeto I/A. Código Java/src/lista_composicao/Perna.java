package lista_composicao;

public class Perna {

	private float comprimento;
	private char posicao;
	
	public Perna(float comprimento, char posicao) {
		this.comprimento = comprimento;
		this.posicao = posicao;
	}

	public float getComprimento() {
		return comprimento;
	}

	public char getPosicao() {
		return posicao;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Perna other = (Perna) obj;
		if (Float.floatToIntBits(comprimento) != Float.floatToIntBits(other.comprimento))
			return false;
		if (posicao != other.posicao)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Perna [comprimento=" + comprimento + ", posicao=" + posicao + "]";
	}
	
}
