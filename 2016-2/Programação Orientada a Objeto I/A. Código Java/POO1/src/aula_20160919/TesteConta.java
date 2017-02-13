package aula;

public class TesteConta {

	public static void main(String[] args) {
		
		Conta a = new Conta();
		
		System.out.println("Saldo " + a.getSaldo());
		
		a.depositar(150);
		System.out.println("Saldo " + a.getSaldo());
		
		a.sacar(50);
		System.out.println("Saldo " + a.getSaldo());
		
		
	}
	
}
