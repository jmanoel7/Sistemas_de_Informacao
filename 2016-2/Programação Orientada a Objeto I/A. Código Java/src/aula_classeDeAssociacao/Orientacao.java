package aula_classeDeAssociacao;

public class Orientacao {

	private Professor orientador;
	private Aluno orientando;
	private String titulo;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Professor getOrientador() {
		return orientador;
	}

	public void setOrientador(Professor orientador) {
		this.orientador = orientador;
	}

	public Aluno getOrientando() {
		return orientando;
	}

	public void setOrientando(Aluno orientando) {
		this.orientando = orientando;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Orientacao other = (Orientacao) obj;
		if (orientador == null) {
			if (other.orientador != null)
				return false;
		} else if (!orientador.equals(other.orientador))
			return false;
		if (orientando == null) {
			if (other.orientando != null)
				return false;
		} else if (!orientando.equals(other.orientando))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Orientacao [" + "orientando="
				+ orientando + ", titulo=" + titulo + "]";
	}
	
	public Orientacao(Professor orientador, Aluno orientando, String titulo) {	

		if (orientador == null) {
			throw new NullPointerException("A referência do Orientador não pode ser nula!");
		}

		if (orientando == null) {
			throw new NullPointerException("A referência do Orientando não pode ser nula!");
		}

		this.orientador = orientador;
		this.orientando = orientando;
		this.titulo = titulo;
	}

	public Orientacao(Aluno orientando, String titulo) {	

		if (orientando == null) {
			throw new NullPointerException("A referência do Orientando não pode ser nula!");
		}			

		this.orientando = orientando;
		this.titulo = titulo;
	}

}
