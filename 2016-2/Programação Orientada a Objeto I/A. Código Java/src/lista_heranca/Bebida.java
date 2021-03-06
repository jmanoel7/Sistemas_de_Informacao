package lista_heranca;

public class Bebida extends ItemDeCardapio {

	private float volume;

	public Bebida(float preco, float volume) {
		super(preco);
		this.volume = volume;
	}

	// Sobrescrito
	@Override
	public float valorItem() {
		return super.getPreco() + 0.5f;
	}
	
	// Sobrecarregado
	public boolean cancelarItem(float volume) {
		boolean sucesso = false;

		if (volume < 0.97f * this.volume) {
			super.setPreco(0.0f);
			sucesso = true;
		}

		return sucesso;
	}

	public float getVolume() {
		return volume;
	}

	public void setVolume(float volume) {
		this.volume = volume;
	}

	@Override
	public String toString() {
		return "Bebida [volume=" + volume + "]";
	}

}
