package heranca1;

public class Carro extends Veiculo {

	protected String modelo;
	
	public Carro(String modelo) {
		super("XWQ");
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + " " + super.modelo + "]";
	}	
}


