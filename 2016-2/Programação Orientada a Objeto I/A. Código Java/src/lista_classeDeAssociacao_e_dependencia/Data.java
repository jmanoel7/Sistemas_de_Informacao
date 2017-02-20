package lista_classeDeAssociacao_e_dependencia;

public class Data {
	private int ano;
	private int mes;
	private int dia;
	
	public Data(int ano, int mes, int dia) {
		this.ano = ano;
		this.mes = mes;
		this.dia = dia;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	@Override
	public String toString() {
		return "Data [ano=" + ano + ", mes=" + mes + ", dia=" + dia + "]";
	}
	
}
