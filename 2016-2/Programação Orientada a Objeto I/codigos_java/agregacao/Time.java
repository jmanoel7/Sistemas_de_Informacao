package agregacao;

public class Time {

	private String nome;
	private Tecnico tecnico;

	public Time(String nome, Tecnico tecnico) {

		if (tecnico == null) {
			throw new NullPointerException("A refer�ncia do T�cnico n�o pode ser nula!");
		}

		this.nome = nome;		
		this.tecnico = tecnico;
	}

	public boolean trocaTecnico(Tecnico tecnico) {

		boolean sucesso = false;

		if (tecnico != null) {		
			this.tecnico = tecnico;
			sucesso = true;
		}

		return sucesso;
	}

	public String getNome() {
		return nome;
	}

	public Tecnico getTecnico() {
		return tecnico;
	}

	@Override
	public String toString() {
		return "Time [nome=" + nome + ", tecnico=" + tecnico + "]";
	}		
}

