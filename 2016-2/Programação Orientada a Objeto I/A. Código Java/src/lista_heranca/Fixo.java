package lista_heranca;

public class Fixo extends Telefone {

	private String marca;
	private String toque;

	public Fixo(String numero, int ddd, String marca, String toque) {
		super(numero, ddd);
		this.marca = marca;
		this.toque = toque;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getToque() {
		return toque;
	}

	public void setToque(String toque) {
		this.toque = toque;
	}

	public boolean atenderChamada(float tempo) {
		if (tempo < 60f)
			return true;
		return false;
	}
	
	public String fazerChamada(String numero) {
		return super.getDdd() + super.getNumero() + " -> " + numero;
	}
	
	@Override
	public String toString() {
		return "Fixo [marca=" + marca + ", toque=" + toque + "]";
	}
	
}
