package lista_composicao;

public class Chassi {

	private String fabricante;
	private String numero;
	
	public Chassi(String fabricante, String numero) {
		this.fabricante = fabricante;
		this.numero = numero;
	}
	
	public String getFabricante() {
		return fabricante;
	}

	public String getNumero() {
		return numero;
	}

	@Override
	public String toString() {
		return "Chassi [fabricante=" + fabricante + ", numero=" + numero + "]";
	}
	
}
