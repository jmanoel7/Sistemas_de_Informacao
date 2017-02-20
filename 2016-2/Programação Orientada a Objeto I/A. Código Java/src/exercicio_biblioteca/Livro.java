package biblioteca;

public class Livro {

	private String titulo;
	private String autor;
	private String editora;
	
	public Livro(String titulo, String autor, String editora) {
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
	}

	public Livro(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", editora=" + editora + "]";
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
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (editora == null) {
			if (other.editora != null)
				return false;
		} else if (!editora.equals(other.editora))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

	
}
