package lista_heranca;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario f = new Funcionario("Maria Ângela", 900.0f, -10.0f);
		System.out.println(f);
		f.setGratificacao(20.34f);
		f.setSalario(1500.0f);
		System.out.println(f);
		
		Administrativo a = new Administrativo("Gabriel Santos", 1200f, 10f, "20171001");
		System.out.println(a);
		a.setSalario(1230f);
		a.setGratificacao(11.2f);
		System.out.println(a);

		Professor p1 = new Professor("Renan", 2000f, 20f, "Mestre", 40);
		System.out.println(p1);
		p1.setGratificacao(25f);
		p1.setSalario(2500f);
		System.out.println(p1);
		p1.setTitulacao("Doutor");
		System.out.println(p1);

		Professor p2 = new ProfessorEfetivo("Thiago", 2200f, 21f, "Mestre", 20, "20171002");
		System.out.println(p2);
		p2.setGratificacao(25f);
		p2.setSalario(2500f);
		System.out.println(p2);
		p2.setTitulacao("Doutor");
		System.out.println(p2);

		Professor p3 = new ProfessorTemporario("Ronaldo", 2300f, 21f, "Mestre", 20, "20171003");
		System.out.println(p3);
		p3.setGratificacao(19f);
		p3.setSalario(2670f);
		System.out.println(p3);
		p3.setTitulacao("Doutor");
		System.out.println(p3);
		
	}

}
