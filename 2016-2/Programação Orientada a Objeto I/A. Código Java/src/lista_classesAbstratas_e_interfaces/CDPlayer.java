package lista_classesAbstratas_e_interfaces;

/**
 * @author João Manoel <joao.manoel@academico.ifg.edu.br>
 *
 */
public class CDPlayer implements Player {

	private String marca;
	private String modelo;
	private int numFaixas;
	private int faixa;
    private boolean tocando;
    private boolean fimFaixa;
    private boolean inicioFaixa;
    private boolean reverso;
    private char estadoAnterior;

	public CDPlayer(String marca, String modelo, int numFaixas) {
		this.marca = marca;
		this.modelo = modelo;
		this.numFaixas = numFaixas;
        this.inicioFaixa = true;
        this.faixa = 1;
        this.fimFaixa = false;
        this.tocando = false;
        this.reverso = false;
        this.estadoAnterior = 'P';
	}
	
	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getNumFaixas() {
		return numFaixas;
	}

	public boolean isTocando() {
		return tocando;
	}

	public boolean isFimFaixa() {
		return fimFaixa;
	}

	public boolean isInicioFaixa() {
		return inicioFaixa;
	}

	public int getFaixa() {
		return faixa;
	}

	public void setFaixa(int faixa) {
		this.faixa = (faixa >= 1 && faixa <= this.numFaixas) ? faixa : 1;
	}

	public boolean isReverso() {
		return reverso;
	}
	
	@Override
	public String toString() {
		return "CDPlayer [marca=" + marca + ", modelo=" + modelo + ", numFaixas=" + numFaixas + ", faixa=" + faixa
				+ ", tocando=" + tocando + ", fimFaixa=" + fimFaixa + ", inicioFaixa=" + inicioFaixa + ", reverso="
				+ reverso + ", estadoAnterior=" + estadoAnterior + "]";
	}

	/* (non-Javadoc)
	 * @see lista_interfaces.Player#play()
	 */
	@Override
	public void play() {
		if (this.estadoAnterior == 'P') {
			if (this.fimFaixa) {
	    		this.faixa = (this.faixa < this.numFaixas) ? this.faixa + 1 : 1;
				this.estadoAnterior = 'P';
	    		this.tocando = true;
	    		this.reverso = false;
	    		this.inicioFaixa = true;
	    		this.fimFaixa = false;
			} else {
				this.estadoAnterior = 'P';
	    		this.tocando = true;
	    		this.reverso = false;
			}
		} else if (this.estadoAnterior == 'R'){
			if (this.inicioFaixa) {
	    		this.faixa = (this.faixa > 1) ? this.faixa - 1 : this.numFaixas;
	    		this.estadoAnterior = 'R';
	    		this.tocando = false;
	    		this.reverso = true;
	    		this.inicioFaixa = false;
	    		this.fimFaixa = true;
			} else {
				this.estadoAnterior = 'R';
	    		this.tocando = false;
	    		this.reverso = true;
			}
		}
	}

	/* (non-Javadoc)
	 * @see lista_interfaces.Player#stop()
	 */
	@Override
	public void stop() {
        this.inicioFaixa = true;
        this.faixa = 1;
        this.fimFaixa = false;
        this.tocando = false;
        this.reverso = false;
        this.estadoAnterior = 'P';
	}

	/* (non-Javadoc)
	 * @see lista_interfaces.Player#pause()
	 */
	@Override
	public void pause() {
		if (this.tocando) {
			this.estadoAnterior = 'P';
		} else if (this.reverso) {
			this.estadoAnterior = 'R';
		}
        this.tocando = false;
        this.reverso = false;
	}

	/* (non-Javadoc)
	 * @see lista_interfaces.Player#reverse()
	 */
	@Override
	public void reverse() {
		if (this.inicioFaixa) {
    		this.faixa = (this.faixa > 1) ? this.faixa - 1 : this.numFaixas;
    		this.estadoAnterior = 'R';
    		this.tocando = false;
    		this.reverso = true;
    		this.inicioFaixa = false;
    		this.fimFaixa = true;
		} else {
			this.estadoAnterior = 'R';
    		this.tocando = false;
    		this.reverso = true;
		}		
	}

}
