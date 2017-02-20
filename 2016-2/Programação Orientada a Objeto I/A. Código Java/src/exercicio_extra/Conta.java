package lista2;

public class Conta {

	private int numero;
	private String nome;
	private float saldo;
	private float limite;
	
	public Conta(int numero, String nome, float saldo, float limite, float salario) {		
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
		if (limite <= salario)
			this.limite = limite;
		else
			this.limite = salario;
	}

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float saldo() {
		return saldo;
	}
	
	public boolean deposito (float valor) {
		boolean sucesso = false;
		
		if (valor > 0) {
			saldo += valor;
			sucesso = true;	
		}
		
		return sucesso;
	}
	
	public boolean retira(float valor) {
		boolean sucesso = false;
		
		if (saldo + limite >= valor) {
			saldo -= valor;
			sucesso = true;
		}
		
		return sucesso;		
	}
	
}
