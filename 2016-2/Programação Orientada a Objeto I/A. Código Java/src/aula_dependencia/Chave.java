package aula_dependencia;

public class Chave {

	private String tipo;

	public Chave(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	@Override
	public String toString() {
		return "Chave [tipo=" + tipo + "]";
	}
}

