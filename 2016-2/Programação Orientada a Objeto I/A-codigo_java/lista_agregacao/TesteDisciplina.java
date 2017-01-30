package lista_agregacao;

public class TesteDisciplina {

	public static void main(String[] args) {

		Professor prof1 = new Professor("Renan", "111.111.111-11", "Informática I");
		Disciplina disciplina = new Disciplina ("Programação Orientada a Objetos1", 54, 54, prof1);

		System.out.println(disciplina);

		Professor prof2 = new Professor("Renan", "111.111.111-11", "Informática I");

		disciplina.addProfessor(prof2); // não adiciona

		System.out.println(disciplina);

		Professor prof3 = new Professor("Sirlon", "222.222.222-22", "Informática II");

		disciplina.addProfessor(prof3); // adiciona

		System.out.println(disciplina);

		disciplina.addProfessor(new Professor("João",     "333.333.333-33", "Informática III")); // adiciona
		disciplina.addProfessor(new Professor("Maria",    "444.444.444-44", "Informática IV" )); // adiciona
		disciplina.addProfessor(new Professor("Sandra",   "555.555.555-55", "Informática III")); // adiciona
		disciplina.addProfessor(new Professor("José",     "666.666.666-66", "Informática III")); // adiciona
		disciplina.addProfessor(new Professor("Emanuela", "777.777.777-77", "Informática III")); // adiciona
		disciplina.addProfessor(new Professor("Thiago",   "888.888.888-88", "Informática III")); // adiciona
		disciplina.addProfessor(new Professor("Camila",   "999.999.999-99", "Informática III")); // adiciona
		disciplina.addProfessor(new Professor("Mário",    "000.000.000-00", "Informática III")); // adiciona
		disciplina.addProfessor(new Professor("Rafael",   "121.121.121-12", "Informática III")); // não adiciona

		System.out.println(disciplina);

		disciplina.removeProfessor(prof2); // remove prof2: prof2 tem a mesma configuração que prof1

		System.out.println(disciplina);
	}

}
