package heranca2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Pessoa {

	protected String nome;
	protected Date dataNasc;
	
	public Pessoa(String nome, String dataNasc) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		
		this.nome = nome;		
		this.dataNasc = (Date)format.parse(dataNasc);  
	}	

	public int idade() {
		Calendar c1 = Calendar.getInstance(); 
		Calendar c2 = Calendar.getInstance();
		
		c2.setTime(dataNasc);	
		
		return c1.get(Calendar.YEAR) - c2.get(Calendar.YEAR);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", dataNasc=" + dataNasc + "]";
	}			
}
