package agregacao;

public class Cliente {
	
	private String cpf;
		
	public Cliente(String cpf) {
		this.cpf = cpf;		
	}
	
	public String getCPF() {
		return cpf;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		return true;
	}		
	
	@Override
	public String toString() {
		return "Cliente [cpf=" + cpf + "]";
	}	
}

