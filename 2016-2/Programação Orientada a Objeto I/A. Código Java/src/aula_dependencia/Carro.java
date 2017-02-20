package aula_dependencia;

public class Carro {

	private String modelo;
	private boolean ligado;
	private boolean andando;

	public Carro(String modelo) {
		this.modelo = modelo;
	}
	
	public void ligarCarro(Chave chave) {
		
		if (chave == null) {
			throw new NullPointerException("A referência da Chave não pode ser nula!");
		}
		
		System.out.println("Usando a " + chave + " para ligar o carro.");
		this.ligado = true;
	}
	
	public boolean andar() {		
		
		if (ligado) {
			System.out.println("O Carro está andando.");
			andando = true;			
		} else 
			System.out.println("Não foi possível andar, pois o Carro está desligado.");
		
		return andando;
		
	}
	
	public String getModelo() {
		return modelo;
	}

	public boolean isLigado() {
		return ligado;
	}
	
	public boolean isAndando() {
		return andando;
	}
	
	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", ligado=" + ligado + ", andando="
				+ andando + "]";
	}			
}


