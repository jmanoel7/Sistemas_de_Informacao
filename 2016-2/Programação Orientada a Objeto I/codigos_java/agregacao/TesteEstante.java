package agregacao;

public class TesteEstante {

	public static void main(String[] args) {
				
		Livro lv1 = new Livro("Introdu��o � Programa��o Usando Java", "Rafael Santos", "C�mpus");
		Livro lv2 = new Livro("Utilizando UML e Padr�es", "Larman", "Bookman");
		Livro lv3 = new Livro("Java: Como Programar", "Deitel", "Pearson");
		Livro lv4 = new Livro("Programa��o Orientada a Objetos com Java", "Barnes", "Pearson");
		
		Estante e = new Estante("AB-123");
		
		e.addLivro(lv1);
		e.addLivro(lv2);
		e.addLivro(lv3);
		e.addLivro(lv4);
		System.out.println(e);
		
		e.removerLivro(lv2);
		e.addLivro(lv4);
		System.out.println(e);		
		
	}	
}



