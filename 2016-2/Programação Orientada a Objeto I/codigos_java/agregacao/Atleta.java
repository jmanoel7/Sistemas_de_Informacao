package agregacao;

public class Atleta {

	private String nome;
	private String posicao;
	
	public Atleta(String nome, String posicao) {
		this.nome = nome;
		this.posicao = posicao;
	}
	
	public Atleta(String nome) {
		this.nome = nome;		
	}
	
	public String getNome() {
		return nome;
	}
		
	public String getPosicao() {
		return posicao;
	}
	
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Atleta other = (Atleta) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Atleta [nome=" + nome + ", posicao=" + posicao + "]";
	}	
}
