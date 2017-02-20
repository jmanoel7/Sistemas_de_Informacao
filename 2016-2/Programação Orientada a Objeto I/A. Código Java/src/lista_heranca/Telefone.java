package lista_heranca;

public class Telefone {
	
	private String numero;
	private int ddd;

	public Telefone(String numero, int ddd) {
		this.numero = numero;
		this.ddd = ddd;
	}

	public boolean atenderChamada(float tempo) {
		if (tempo < 30f)
			return true;
		return false;
	}
	
	public String fazerChamada(String ddd, String numero) {
		return this.ddd + this.numero + " -> " + ddd + numero;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	@Override
	public String toString() {
		return "Telefone [numero=" + numero + ", ddd=" + ddd + "]";
	}
	
}
