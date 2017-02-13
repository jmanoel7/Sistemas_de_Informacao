package lista_composicao;

public class Carro {

	private String dono;
	private String modelo;
	private Chassi chassi;
	
	public Carro(String dono, String modelo, String fabricanteDoChassi, String numeroDoChassi) {
		this.dono = dono;
		this.modelo = modelo;
		this.chassi = new Chassi(fabricanteDoChassi, numeroDoChassi);
	}

	public void trocaChassi(String fabricanteDoChassi, String numeroDoChassi) {
		this.chassi = new Chassi(fabricanteDoChassi, numeroDoChassi);
	}
	
	public String getDono() {
		return dono;
	}

	public String getModelo() {
		return modelo;
	}

	public Chassi getChassi() {
		return chassi;
	}

	@Override
	public String toString() {
		return "Carro [dono=" + dono + ", modelo=" + modelo + ", chassi=" + chassi + "]";
	}

}
