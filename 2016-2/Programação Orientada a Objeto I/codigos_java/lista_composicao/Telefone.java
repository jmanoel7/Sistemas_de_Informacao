package lista_composicao;

public class Telefone {

	private int ddd;
	private int numero;
	private boolean celular;
	
	public Telefone(int ddd, int numero, boolean celular) {
		this.ddd = ddd;
		this.numero = numero;
		this.celular = celular;
	}

	public int getDdd() {
		return ddd;
	}

	public int getNumero() {
		return numero;
	}

	public boolean isCelular() {
		return celular;
	}

	@Override
	public String toString() {
		return "Telefone [ddd=" + ddd + ", numero=" + numero + ", celular=" + celular + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Telefone other = (Telefone) obj;
		if (celular != other.celular)
			return false;
		if (ddd != other.ddd)
			return false;
		if (numero != other.numero)
			return false;
		return true;
	}

}
