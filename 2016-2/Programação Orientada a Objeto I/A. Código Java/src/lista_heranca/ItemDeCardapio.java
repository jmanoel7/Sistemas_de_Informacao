package lista_heranca;

public class ItemDeCardapio {

	private float preco;

	public ItemDeCardapio(float preco) {
		this.preco = preco;
	}

	public float valorItem() {
		return preco;
	}
	
	public void cancelarItem() {
		setPreco(0.0f);
		return;
	}
	
	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "ItemDeCardapio [preco=" + preco + "]";
	}
	
	
	
}
