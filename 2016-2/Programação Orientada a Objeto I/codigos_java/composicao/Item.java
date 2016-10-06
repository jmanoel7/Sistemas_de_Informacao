package composicao;

public class Item {

	private String descricao;
	private int qtde;
	
	public Item(String descricao, int qtde) {
		this.descricao = descricao;		
		this.qtde = qtde;
	}
	
	public Item(String descricao) {
		this.descricao = descricao;		
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public int getQtde() {
		return qtde;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Item [descricao=" + descricao + ", qtde=" + qtde + "]";
	}			
}


