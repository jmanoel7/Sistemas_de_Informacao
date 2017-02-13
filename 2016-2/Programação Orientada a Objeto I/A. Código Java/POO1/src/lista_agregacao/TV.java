package lista_agregacao;

import java.util.ArrayList;
import java.util.List;

public class TV {

	private String marca;
	private String modelo;
	private List<DVD> listaDVD = new ArrayList<DVD>();
	
	public TV(String marca, String modelo, DVD dvd) {
		
		this.marca = marca;
		this.modelo = modelo;
		
		if (dvd == null) {
			throw new NullPointerException("A referência do DVD não pode ser nula!");
		}
		
		this.addDVD(dvd);
	}

	public TV(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	public boolean addDVD(DVD aparelho) {
		boolean sucesso = false;
		
		if (this.listaDVD.size() <= 2 && aparelho != null) {
			
			if (!listaDVD.contains(aparelho)) {
			
				listaDVD.add(aparelho);
				sucesso = true;
			
			}
		} 
		
		return sucesso;
	}

	public boolean removeDVD(DVD aparelho) {
		boolean sucesso = false;
		
		if (this.listaDVD.size() > 0 && aparelho != null) {

			if (listaDVD.contains(aparelho)) {
			
				listaDVD.remove(aparelho);
				sucesso = true;
				
			}
		} 
		
		return sucesso;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "TV [marca=" + marca + ", modelo=" + modelo + ", listaDVD=" + listaDVD + "]";
	}
	
}
