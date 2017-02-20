package lista_heranca;

public class Sobremesa extends ItemDeCardapio {

	private boolean diet;

	public Sobremesa(float preco, boolean diet) {
		super(preco);
		this.diet = diet;
	}

	// Sobrescrito
	@Override
	public float valorItem() {
		return super.getPreco() + 1.0f;
	}
	
	// Sobrecarregado
	public boolean cancelarItem(boolean diet) {
		boolean sucesso = false;

		if (diet != this.diet) {
			super.setPreco(0.0f);
			sucesso = true;
		}

		return sucesso;
	}

	public boolean isDiet() {
		return diet;
	}

	public void setDiet(boolean diet) {
		this.diet = diet;
	}

	@Override
	public String toString() {
		return "Sobremesa [diet=" + diet + "]";
	}
	
}
