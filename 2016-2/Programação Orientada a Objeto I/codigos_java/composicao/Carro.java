package composicao;

public class Carro {

	private String modelo;
	private Motor motor;
	
	public Carro(String modelo, String fabricanteDoMotor, String tipoDoCombustivelDoMotor) {				
		this.modelo = modelo;
		this.motor = new Motor(fabricanteDoMotor, tipoDoCombustivelDoMotor);			
	}	

	public void trocarMotor(String fabricante, String tipoDoCombustivel) {
		this.motor = new Motor(fabricante, tipoDoCombustivel);
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public Motor getMotor() {
		return motor;
	}

	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", motor=" + motor + "]";
	}		
}


