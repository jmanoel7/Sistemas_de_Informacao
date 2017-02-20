package lista_classeDeAssociacao_e_dependencia;

public class TesteImpressora {

	public static void main(String[] args) {
		Impressora i = new Impressora("HP", "Deskjet");
		Cartucho c = new Cartucho(false, 75.5f);
		System.out.println(i);
		i.recarregar(c);
		System.out.println(i);
	}
}
