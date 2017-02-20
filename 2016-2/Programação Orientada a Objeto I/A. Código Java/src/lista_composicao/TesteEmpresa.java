package lista_composicao;

public class TesteEmpresa {

	public static void main(String[] args) {
		
		Empresa emp = new Empresa("Editora Fiel", "Editora Fiel Ltda.", "12345678901234");
		System.out.println(emp);

		emp.addSite("http://editorafiel.pt/loja/", false);
		emp.addSite("http://editorafiel.pt/", false);
		System.out.println(emp);
		
		emp.removeSite();
		emp.addSite("http://editorafiel.pt/", false);
		System.out.println(emp);
		
	}

}
