package lista_heranca;

public class ProfessorEfetivo extends Professor {

	// matricula de prof. efetivo
	private String matProf;
	// acerto de contas na demissao
	private float acertoDeContas = 0.0f;
	
	public ProfessorEfetivo(String nome, float salario, String titulacao, int cargaHoraria, String matProf) {
		super(nome, salario, titulacao, cargaHoraria);
		this.matProf = matProf;
	}

	public ProfessorEfetivo(String nome, float salario, float gratificacao, String titulacao, int cargaHoraria, String matProf) {
		super(nome, salario, gratificacao, titulacao, cargaHoraria);
		this.matProf = matProf;
	}

	public String getMatProf() {
		return matProf;
	}

	public void setMatProf(String matProf) {
		this.matProf = matProf;
	}

	// Sobrecarregado
	public void nomeacao(boolean nomeado) {
		setNomeado(nomeado);
		return;
	}

	// Sobrescrito
	@Override
	public void demissao() {
		this.acertoDeContas = 100000.00f;
		super.setDemitido(true);
		return;
	}

	@Override
	public String toString() {
		return "ProfessorEfetivo [matProf=" + matProf + ", acertoDeContas=" + acertoDeContas + ", getTitulacao()="
				+ getTitulacao() + ", getCargaHoraria()=" + getCargaHoraria() + ", isNomeado()=" + isNomeado()
				+ ", isDemitido()=" + isDemitido() + ", getNome()=" + getNome() + ", getSalario()=" + getSalario()
				+ ", getGratificacao()=" + getGratificacao() + "]";
	}

}
