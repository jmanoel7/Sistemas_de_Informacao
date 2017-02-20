package heranca2;

import java.text.ParseException;

public class Aluno extends Pessoa {

	private String curso;
		
	public Aluno(String nome, String dataNasc, String curso) throws ParseException {
		super(nome, dataNasc);
		this.curso = curso;		
	}
	
	public void aprender() {
		System.out.println("O aluno est� aprendendo!");
	}

	public String getCurso() {
		return curso;
	}

	public void setNome(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Aluno [curso=" + curso + ", nome=" + nome + ", dataNasc="
				+ dataNasc + "]";
	}			
}