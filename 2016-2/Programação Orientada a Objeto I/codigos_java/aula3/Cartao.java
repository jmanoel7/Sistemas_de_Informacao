package aula3;

public class Cartao {
	
	private int senha;

	public Cartao(int senha) {	
		this.senha = senha;
	}

	public int getSenha() {
		return senha;
	}
	
	public boolean mudarSenha(int senha, int novaSenha) {
		boolean sucesso = false;
		
		if (senha == this.senha) {
			this.senha = novaSenha;
			sucesso = true;
		}
		
		return sucesso;
	}
	
	public boolean sacar(Conta conta, int senha, 
			float valor) {
		
		boolean sucesso = false;
		
		if ( (senha == this.senha) && 
			(conta.getSaldo() >= valor ) 
			) {
			
			conta.sacar(valor);
			sucesso = true;
		}
		
		return sucesso;
	}
	
	

}
