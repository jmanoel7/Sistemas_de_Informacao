package composicao;

import java.util.ArrayList;
import java.util.List;

public class Escola {

	private String nome;
	private List<Departamento> listaDepto = new ArrayList<Departamento>();
	
	public Escola(String nome) {
		this.nome = nome;
	}
	
	public boolean addDepto(String nome) {
		boolean sucesso = false;
		
		Departamento depto = new Departamento(nome);
				
		if (!listaDepto.contains(depto)) {
			listaDepto.add(depto);
			sucesso = true;
		} 
		return sucesso;
	}

	public boolean removeDepto(String nome) {
		boolean sucesso = false;
		
		Departamento depto = new Departamento(nome);
		
		if (listaDepto.size() > 0 && listaDepto.contains(depto)) {
			listaDepto.remove(depto);
			sucesso = true;
		}
		
		return sucesso;
	}
		
	public String getNome() {
		return nome;
	}
	
	public List<Departamento> getListaDepto() {
		List<Departamento> listaRetorno = new ArrayList<Departamento>();		
		listaRetorno.addAll(listaDepto);	
		return listaRetorno;
	}

	@Override
	public String toString() {
		return "Escola [nome=" + nome + ", listaDepto=" + listaDepto + "]";
	}	
}
