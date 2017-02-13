package heranca2;

import java.text.ParseException;

public class Professor extends Pessoa {

	private String depto;
		
	public Professor(String nome, String dataNasc, String depto) throws ParseException {
		super(nome, dataNasc);
		this.depto = depto;		
	}
	
	public void ensinar() {
		System.out.println("O professor est� ensinando!");
	}

	public String getDepto() {
		return depto;
	}

	public void setDepto(String depto) {
		this.depto = depto;
	}

	@Override
	public String toString() {
		return "Professor [depto=" + depto + ", nome=" + nome + ", dataNasc="
				+ dataNasc + "]";
	}		
}