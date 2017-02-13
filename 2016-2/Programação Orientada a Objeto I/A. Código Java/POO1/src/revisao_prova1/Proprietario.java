package revisao_prova_pratica1;

public class Proprietario {

	private String cpf;
	private String nome;

	public Proprietario(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Proprietario [cpf=" + cpf + ", nome=" + nome + "]";
	}


}
