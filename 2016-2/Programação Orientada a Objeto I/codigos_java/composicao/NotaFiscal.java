package composicao;

import java.util.ArrayList;
import java.util.List;

public class NotaFiscal {

	private String codigo;
	private List<Item> listaItem = new ArrayList<Item>();
	
	public NotaFiscal(String codigo, String descricao, int qtde) {
		this.codigo = codigo;
		
		this.addItem(descricao, qtde);
	}
	
	public boolean addItem(String descricao, int qtde) {
		boolean sucesso = false;
		
		Item i = new Item(descricao, qtde);
				
		if (!listaItem.contains(i)) {
			listaItem.add(i);
			sucesso = true;
		} 
		return sucesso;
	}

	public boolean removeItem(String descricao) {
		boolean sucesso = false;
		
		Item i = new Item(descricao);
		
		if (listaItem.size() > 1 && listaItem.contains(i)) {
			listaItem.remove(i);
			sucesso = true;
		}
		
		return sucesso;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public List<Item> getListaItem() {
		List<Item> listaRetorno = new ArrayList<Item>();		
		listaRetorno.addAll(listaItem);	
		return listaRetorno;
	}

	@Override
	public String toString() {
		return "NotaFiscal [codigo=" + codigo + ", listaItem=" + listaItem
				+ "]";
	}	
}


