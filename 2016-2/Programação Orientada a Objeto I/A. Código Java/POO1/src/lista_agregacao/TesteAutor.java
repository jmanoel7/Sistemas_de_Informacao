package lista_agregacao;

public class TesteAutor {

	public static void main(String[] args) {

		Autor autor = null;
		int idade = 0;
		Livro l1 = null;

		try {
			autor = new Autor("João Antônio de Melo e Silva", idade, l1);
		} catch (NullPointerException e) {
			System.err.println(e.getMessage());
		}

		idade = 45;

		try {
			autor = new Autor("João Antônio de Melo e Silva", idade, l1);
		} catch (NullPointerException e) {
			System.err.println(e.getMessage());
		}

		l1 = new Livro("Programando em Python/Django", "Programação", 1);

		try {
			autor = new Autor("João Antônio de Melo e Silva", idade, l1);
		} catch (NullPointerException e) {
			System.err.println(e.getMessage());
		}

		System.out.println(autor);

		Livro l2 = new Livro("Programando em Python/wxPython", "Programação", 1);
		autor.addLivro(l2);

		System.out.println(autor);

		Livro l3 = new Livro("Programando em Python/wxPython", "Programação", 2);
		autor.addLivro(l3);

		System.out.println(autor);

		Livro l4 = new Livro("Programando em Python/Django", "Programação", 1);
		autor.addLivro(l4); // não adiciona

		System.out.println(autor);

		autor.removeLivro(l4); // remove l1, pois: l1.equals(l4) == true

		System.out.println(autor);
	}
}
