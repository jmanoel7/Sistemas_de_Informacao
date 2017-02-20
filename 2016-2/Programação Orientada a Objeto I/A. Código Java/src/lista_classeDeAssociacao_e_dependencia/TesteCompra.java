package lista_classeDeAssociacao_e_dependencia;

public class TesteCompra {

	public static void main(String[] args) {
		Data data = new Data(2017, 02, 19);
		Compra compra = new Compra("Raspberry PI 3");
		
		System.out.println(compra);
		compra.realizarCompra(data);
		System.out.println(compra);
		
	}
	
}
