package lista_agregacao;

public class TesteTV {

	public static void main(String[] args) {

		DVD dvd1 = new DVD("LG", "Dp132");
		DVD dvd2 = new DVD("SamSung", "R128");
		DVD dvd3 = null;
		DVD dvd4 = new DVD("SamSung", "R128");
		DVD dvd5 = new DVD("Sony", "Dvp-sr370");
		DVD dvd6 = new DVD("Britânia", "Game Brg150 Usb");
		TV tv = null;

		try {
			tv = new TV("LG", "49UH6100", dvd3);
		} catch (NullPointerException e) {
			System.err.println(e.getMessage());
		}

		try {
			tv = new TV("LG", "49UH6100");
		} catch (NullPointerException e) {
			System.err.println(e.getMessage());
		}

		tv.addDVD(dvd1); // adiciona dvd1
		tv.addDVD(dvd2); // adiciona dvd2
		tv.addDVD(dvd4); // NÃO adiciona dvd4
		tv.addDVD(dvd5); // adiciona dvd5
		tv.addDVD(dvd6); // NÃO adiciona dvd6

		// imprime TV com 3 aparelhos de DVD
		System.out.println(tv);

		tv.removeDVD(dvd1); // remove o dvd1

		// imprime TV com 2 aparelhos de DVD
		System.out.println(tv);

		tv.removeDVD(dvd3); // não remove nada, pois dvd3 é nulo

		// imprime TV com 2 aparelhos de DVD
		System.out.println(tv);

		tv.removeDVD(dvd5); // remove o dvd5

		// imprime TV com 1 aparelho de DVD
		System.out.println(tv);

		tv.removeDVD(dvd4); // remove dvd2, pois dvd2 tem a mesma configuração que dvd4

		// imprime TV com 0 aparelhos de DVD
		System.out.println(tv);

		tv.removeDVD(dvd2); // não tem mais o que remover, continua tudo como antes

		// imprime TV com 0 aparelhos de DVD
		System.out.println(tv);

		tv.addDVD(dvd6); // adiciona o dvd6

		// imprime TV com 1 aparelho de DVD
		System.out.println(tv);

	}

}
