package lista_heranca;

public class Administrativo extends Funcionario {

	// matricula administrativa
	private String matAdm;
	private float auxilioAlimentacao = 300.00f;
	private int cargaHoraria = 160;

	public Administrativo(String nome, float salario, String matAdm) {
		super(nome, salario);
		this.matAdm = matAdm;
	}

	public Administrativo(String nome, float salario, float gratificacao, String matAdm) {
		super(nome, salario, gratificacao);
		this.matAdm = matAdm;
	}

	public String getMatAdm() {
		return matAdm;
	}

	public void setMatAdm(String matAdm) {
		this.matAdm = matAdm;
	}

	// Sobrescrito
	@Override
	public float calculoSalario() {
		return super.calculoSalario() + this.auxilioAlimentacao;
	}

	// Sobrecarregado
	public float calculoGratificacao(int horas) {
		return super.getSalario()/this.cargaHoraria * horas;
	}

	@Override
	public String toString() {
		return "Administrativo [matAdm=" + matAdm + ", auxilioAlimentacao=" + auxilioAlimentacao + ", cargaHoraria="
				+ cargaHoraria + ", calculoSalario()=" + calculoSalario() + ", getNome()=" + getNome()
				+ ", getSalario()=" + getSalario() + ", getGratificacao()=" + getGratificacao()
				+ ", calculoGratificacao()=" + calculoGratificacao() + "]";
	}

}
