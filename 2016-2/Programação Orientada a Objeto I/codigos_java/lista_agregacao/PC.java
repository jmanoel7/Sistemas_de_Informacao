package lista_agregacao;

public class PC {

	private String dono;
	private String marca;
	private Teclado teclado;
	private WebCam webcam;
	

	public PC(String dono, String marca, Teclado teclado) {
		
		if (dono == null) {
			throw new NullPointerException("A referência do dono não pode ser nula!");
		}
		this.dono = dono;
		
		if (marca == null) {
			throw new NullPointerException("A referência da marca não pode ser nula!");
		}
		this.marca = marca;

		if (teclado == null) {
			throw new NullPointerException("A referência do teclado não pode ser nula!");
		}
		this.teclado = teclado;

	}


	public PC(String dono, String marca, Teclado teclado, WebCam webcam) {

		if (dono == null) {
			throw new NullPointerException("A referência do dono não pode ser nula!");
		}
		this.dono = dono;
		
		if (marca == null) {
			throw new NullPointerException("A referência da marca não pode ser nula!");
		}
		this.marca = marca;

		if (teclado == null) {
			throw new NullPointerException("A referência do teclado não pode ser nula!");
		}
		this.teclado = teclado;

		if (webcam == null) {
			throw new NullPointerException("A referência da webcam não pode ser nula!");
		}
		this.webcam = webcam;
	}
	
	public boolean trocaTeclado(Teclado teclado) {
		boolean sucesso = false;
		
		if (teclado != null) {
			this.teclado = teclado;
			sucesso = true;
		}
		
		return sucesso;
	}
	
	public boolean removeWebCam(WebCam webcam) {
		boolean sucesso = false;
		
		if (this.webcam != null) {
			if (this.webcam == webcam || this.webcam.equals(webcam)) {
				this.webcam = null;
				sucesso = true;
			}
		}
		
		return sucesso;
	}

	public boolean removeWebCam() {
		boolean sucesso = false;
		
		if (this.webcam != null) {
			this.webcam = null;
			sucesso = true;
		}
		
		return sucesso;
	}

	public boolean addWebCam(WebCam webcam) {
		boolean sucesso = false;
		
		if (this.webcam == null) {
			this.webcam = webcam;
			sucesso = true;
		}
		
		return sucesso;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}


	public String getMarca() {
		return marca;
	}


	public Teclado getTeclado() {
		return teclado;
	}

	public WebCam getWebcam() {
		return webcam;
	}

	@Override
	public String toString() {
		return "PC [dono=" + dono + ", marca=" + marca + ", teclado=" + teclado + ", webcam=" + webcam + "]";
	}

}
