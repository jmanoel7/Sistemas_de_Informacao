package lista_heranca;

public class ProfessorTemporario extends Professor {
	private String matTemp;
	private float acertoDeContas = 0.0f;
	
	public ProfessorTemporario(String nome, float salario, String titulacao, int cargaHoraria, String matTemp) {
		super(nome, salario, titulacao, cargaHoraria);
		this.matTemp = matTemp;
	}
	
	public ProfessorTemporario(String nome, float salario, float gratificacao, String titulacao, int cargaHoraria, String matTemp) {
		super(nome, salario, gratificacao, titulacao, cargaHoraria);
		this.matTemp = matTemp;
	}

	public String getMatTemp() {
		return matTemp;
	}

	public void setMatTemp(String matTemp) {
		this.matTemp = matTemp;
	}

	// Sobrecarregado
	public void nomeacao(boolean nomeado) {
		setNomeado(nomeado);
		return;
	}

	// Sobrescrito
	@Override
	public void demissao() {
		this.acertoDeContas = 50000.00f;
		super.setDemitido(true);
		return;
	}

	@Override
	public String toString() {
		return "ProfessorTemporario [matTemp=" + matTemp + ", acertoDeContas=" + acertoDeContas + ", getTitulacao()="
				+ getTitulacao() + ", getCargaHoraria()=" + getCargaHoraria() + ", isNomeado()=" + isNomeado()
				+ ", isDemitido()=" + isDemitido() + ", getNome()=" + getNome() + ", getSalario()=" + getSalario()
				+ ", getGratificacao()=" + getGratificacao() + "]";
	}
	
}
