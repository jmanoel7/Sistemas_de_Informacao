package revisao_prova_pratica1;

public class Carro {

	private String modelo;
	private String placa;
	private Volante volante;

	private Proprietario prop1;
	private Proprietario prop2;

	public Carro(String modelo, String placa,
			int numSerie, Proprietario prop) {

		if (prop == null) {
			throw new NullPointerException("O prop. não "
					+ "pode ser nulo");
		}

		this.modelo = modelo;
		this.placa = placa;
		volante = new Volante(numSerie);
		prop1 = prop;
	}

	public boolean trocarVolante(int nSerie) {
		boolean sucesso = false;

		Volante novo = new Volante(nSerie);

		if ( (volante != null) &&
			 (!volante.equals(novo)))
		{
			this.volante = novo;
			sucesso = true;
		}

		return sucesso;
	}

	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public Proprietario getProp1() {
		return prop1;
	}

	public Proprietario getProp2() {
		return prop2;
	}

	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", placa=" + placa + ", volante="
				+ volante + ", prop1=" + prop1 + ", prop2=" + prop2 + "]";
	}



}
