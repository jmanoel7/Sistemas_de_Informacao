package lista_agregacao;

public class Roda {

	private String modelo;
	private String marca;
	
	public Roda(String modelo, String marca) {
		this.modelo = modelo;
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getMarca() {
		return marca;
	}

	@Override
	public String toString() {
		return "Roda [modelo=" + modelo + ", marca=" + marca + "]";
	}
	
}
