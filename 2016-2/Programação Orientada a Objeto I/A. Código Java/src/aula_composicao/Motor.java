package composicao;

public class Motor {
	
	private String fabricante;
	private String tipoCombustivel;
		
	public Motor(String fabricante, String tipoCombustivel) {
		this.fabricante = fabricante;		
		this.tipoCombustivel = tipoCombustivel;
	}
	
	public String getFabricante() {
		return fabricante;
	}
	
	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	@Override
	public String toString() {
		return "Motor [fabricante=" + fabricante + ", tipoCombustivel="
				+ tipoCombustivel + "]";
	}		
}


