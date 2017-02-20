package lista_classeDeAssociacao_e_dependencia;

public class TesteTV {

	public static void main(String[] args) {
		
		TV lg = new TV("LG SMART WEB", "LG");
		
		Canal c2 = new Canal("Anhanguera", 2);
		Canal c5 = new Canal("TV Fonte da Vida", 5);
		Canal c9 = new Canal("Serra Dourada", 9);

		System.out.println(lg);

		lg.sintonizarCanal(c9);
		lg.ligarTV();
		System.out.println(lg);
		
		lg.sintonizarCanal(c2);
		System.out.println(lg);

		lg.sintonizarCanal(c5);
		System.out.println(lg);
	}

}
