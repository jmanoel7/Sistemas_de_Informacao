package heranca2;

import java.text.ParseException;

public class TestePessoa {

	public static void main(String[] args) throws ParseException {
		
		Pessoa pessoa = new Pessoa("Thiago", "15/09/1975");
		System.out.println(pessoa);
		
		Professor professor = new Professor("Renan", "27/04/1984", "Depto IV");
		System.out.println(professor);
		
		Aluno aluno = new Aluno("Carla", "05/08/1997", "Sistemas de Informa��o");
		System.out.println(aluno);
		
		System.out.println(
				"Idade das Pessoas: " + "\n" +
				pessoa.getNome() + "(" + pessoa.idade() + ") " +
				professor.getNome() + "(" + professor.idade() + ") " +
				aluno.getNome() + "(" + aluno.idade() + ")"
				);
		
		professor.ensinar();
		aluno.aprender();
		
	}	
}