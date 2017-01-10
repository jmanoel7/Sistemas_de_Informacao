package lista_composicao;

public class Corpo {

	private float altura;
	private float largura;
	private Perna pernaDireita;
	private Perna pernaEsquerda;
	
	public Corpo(float altura, float largura) {
		this.altura = altura;
		this.largura = largura;
	}

	public float getAltura() {
		return altura;
	}

	public float getLargura() {
		return largura;
	}

	public Perna getPernaDireita() {
		return pernaDireita;
	}

	public Perna getPernaEsquerda() {
		return pernaEsquerda;
	}

	public boolean addPerna(float comprimento, char posicao) {
		boolean sucesso = false;
		
		if ( comprimento > 0.0 ) {
			if (posicao == 'D' && this.pernaDireita == null) {

				this.pernaDireita = new Perna(comprimento, 'D');
				sucesso = true;			
			
			} else if (posicao == 'E' && this.pernaEsquerda == null) {
			
				this.pernaEsquerda = new Perna(comprimento, 'E');
				sucesso = true;			
			
			}
		}
		
		return sucesso;
	}

	public boolean removePerna(float comprimento, char posicao) {
		boolean sucesso = false;
		
		Perna perna = new Perna(comprimento, posicao);
		
		if ( perna.equals( this.pernaDireita )) {

			this.pernaDireita = null;
			sucesso = true;
	
		} else if ( perna.equals( this.pernaEsquerda )) {

			this.pernaEsquerda = null;
			sucesso = true;
			
		}
		
		return sucesso;
	}
	
	@Override
	public String toString() {
		return "Corpo [altura=" + altura + ", largura=" + largura + ", pernaDireita=" + pernaDireita
				+ ", pernaEsquerda=" + pernaEsquerda + "]";
	}
	
}
