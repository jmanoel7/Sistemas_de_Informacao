package lista_heranca;

public class Professor extends Funcionario {

	// titulação professor
	private String titulacao;
	// carga horaria de aulas dadas semanalmente
	private int cargaHoraria;
	// valor base da carga horaria
	private float valorCargaHoraria = 18.50f;
	// nomeado
	private boolean nomeado;
	// private demitido
	private boolean demitido;
	
	public Professor(String nome, float salario, String titulacao, int cargaHoraria) {
		super(nome, salario);
		this.titulacao = titulacao;
		this.cargaHoraria = cargaHoraria;
	}
	
	public Professor(String nome, float salario, float gratificacao, String titulacao, int cargaHoraria) {
		super(nome, salario, gratificacao);
		this.titulacao = titulacao;
		this.cargaHoraria = cargaHoraria;
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	public boolean isNomeado() {
		return nomeado;
	}

	public void setNomeado(boolean nomeado) {
		this.nomeado = nomeado;
	}

	public boolean isDemitido() {
		return demitido;
	}

	public void setDemitido(boolean demitido) {
		this.demitido = demitido;
	}

	// Sobrescrito
	@Override
	public float calculoSalario() {
		return super.calculoSalario() +  cargaHoraria * 4 * valorCargaHoraria;
	}

	// Sobrecarregado
	public float calculoGratificacao(boolean DE) {
		float extra = 0.1f;
		if (titulacao == "Formado") {
			extra = 0.2f;
		} else if (titulacao == "Especialista") {
			extra = 0.4f;
		} else if (titulacao == "Mestre") {
			extra = 0.7f;
		} else if (titulacao == "Doutor") {
			extra = 1.0f;
		}
		if (DE)
			return cargaHoraria * 4 * valorCargaHoraria * extra * 2.0f;
		else
			return cargaHoraria * 4 * valorCargaHoraria * extra;
	}

	public void nomeacao() {
		setNomeado(true);
		return;
	}

	public void demissao() {
		setDemitido(true);
		return;
	}

	@Override
	public String toString() {
		return "Professor [titulacao=" + titulacao + ", cargaHoraria=" + cargaHoraria + ", valorCargaHoraria="
				+ valorCargaHoraria + ", nomeado=" + nomeado + ", demitido=" + demitido + ", calculoSalario()="
				+ calculoSalario() + ", getNome()=" + getNome() + ", getSalario()=" + getSalario()
				+ ", getGratificacao()=" + getGratificacao() + ", calculoGratificacao()=" + calculoGratificacao() + "]";
	}
	
}
