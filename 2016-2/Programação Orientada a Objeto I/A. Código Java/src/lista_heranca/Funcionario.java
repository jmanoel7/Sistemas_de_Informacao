package lista_heranca;

public class Funcionario {

	private String nome;
	private float salario;
	private float gratificacao;
	private float salarioMinimo = 1000.00f;

	public Funcionario(String nome, float salario) {
		this.nome = nome;
		// garantia do salario minimo
		if (salario < this.salarioMinimo)
			this.salario = this.salarioMinimo;
		else
			this.salario = salario;
	}

	public Funcionario(String nome, float salario, float gratificacao) {
		this.nome = nome;
		// garantia do salario minimo
		if (salario < this.salarioMinimo)
			this.salario = this.salarioMinimo;
		else
			this.salario = salario;
		// gratificacao minima = 0.00 reais
		if (gratificacao <= 0.00f)
			this.gratificacao = 0.00f;
		else
			this.gratificacao = gratificacao;
	}

	public String getNome() {
		return nome;
	}
	
	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		if (salario < this.salarioMinimo)
			this.salario = this.salarioMinimo;
		else
			this.salario = salario;
	}

	public float getGratificacao() {
		return gratificacao;
	}

	public void setGratificacao(float gratificacao) {
		// gratificacao minima = 0.00 reais
		if (gratificacao <= 0.00f)
			this.gratificacao = 0.00f;
		else
			this.gratificacao = gratificacao;
	}

	public float calculoSalario() {
		return getSalario();
	}

	public float calculoGratificacao() {
		return getGratificacao();
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", salario=" + salario + ", gratificacao=" + gratificacao
				+ ", salarioMinimo=" + salarioMinimo + ", calculoSalario()=" + calculoSalario()
				+ ", calculoGratificacao()=" + calculoGratificacao() + "]";
	}
	
}
