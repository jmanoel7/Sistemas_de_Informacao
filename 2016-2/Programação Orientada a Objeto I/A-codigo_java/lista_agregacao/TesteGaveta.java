package lista_agregacao;

public class TesteGaveta {

	public static void main(String[] args) {

		Gaveta gaveta = null;

		try {
			gaveta = new Gaveta((float) 0.0, (float) 25.0, (float) 15.0);
		} catch (NullPointerException e) {
			System.err.println(e.getMessage());
		}

		try {
			gaveta = new Gaveta((float) 50.0, (float) 0.0, (float) 15.0);
		} catch (NullPointerException e) {
			System.err.println(e.getMessage());
		}

		try {
			gaveta = new Gaveta((float) 50.0, (float) 25.0, (float) 0.0);
		} catch (NullPointerException e) {
			System.err.println(e.getMessage());
		}

		try {
			gaveta = new Gaveta((float) 50.0, (float) 25.0, (float) 15.0);
		} catch (NullPointerException e) {
			System.err.println(e.getMessage());
		}

		gaveta.addMeia(null); // não adiciona
		gaveta.addMeia(new Meia(38, 'c', "rosa"));
		gaveta.addMeia(new Meia(38, 'c', "rosa"));
		gaveta.addMeia(new Meia(39, 'm', "lilás"));
		gaveta.addMeia(new Meia(39, 'm', "lilás"));
		gaveta.addMeia(new Meia(43, 'l', "branco"));
		gaveta.addMeia(new Meia(43, 'l', "branco"));
		gaveta.addMeia(new Meia(43, 'l', "azul"));
		gaveta.addMeia(new Meia(43, 'l', "azul"));
		gaveta.addMeia(new Meia(43, 'm', "cinza"));
		gaveta.addMeia(new Meia(43, 'm', "cinza"));
		gaveta.addMeia(new Meia(43, 'm', "preto"));
		gaveta.addMeia(new Meia(43, 'm', "preto"));
		gaveta.addMeia(new Meia(43, 'm', "preto"));
		gaveta.addMeia(new Meia(43, 'm', "preto"));
		gaveta.addMeia(new Meia(43, 'm', "preto"));
		gaveta.addMeia(new Meia(43, 'm', "preto")); // não adiciona

		System.out.println(gaveta);

		gaveta.removeMeia(new Meia(37, 'm', "roxo")); // não remove

		System.out.println(gaveta);

		gaveta.removeMeia(new Meia(38, 'c', "rosa"));

		System.out.println(gaveta);

		gaveta.removeMeia(new Meia(38, 'c', "rosa"));

		System.out.println(gaveta);

	}

}
