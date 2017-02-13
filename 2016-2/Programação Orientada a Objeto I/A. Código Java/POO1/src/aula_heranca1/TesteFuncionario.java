package heranca1;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario f = new Funcionario("Pedro", 2000); 
		Chefe c = new Chefe("Marcos", 5000, 3000);
		
		System.out.println(f);
		System.out.println("Salário Liquido do " + f.getNome() + 
				" = " + f.salarioLiquido());
		
		System.out.println(c);
		System.out.println("Salário Liquido do " + c.getNome() + 
				" = " + c.salarioLiquido());		
	}	
}


