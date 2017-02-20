package lista_agregacao;

import java.util.ArrayList;
import java.util.List;

public class Gaveta {
	private float comprimento;
	private float largura;
	private float altura;
	private List<Meia> listaMeia = new ArrayList<Meia>();

	public Gaveta(float comprimento, float largura, float altura) {

		if (comprimento == 0.0)
			throw new NullPointerException("A referência ao comprimento da gaveta não pode ser nula!");
		this.comprimento = comprimento;

		if (largura == 0.0)
			throw new NullPointerException("A referência à largura da gaveta não pode ser nula!");
		this.largura = largura;

		if (altura == 0.0)
			throw new NullPointerException("A referência à altura da gaveta não pode ser nula!");
		this.altura = altura;

	}

	public float getComprimento() {
		return comprimento;
	}

	public float getLargura() {
		return largura;
	}

	public float getAltura() {
		return altura;
	}

	public List<Meia> getListaMeia() {
		return listaMeia;
	}

	public boolean addMeia(Meia meia) {
		boolean sucesso = false;

		if (meia != null && listaMeia.size() < 15) {

				listaMeia.add(meia);
				sucesso = true;

		}
		return sucesso;
	}

	public boolean removeMeia(Meia meia) {
		boolean sucesso = false;

		if (meia != null && listaMeia.size() > 0 && listaMeia.contains(meia)) {

				listaMeia.remove(meia);
				sucesso = true;

		}

		return sucesso;
	}

	@Override
	public String toString() {
		return "Gaveta [comprimento=" + comprimento + ", largura=" + largura
				+ ", altura=" + altura + ", listaMeia=" + listaMeia + "]";
	}

}
