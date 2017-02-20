package lista_classeDeAssociacao_e_dependencia;

public class TV {

	private String modelo;
	private String marca;
	private int numeroCanal;
	private boolean ligada;
	
	public TV(String modelo, String marca) {
		this.modelo = modelo;
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getMarca() {
		return marca;
	}

	public int getNumeroCanal() {
		return numeroCanal;
	}

	public boolean isLigada() {
		return ligada;
	}
	
	@Override
	public String toString() {
		return "TV [modelo=" + modelo + ", marca=" + marca + ", numeroCanal=" + numeroCanal + ", ligada=" + ligada
				+ "]";
	}

	public void ligarTV() {
		System.out.println("Ligando a TV: " + this + ", no Canal de numero: 3");
		this.ligada = true;
		this.numeroCanal = 3;
	}

	public void sintonizarCanal(Canal canal) {
		if (canal == null)
			throw new NullPointerException("A referência ao Canal não pode ser nula!");
	
		if (this.ligada) {
			System.out.println("Sintonizando na TV, o Canal: " + canal);
			this.numeroCanal = canal.getNumero();
		} else {
			System.out.println("Não é possível sintonizar o Canal, a TV está desligada!\nLigue primeiro a TV!");
			this.numeroCanal = 0;
		}
	}

}
