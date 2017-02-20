package lista_classeDeAssociacao_e_dependencia;

public class Compra {

	private String produto;
	private boolean realizada;
	
	public Compra(String produto) {
		this.produto = produto;
	}
	
	public void realizarCompra(Data data) {		
		if (data == null)
			throw new NullPointerException("A referência da Data da compra não pode ser nula!");

		System.out.println("Realizando a compra na data: " + data);
		
		this.realizada = true;
	}

	public String getProduto() {
		return produto;
	}

	public boolean isRealizada() {
		return realizada;
	}

	@Override
	public String toString() {
		return "Compra [produto=" + produto + ", realizada=" + realizada + "]";
	}

}
