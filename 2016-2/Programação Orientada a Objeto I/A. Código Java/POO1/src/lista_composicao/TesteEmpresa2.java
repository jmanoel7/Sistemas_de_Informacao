package lista_composicao;

public class TesteEmpresa2 {

	public static void main(String[] args) {
		Empresa2 emp2 = new Empresa2("João Manoel", "DevWeb JM7", "Fábrica de Software Ltda.", "84.726.550/0001-82");
		System.out.println(emp2);
		
		emp2.addTelefone(62, 30916246, false);
		System.out.println(emp2);
		
		emp2.addTelefone(62, 982013150, true);
		System.out.println(emp2);
		
		emp2.addTelefone(62, 981120959, true);
		System.out.println(emp2);
		
		emp2.removeTelefone(62, 30916246, true);
		System.out.println(emp2);

		emp2.removeTelefone(62, 30916246, false);
		System.out.println(emp2);
		
		emp2.removeTelefone(62, 982013150, false);
		System.out.println(emp2);

		emp2.removeTelefone(62, 981120959, true);
		System.out.println(emp2);

	}

}
