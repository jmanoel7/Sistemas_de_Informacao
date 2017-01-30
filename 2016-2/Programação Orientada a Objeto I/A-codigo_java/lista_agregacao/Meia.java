package lista_agregacao;

public class Meia {
	private int tamanho;
	private char cano;
	private String cor;

	public Meia(int tamanho, char cano, String cor) {
		this.tamanho = tamanho;
		this.cano = cano;
		this.cor = cor;
	}

	public int getTamanho() {
		return tamanho;
	}

	public char getCano() {
		return cano;
	}

	public String getCor() {
		return cor;
	}

	@Override
	public String toString() {
		return "Meia [tamanho=" + tamanho + ", cano=" + cano + ", cor=" + cor
				+ "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Meia other = (Meia) obj;
		if (cano != other.cano)
			return false;
		if (cor == null) {
			if (other.cor != null)
				return false;
		} else if (!cor.equals(other.cor))
			return false;
		if (tamanho != other.tamanho)
			return false;
		return true;
	}

}
