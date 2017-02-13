package lista2;

import java.util.Scanner;

public class TesteConta {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o salario do João: ");
		float sJoao = in.nextFloat();
		Conta cJoao = new Conta(456, "João", 250, 1000, sJoao);
		
		System.out.println("Digite o salario da Maria: ");
		float sMaria = in.nextFloat();
		Conta cMaria = new Conta(123, "Maria", 100, 1200, sMaria);
		
		in.close();
		
		cJoao.deposito(1000);
		cJoao.deposito(-500);
		
		System.out.println("Nome: " + cJoao.getNome());
		System.out.println("Saldo: " + cJoao.saldo());

		if (cJoao.retira(2000)) {
			System.out.println("Retirada de 2000 de Joao Ok!");
			System.out.println("Saldo: " + cJoao.saldo());
		} else {
			System.err.println("Saldo insuficiente para João retirar 2000!");
		}

		cMaria.deposito(450);
		cMaria.deposito(-75);		
		
		System.out.println("Nome: " + cMaria.getNome());
		System.out.println("Saldo: " + cMaria.saldo());
		
		if (cMaria.retira(1000)) {
			System.out.println("Retirada de 1000 de Maria Ok!");
			System.out.println("Saldo: " + cMaria.saldo());
		} else {
			System.err.println("Saldo insuficiente para Maria retirar 1000!");
		}
	
	}	
}
