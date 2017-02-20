package lista_agregacao;

public class Teclado {

	private int teclas;
	private String mapa;
	private String marca;
	private String modelo;
	private boolean semFio;

	public Teclado(int teclas, String mapa, String marca, String modelo, boolean semFio) {
		this.teclas = teclas;
		this.mapa = mapa;
		this.marca = marca;
		this.modelo = modelo;
		this.semFio = semFio;
	}

	public int getTeclas() {
		return teclas;
	}

	public String getMapa() {
		return mapa;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public boolean isSemFio() {
		return semFio;
	}

	@Override
	public String toString() {
		return "Teclado [teclas=" + teclas + ", mapa=" + mapa + ", marca=" + marca + ", modelo=" + modelo + ", semFio="
				+ semFio + "]";
	}
	
}
