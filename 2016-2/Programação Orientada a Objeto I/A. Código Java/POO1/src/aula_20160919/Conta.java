package aula;

public class Conta {
	
	private float saldo;	
		
	public float getSaldo() {
		return saldo;
	}
	
	public boolean sacar(float valor) {
		boolean sucesso = false;		
		if (saldo >= valor) {
			saldo -= valor;
			sucesso = true;
		}		
		return sucesso;
	}
	
	public void depositar(float valor) {
		saldo += valor;
	}

}
