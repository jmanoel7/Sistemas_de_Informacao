package biblioteca;

import java.util.List;
import java.util.ArrayList;

public class TesteLivro {

	public static void main(String[] args) {

		Livro livro1 = new Livro ("A poderosa voz de Deus", "Hernandes Dias Lopes", "Hagnos");
		Livro livro2 = new Livro ("A poderosa voz de Deus", "Hernandes Dias Lopes", "Hagnos");
		Livro livro3 = new Livro ("A segunda vinda de Cristo", "Hernandes Dias Lopes", "Hagnos");

		List<Livro> biblio = new ArrayList<Livro>();
		biblio.add( new Livro ("Fome de Deus", "Hernandes Dias Lopes", "Hagnos") );
		biblio.add( new Livro ("Apocalipse - o Futuro Chegou", "Hernandes Dias Lopes", "Hagnos") );
		biblio.add( new Livro ("As teses de Satanás", "Hernandes Dias Lopes", "Hagnos") );
		biblio.add( new Livro ("Como transformar o sofrimento em triunfo", "Hernandes Dias Lopes", "Hagnos") );

		// Testa se os objetos livro1 e livro2 referenciam o mesmo objeto na memória 
		if (livro1 == livro2)
			// apesar de livro1 e livro2 terem o mesmo estado, eles NÃO são o mesmo objeto,
			// logo a linha abaixo NÃO é executada:
			System.out.println("\nOs livros:\n\t" + livro1 + "\n\t" + livro2 + "\nreferenciam o mesmo objeto!\n");
		else
			// apesar de livro1 e livro2 terem o mesmo estado, eles NÃO são o mesmo objeto,
			// logo a linha abaixo é executada:
			System.out.println("\nOs livros:\n\t" + livro1 + "\n\t" + livro2 + "\nNÃO referenciam o mesmo objeto!\n");

		// Testa se os objetos livro1 e livro2 possuem o mesmo estado
		if (livro1.equals(livro2))
			// livro1 e livro2 possuem o mesmo estado, logo a linha abaixo é executada:
			System.out.println("\nOs livros:\n\t" + livro1 + "\n\t" + livro2 + "\npossuem o mesmo estado!\n");
		else
			// livro1 e livro2 possuem o mesmo estado, logo a linha abaixo NÃO é executada:
			System.out.println("\nOs livros:\n\t" + livro1 + "\n\t" + livro2 + "\nNÃO possuem o mesmo estado!\n");

		// Testa se os objetos livro1 e livro3 possuem o mesmo estado
		if (livro1.equals(livro3))
			// livro1 e livro3 NÃO possuem o mesmo estado, logo a linha abaixo NÃO é executada:
			System.out.println("Os livros:\n\t" + livro1 + "\n\t" + livro3 + "\npossuem o mesmo estado!\n");
		else
			// livro1 e livro3 NÃO possuem o mesmo estado, logo a linha abaixo é executada:
			System.out.println("Os livros:\n\t" + livro1 + "\n\t" + livro3 + "\nNÃO possuem o mesmo estado!\n");

		// Imprime a lista de livros biblio
		for (Livro livro : biblio) {
			System.out.println(livro);
		}

	}
}

