package aula_classeDeAssociacao;

import java.util.ArrayList;
import java.util.List;



public class Professor {

	private String nome;
	private List<Orientacao> listaOrientacao = new ArrayList<Orientacao>();
	
	public Professor(String nome) {		
		this.nome = nome;
	}
	
	public boolean addOrientacao(Orientacao novaOrientacao) {
		boolean sucesso = false;
		
		if (novaOrientacao.getOrientador() == null) {
			novaOrientacao.setOrientador(this);
		}
		
		if (!this.equals(novaOrientacao.getOrientador())) {
			throw new IllegalArgumentException ("O Orientador não é válido.");
		}
		
		if (!listaOrientacao.contains(novaOrientacao)) {
			listaOrientacao.add(novaOrientacao);
			sucesso = true;
		}
		
		return sucesso;
	}
	
	public boolean removerOrientacao(Orientacao o) {
		boolean sucesso = false;
		
		if (listaOrientacao.size() > 0 && listaOrientacao.contains(o)) {
			listaOrientacao.remove(o);
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

	public List<Orientacao> getListaOrientacao() {
		List<Orientacao> listaRetorno = new ArrayList<Orientacao>();		
		listaRetorno.addAll(listaOrientacao);	
		return listaRetorno;	
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Professor other = (Professor) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Professor [nome=" + nome + ", listaOrientacao="
				+ listaOrientacao + "]";
	}	
}


