package lista_composicao;

public class Empresa {

	private String nomeFantasia;
	private String nomeReal;
	private String cnpj;
	private Site site;
	
	public Empresa(String nomeFantasia, String nomeReal, String cnpj) {
		this.nomeFantasia = nomeFantasia;
		this.nomeReal = nomeReal;
		this.cnpj = cnpj;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public String getNomeReal() {
		return nomeReal;
	}

	public String getCnpj() {
		return cnpj;
	}

	public Site getSite() {
		return site;
	}

	public boolean addSite(String URL, boolean ssl) {
		boolean sucesso = false;
		
		if (this.site == null) {
			this.site = new Site(URL, ssl);
			sucesso = true;
		}
		
		return sucesso;
	}
	
	public boolean removeSite() {
		boolean sucesso = false;
		
		if (this.site != null) {
			this.site = null;
			sucesso = true;
		}
		
		return sucesso;
	}
	
	@Override
	public String toString() {
		return "Empresa [nomeFantasia=" + nomeFantasia + ", nomeReal=" + nomeReal + ", cnpj=" + cnpj + ", site=" + site
				+ "]";
	}
	
	
}
