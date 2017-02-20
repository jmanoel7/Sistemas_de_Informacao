package agregacao;

public class TesteConta {

	public static void main(String[] args) {
		
		Conta c;
		Cliente t1 = new Cliente("111");		
		Cliente t2 = new Cliente("222");
		Cliente t3 = null;
		Cliente t4 = new Cliente("333");
		
		try {
			c = new Conta("ABC", t3);
		} catch (NullPointerException e) {
			System.err.println(e.getMessage());
		}
		
		c = new Conta("ABC", t1);
		c.addCliente(t2);
		c.addCliente(t4);
		System.out.println(c);
		
		c.removerCliente(t1);
		c.removerCliente(t4);
		System.out.println(c);
		
		c.removerCliente(t2);
		System.out.println(c);		
	}	
}



