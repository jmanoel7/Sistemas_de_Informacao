package composicao;

public class TesteNotaFiscal {

	public static void main(String[] args) {

		NotaFiscal nf = new NotaFiscal("123", "Caneta", 5);
		System.out.println(nf);
		
		nf.addItem("Caderno", 3);
		System.out.println(nf);
		
		nf.removeItem("Caneta");
		System.out.println(nf);
		
		nf.removeItem("Caderno");
		System.out.println(nf);
		
		nf.addItem("R�gua", 15);
		nf.removeItem("Caderno");
		System.out.println(nf);
		
		nf.addItem("Borracha", 8);
		nf.addItem("Borracha", 10);		
		System.out.println(nf);
	}	
}




