package composicao;

public class Departamento {

	private String nome;
	
	public Departamento(String nome) {
		this.nome = nome;		
	}
	
	public String getNome() {
		return nome;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Departamento other = (Departamento) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Departamento [nome=" + nome + "]";
	}			
}


