package agregacao;

import java.util.ArrayList;
import java.util.List;

public class Estante {

	private String numero;
	private List<Livro> listaLivro = new ArrayList<Livro>();
	
	public Estante(String numero) {
		this.numero = numero;
	}
	
	public boolean addLivro(Livro livro) {
		boolean sucesso = false;
		
		if (livro!= null && listaLivro.size() < 3 ) {
			listaLivro.add(livro);
			sucesso = true;
		} 
		return sucesso;
	}

	public boolean removerLivro(Livro livro) {
		boolean sucesso = false;
		
		if (listaLivro.size() > 0 && listaLivro.contains(livro)) {
			listaLivro.remove(livro);
			sucesso = true;
		}
		
		return sucesso;
	}
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public List<Livro> getListaLivro() {
		List<Livro> listaRetorno = new ArrayList<Livro>();		
		listaRetorno.addAll(listaLivro);	
		return listaRetorno;
	}
	
	@Override
	public String toString() {
		return "Estante [numero=" + numero + ", listaLivro=" + listaLivro + "]";
	}	
}


