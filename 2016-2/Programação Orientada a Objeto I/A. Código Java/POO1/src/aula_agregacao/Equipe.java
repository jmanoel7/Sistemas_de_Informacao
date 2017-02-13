package agregacao;

import java.util.ArrayList;
import java.util.List;

public class Equipe {

	private String nome;
	private List<Atleta> listaAtleta = new ArrayList<Atleta>();
	
	public Equipe(String nome) {
		this.nome = nome;
	}

	public boolean addAtleta(Atleta atleta) {
		boolean sucesso = false;
		
		if (atleta!= null && !listaAtleta.contains(atleta)) {
			listaAtleta.add(atleta);
			sucesso = true;
		} 
		return sucesso;
	}

	public boolean removerAtleta(Atleta a) {
		boolean sucesso = false;
		
		if (listaAtleta.size() > 0 && listaAtleta.contains(a)) {
			listaAtleta.remove(a);
			sucesso = true;
		}
		
		return sucesso;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
			
	public List<Atleta> getListaAtleta() {		
		List<Atleta> listaRetorno = new ArrayList<Atleta>();		
		listaRetorno.addAll(listaAtleta);	
		return listaRetorno;
	}

	@Override
	public String toString() {
		return "Time [nome=" + nome + ", listaAtleta=" + listaAtleta + "]";
	}	
}

