package composicao;

import java.util.ArrayList;
import java.util.List;

public class Mao {

	private String dono;
	private List<Dedo> listaDedo = new ArrayList<Dedo>();
	
	public Mao(String dono) {
		this.dono = dono;
	}

	public boolean addDedo(int ordem) {
		boolean sucesso = false;
		
		Dedo dedo = new Dedo(ordem);
				
		if ( (ordem >= 1 && ordem <=5) && !listaDedo.contains(dedo) && listaDedo.size() < 4 ) {
			listaDedo.add(dedo);
			sucesso = true;
		} 
		return sucesso;
	}

	public boolean removerDedo(int ordem) {
		boolean sucesso = false;
		
		Dedo dedo = new Dedo(ordem);
		
		if (listaDedo.size() > 0 && listaDedo.contains(dedo)) {
			listaDedo.remove(dedo);
			sucesso = true;
		}
		
		return sucesso;
	}
	
	public String getDono() {
		return dono;
	}
	
	public List<Dedo> getListaDedo() {
		List<Dedo> listaRetorno = new ArrayList<Dedo>();		
		listaRetorno.addAll(listaDedo);	
		return listaRetorno;
	}

	@Override
	public String toString() {
		return "Mao [dono=" + dono + ", listaDedo=" + listaDedo + "]";
	}	
}


