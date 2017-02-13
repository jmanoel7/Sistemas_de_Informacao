package lista_agregacao;

public class Livro {

	private String titulo;
	private String tema;
	private int edicao;

	public Livro(String titulo, String tema, int edicao) {
		this.titulo = titulo;
		this.tema = tema;
		this.edicao = edicao;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getTema() {
		return tema;
	}

	public int getEdicao() {
		return edicao;
	}

	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", tema=" + tema + ", edicao="
				+ edicao + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		if (edicao != other.edicao)
			return false;
		if (tema == null) {
			if (other.tema != null)
				return false;
		} else if (!tema.equals(other.tema))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

}
