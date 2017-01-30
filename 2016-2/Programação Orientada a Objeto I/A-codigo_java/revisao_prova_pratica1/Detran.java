package revisao_prova_pratica1;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

public class Detran {
	private String cidade;
	private List<Carro> listaCarros = new ArrayList<Carro>();
	private List<Email> listaEmails = new ArrayList<Email>();

	public Detran(String cidade, String descricao) {
		if (cidade == null)
			throw new NullPointerException("A cidade não pode ser nula.");
		this.cidade = cidade;
		if (descricao == null)
			throw new NullPointerException("O email não pode ser nulo.");
		Email email = new Email(descricao);
		listaEmails.add(email);
	}

	public void removeEmail(Email email) {
		if (email == null)
			throw new NullPointerException("O email não pode ser nulo.");
		if (listaEmails.size() > 1) {
			if (listaEmails.contains(email))
				listaEmails.remove(email);
			else
				throw new IndexOutOfBoundsException("O email não está na lista");
		} else
			throw new IndexOutOfBoundsException("A lista de email tem somente 1 (um) elemento.");
	}

	public void addEmail(String descricao) {
		if (descricao == null)
			throw new NullPointerException("O email não pode ser nulo.");
		if (listaEmails.size() < 10) {
			Email email = new Email(descricao);
			if (listaEmails.contains(email))
				throw new InvalidParameterException("O email já está cadastrado.");
			listaEmails.add(email);
		} else
			throw new IndexOutOfBoundsException("A lista de email já tem 10 (dez) elementos.");
	}

	public void removeCarro(Carro carro) {
		if (carro == null)
			throw new NullPointerException("O carro não pode ser nulo.");
		if (listaCarros.contains(carro))
			listaCarros.remove(carro);
		else
			throw new IndexOutOfBoundsException("O carro não está na lista");
	}

	public void addCarro(Carro carro) {
		if (carro == null)
			throw new NullPointerException("O carro não pode ser nulo.");
		if (listaCarros.contains(carro))
			throw new InvalidParameterException("O carro já está cadastrado.");
		listaCarros.add(carro);
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	@Override
	public String toString() {
		return "Detran [cidade=" + cidade + ", listaCarros=" + listaCarros
				+ ", listaEmails=" + listaEmails + "]";
	}
}
