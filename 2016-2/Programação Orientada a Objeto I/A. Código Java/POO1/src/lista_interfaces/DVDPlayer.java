package lista_interfaces;

/**
 * Describe class DVDPlayer here.
 *
 *
 * Created: Tue Feb  7 02:10:30 2017
 *
 * @author <a href="mailto:joao.manoel@academico.ifg.edu.br"></a>
 * @version 1.0
 */
public class DVDPlayer implements Player {

    private String marca;
    private String modelo;
    private boolean tocando;
    private boolean fim;
    private boolean inicio;
    private boolean reverso;
    
    /**
     * Creates a new <code>DVDPlayer</code> instance.
     *
     */
    public DVDPlayer(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.inicio = true;
        this.fim = false;
        this.tocando = false;
        this.reverso = false;
    }
    
    public String getModelo() {
		return modelo;
	}

	public String getMarca() {
		return marca;
	}

	public boolean isTocando() {
		return tocando;
	}

	public boolean isFim() {
		return fim;
	}

	public boolean isInicio() {
		return inicio;
	}

	public boolean isReverso() {
		return reverso;
	}

	@Override
	public String toString() {
		return "DVDPlayer [marca=" + marca + ", tocando=" + tocando + ", fim=" + fim + ", inicio=" + inicio
				+ ", reverso=" + reverso + "]";
	}

    // Implementation of lista_interfaces.Player

	/**
     * Describe <code>play</code> method here.
     *
     */
    public final void play() {
    	if (this.fim)
    		this.reverse();
    	else {
    		this.tocando = true;
    		this.reverso = false;
    	}
    }

    /**
     * Describe <code>pause</code> method here.
     *
     */
    public final void pause() {
    	this.tocando = false;
    }

    /**
     * Describe <code>stop</code> method here.
     *
     */
    public final void stop() {
    	this.inicio = true;
    	this.fim = false;
    	this.tocando = false;
    	this.reverso = false;
    }

    /**
     * Describe <code>reverse</code> method here.
     *
     */
    public final void reverse() {
    	if (this.fim) {
    		this.inicio = false;
    		this.fim = true;
    		this.tocando = false;
    		this.reverso = true;
    	}
    }

}
