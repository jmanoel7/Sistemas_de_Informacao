package lista_classeDeAssociacao_e_dependencia;

public class Impressora {

	private String marca;
	private String modelo;
	private boolean recarregada;
	
	public Impressora(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public boolean isRecarregada() {
		return recarregada;
	}

	@Override
	public String toString() {
		return "Impressora [marca=" + marca + ", modelo=" + modelo + ", recarregada=" + recarregada + "]";
	}

	public void recarregar(Cartucho c) {
		if (c == null)
			throw new NullPointerException("A referência do Cartucho da Impressora não pode ser nula!");

		System.out.println("Recarregando a Impressora com o Cartucho: "+ c);
		this.recarregada = true;
	}
}
