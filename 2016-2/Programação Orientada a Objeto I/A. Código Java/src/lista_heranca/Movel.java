package lista_heranca;

public class Movel extends Telefone {

	private String marca;
	private String toque;
	private boolean vibracao;

	public Movel(String numero, int ddd, String marca, String toque, boolean vibracao) {
		super(numero, ddd);
		this.marca = marca;
		this.toque = toque;
		this.vibracao = vibracao;
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

	public boolean isVibracao() {
		return vibracao;
	}

	public void setVibracao(boolean vibracao) {
		this.vibracao = vibracao;
	}

	public boolean atenderChamada(float tempo) {
		if (tempo < 45f)
			return true;
		return false;
	}
	
	public String fazerChamada(String numero) {
		return super.getDdd() + super.getNumero() + " -> 9" + numero;
	}

	@Override
	public String toString() {
		return "Movel [marca=" + marca + ", toque=" + toque + ", vibracao=" + vibracao + "]";
	}
	
}
