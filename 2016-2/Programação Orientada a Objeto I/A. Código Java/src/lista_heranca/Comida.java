package lista_heranca;

public class Comida extends ItemDeCardapio {

	private float peso;

	public Comida(float preco, float peso) {
		super(preco);
		this.peso = peso;
	}

	// Sobrescrito
	@Override
	public float valorItem() {
		return super.getPreco() + 0.25f;
	}

	// Sobrecarregado
	public boolean cancelarItem(float peso, boolean clienteDecepicionado) {
		boolean sucesso = false;

		if (clienteDecepicionado || peso < 0.97f * this.peso) {
			super.setPreco(0.0f);
			sucesso = true;
		}

		return sucesso;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Comida [peso=" + peso + "]";
	}
	
}
