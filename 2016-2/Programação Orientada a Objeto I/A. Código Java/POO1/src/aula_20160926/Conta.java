package aula3;

public class Conta {

	private int numero;
	private String titular;
	private float saldo;
		
	public Conta(int numero, String titular) {		
		this.numero = numero;
		this.titular = titular;
	}
	
	public Conta(int numero, String titular, float saldo) {		
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public float getSaldo() {
		return saldo;
	}
	
	public boolean depositar (float valor) {
		boolean sucesso = false;
		
		if (valor > 0) {
			saldo += valor;
			sucesso = true;	
		}
		
		return sucesso;
	}
	
	public boolean sacar(float valor) {
		boolean sucesso = false;
		
		if (saldo >= valor) {
			saldo -= valor;
			sucesso = true;
		}
		
		return sucesso;		
	}
	
}
