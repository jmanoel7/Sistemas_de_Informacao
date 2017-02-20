package lista_classeDeAssociacao_e_dependencia;

public class Cartucho {

	private boolean colorido;
	private float capacidade;
	
	public Cartucho(boolean colorido, float capacidade) {
		this.colorido = colorido;
		this.capacidade = capacidade;
	}

	public boolean isColorido() {
		return colorido;
	}

	public float getCapacidade() {
		return capacidade;
	}

	@Override
	public String toString() {
		return "Cartucho [colorido=" + colorido + ", capacidade=" + capacidade + "]";
	}
	
}
