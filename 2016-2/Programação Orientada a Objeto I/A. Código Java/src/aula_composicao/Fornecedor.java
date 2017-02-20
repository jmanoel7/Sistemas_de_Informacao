package composicao;

public class Fornecedor {

	private String razaoSocial;
	private Contato contato;
		
	public Fornecedor(String razaoSocial) {				
		this.razaoSocial = razaoSocial;		
	}	

	public boolean addContato(String telefone, String email) {
		boolean sucesso = false;
		
		if (this.contato == null) {
			contato = new Contato(telefone, email);
			return true;
		}		
		
		return sucesso;		
	}
	
	public boolean removerContato() {
		boolean sucesso = false;
		
		if (contato != null) {
			contato = null;
			sucesso = true;
		}
		
		return sucesso;
	}
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	
	public Contato getContato() {
		return contato;
	}

	@Override
	public String toString() {	
		return "Fornecedor [razaoSocial=" + razaoSocial + ", contato="
				+ contato + "]";
	}	
	
}


