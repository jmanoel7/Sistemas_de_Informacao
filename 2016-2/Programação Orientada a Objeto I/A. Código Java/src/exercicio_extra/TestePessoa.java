/**
 * Pacote lista2 => Pacote com a resolução dos exercícios da Lista 2.
 */
package lista2;

import java.util.Date;
import java.text.SimpleDateFormat;

public class TestePessoa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Pessoa joao = new Pessoa("João Manoel", 'M', 123098, 1980);
		Pessoa sandra = new Pessoa("Sandra Ângela", 'F', 809143, 1969);
		Pessoa emanuela = new Pessoa("Emanuela", 'F', 147835, 2005);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		int anoAtual = Integer.parseInt(sdf.format(new Date()));
		
		System.out.println("Nome\t\tSexo\tIdentidade\tNascimento\tIdade\n");
		System.out.println(joao.getNome() + "\t" + joao.getSexo() + "\t" + joao.getNumIdentidade() + "\t\t" + joao.getAnoNascimento() + "\t\t" + joao.idade(anoAtual));
		System.out.println(sandra.getNome() + "\t" + sandra.getSexo() + "\t" + sandra.getNumIdentidade() + "\t\t" + sandra.getAnoNascimento() + "\t\t" + sandra.idade(anoAtual));
		System.out.println(emanuela.getNome() + "\t" + emanuela.getSexo() + "\t" + emanuela.getNumIdentidade() + "\t\t" + emanuela.getAnoNascimento() + "\t\t" + emanuela.idade(anoAtual));

	}

}
