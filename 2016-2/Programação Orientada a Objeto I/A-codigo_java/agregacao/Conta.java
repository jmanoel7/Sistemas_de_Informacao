package agregacao;

import java.util.ArrayList;
import java.util.List;

public class Conta {

	private String numero;
	private List<Cliente> listaCliente = new ArrayList<Cliente>();
	
	public Conta(String numero, Cliente cliente) {
		
		if (cliente == null) {
			throw new NullPointerException("A refer�ncia do Cliente n�o pode ser nula!");
		}
		
		this.numero = numero;
		this.addCliente(cliente);		
	}

	public boolean addCliente(Cliente titular) {
		boolean sucesso = false;
		
		if (titular!= null) {
			listaCliente.add(titular);
			sucesso = true;
		} 
		
		return sucesso;
	}
	
	public boolean removerCliente(Cliente a) {
		boolean sucesso = false;
		
		if (listaCliente.size() > 1 && listaCliente.contains(a)) {
			listaCliente.remove(a);
			sucesso = true;
		}
		
		return sucesso;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public List<Cliente> getListaCliente() {
		List<Cliente> listaRetorno = new ArrayList<Cliente>();		
		listaRetorno.addAll(listaCliente);	
		return listaRetorno;
	}
	
	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", listaCliente=" + listaCliente + "]";
	}	
}

