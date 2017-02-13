package revisao_prova_pratica1;

public class TesteDetran {

	public static void main(String[] args) {

		Proprietario p = new Proprietario("888", "Renan");
		System.out.println(p);

		Carro c = new Carro("Civic", "NNN-8888", 987, p);
		Carro c2 = new Carro("Corola", "NNN-9999", 656, p);
		Carro c3 = new Carro("C3", "NNN-4444", 656, p);
		System.out.println(c);

		c.trocarVolante(555);
		System.out.println(c);

		Detran d = new Detran("Goiânia", "sac@detran.go.gov.br");
		d.addCarro(c);
		d.addCarro(c2);
		d.addCarro(c3);
		System.out.println(d);

		d.removeCarro(c3);
		System.out.println(d);

		d.addEmail("atendimento@detran.go.gov.br");
		//d.addEmail("atendimento@detran.go.gov.br");
		d.addEmail("multas@detran.go.gov.br");
		d.addEmail("financeiro@detran.go.gov.br");
		d.addEmail("compras@detran.go.gov.br");
		d.addEmail("negociacao@detran.go.gov.br");
		d.addEmail("cnh@detran.go.gov.br");
		d.addEmail("placa@detran.go.gov.br");
		d.addEmail("renovacao@detran.go.gov.br");
		d.addEmail("corregedoria@detran.go.gov.br");
		//d.addEmail("rh@detran.go.gov.br");
		System.out.println(d);

		Email e1  = new Email("atendimento@detran.go.gov.br");
		Email e2  = new Email("multas@detran.go.gov.br");
		Email e3  = new Email("financeiro@detran.go.gov.br");
		Email e4  = new Email("compras@detran.go.gov.br");
		Email e5  = new Email("negociacao@detran.go.gov.br");
		Email e6  = new Email("cnh@detran.go.gov.br");
		Email e7  = new Email("placa@detran.go.gov.br");
		Email e8  = new Email("renovacao@detran.go.gov.br");
		Email e9  = new Email("corregedoria@detran.go.gov.br");
		//Email e10 = new Email("sac@detran.go.gov.br");
		//Email e11 = new Email("cnh@detran.go.gov.br");
		//Email e12 = null;

		//d.removeEmail(e12);
		//System.out.println(d);

		d.removeEmail(e1);
		d.removeEmail(e2);
		d.removeEmail(e3);
		System.out.println(d);

		d.removeEmail(e4);
		d.removeEmail(e5);
		d.removeEmail(e6);
		//d.removeEmail(e11);
		System.out.println(d);

		d.removeEmail(e7);
		d.removeEmail(e8);
		d.removeEmail(e9);
		System.out.println(d);

		//d.removeEmail(e10);
		//System.out.println(d);

	}

}
