package lista_agregacao;

import java.util.ArrayList;
import java.util.List;

public class Autor {

	private String nome;
	private int idade;
	private List<Livro> listaLivro = new ArrayList<Livro>();

	public Autor(String nome, int idade, Livro livro) {
		if (nome == null)
			throw new NullPointerException("O nome do autor não pode ser nulo!!!");
		this.nome = nome;
		if (idade == 0)
			throw new NullPointerException("A idade do autor não pode ser nula!!!");
		this.idade = idade;
		if (livro == null)
			throw new NullPointerException("A referência ao livro do autor não pode ser nula!!!");
		this.listaLivro.add(livro);
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public List<Livro> getListaLivro() {
		return listaLivro;
	}

	public boolean addLivro(Livro livro) {
		boolean sucesso = false;
		if (livro != null && !listaLivro.contains(livro)) {
			listaLivro.add(livro);
			sucesso = true;
		}
		return sucesso;
	}

	public boolean removeLivro(Livro livro) {
		boolean sucesso = false;
		if (
			livro != null &&
			listaLivro.size() > 1 &&
			listaLivro.contains(livro)
		) {
			listaLivro.remove(livro);
			sucesso = true;
		}
		return sucesso;
	}

	@Override
	public String toString() {
		return "Autor [nome=" + nome + ", idade=" + idade
				+ ", listaLivro=" + listaLivro + "]";
	}

}
