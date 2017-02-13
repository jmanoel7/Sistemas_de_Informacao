package aula3;

public class TesteConta {

	public static void main(String[] args) {
		
		Conta cMaria = new Conta(123, "Maria");
		Conta cJoao = new Conta(345, "Joao", 250);
		
		cMaria.depositar(500);
		cMaria.depositar(-500);
		cMaria.depositar(-100);
		
		System.out.println("Nome: " + cJoao.getTitular());
		System.out.println("Saldo: " + cJoao.getSaldo());
		
		
		System.out.println("Nome: " + cMaria.getTitular());
		System.out.println("Saldo: " + cMaria.getSaldo());
		
		if (cMaria.sacar(1000)) {
			System.out.println("Ok");
			System.out.println("Saldo: " + cMaria.getSaldo());
		} else {
			System.err.println("Saldo Insuficiente");
		}
			
			
		
		
		
		
		
	}
	
}
