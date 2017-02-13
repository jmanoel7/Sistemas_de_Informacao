package composicao;

public class TesteFornecedor {

	public static void main(String[] args) {
		
		Fornecedor f = new Fornecedor("Distribuidora ABC");
		System.out.println(f);
		
		f.addContato("2345-6789", "abc@abc.com");
		f.addContato("0000-0000", "kkk@kkk.com");
		System.out.println(f);
		
		f.removerContato();
		f.addContato("9876-5432", "contato@abc.com");
		System.out.println(f);
	}	
}



