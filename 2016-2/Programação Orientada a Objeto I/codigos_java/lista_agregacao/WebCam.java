package lista_agregacao;

public class WebCam {
	
	private String marca;
	private String modelo;
	private int resolucaoX;
	private int resolucaoY;
	private boolean filmaHD;
	
	public WebCam(String marca, String modelo, int resolucaoX, int resolucaoY, boolean filmaHD) {
		this.marca = marca;
		this.modelo = modelo;
		this.resolucaoX = resolucaoX;
		this.resolucaoY = resolucaoY;
		this.filmaHD = filmaHD;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getResolucaoX() {
		return resolucaoX;
	}

	public int getResolucaoY() {
		return resolucaoY;
	}

	public boolean isFilmaHD() {
		return filmaHD;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WebCam other = (WebCam) obj;
		if (filmaHD != other.filmaHD)
			return false;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		if (resolucaoX != other.resolucaoX)
			return false;
		if (resolucaoY != other.resolucaoY)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "WebCam [marca=" + marca + ", modelo=" + modelo + ", resolucaoX=" + resolucaoX + ", resolucaoY="
				+ resolucaoY + ", filmaHD=" + filmaHD + "]";
	}

}
