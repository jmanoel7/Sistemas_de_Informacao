package heranca1;

public class Chefe extends Funcionario {
	
	private float gratificacao;

	public Chefe(String nome, float salario, float gratificacao) {
		super(nome, salario);
		this.gratificacao = gratificacao;
	}
	
	public float salarioLiquido() {
		return salario * 0.88f + gratificacao;
	}
	
	public float getGratificacao() {
		return gratificacao;
	}

	public void setGratificacao(float gratificacao) {
		this.gratificacao = gratificacao;
	}

	@Override
	public String toString() {
		return "Chefe [gratificacao=" + gratificacao + ", nome=" + nome + ", salario=" + salario + "]";
	}	
}


