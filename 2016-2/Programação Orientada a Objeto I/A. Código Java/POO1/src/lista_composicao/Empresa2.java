package lista_composicao;

import java.util.ArrayList;
import java.util.List;

public class Empresa2 {

	private String dono;
	private String nomeFantasia;
	private String nomeReal;
	private String cnpj;
	private List<Telefone> listaTelefone = new ArrayList<Telefone>();
	
	public Empresa2(String dono, String nomeFantasia, String nomeReal, String cnpj) {
		this.dono = dono;
		this.nomeFantasia = nomeFantasia;
		this.nomeReal = nomeReal;
		this.cnpj = cnpj;
	}

	public String getDono() {
		return dono;
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

	public List<Telefone> getListaTelefone() {
		return listaTelefone;
	}

	public boolean addTelefone(int ddd, int numero, boolean celular) {
		boolean sucesso = false;
		
		Telefone tel = new Telefone(ddd, numero, celular);
		
		if ( ! listaTelefone.contains(tel) ) {
			listaTelefone.add(tel);
			sucesso = true;
		}
		
		return sucesso;
	}
	
	public boolean removeTelefone(int ddd, int numero, boolean celular) {
		boolean sucesso = false;
		
		Telefone tel = new Telefone(ddd, numero, celular);
		
		if ( listaTelefone.size() > 0 && listaTelefone.contains(tel) ) {
			listaTelefone.remove(tel);
			sucesso = true;
		}
		
		return sucesso;
	}

	@Override
	public String toString() {
		return "Empresa2 [dono=" + dono + ", nomeFantasia=" + nomeFantasia + ", nomeReal=" + nomeReal + ", cnpj=" + cnpj
				+ ", listaTelefone=" + listaTelefone + "]";
	}

	/*
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
	*/

	

}
