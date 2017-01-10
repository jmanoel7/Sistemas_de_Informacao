package lista_agregacao;

public class DVD {
	private String marca;
	private String modelo;

	public DVD(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	/**
	 * get the value of marca
	 * @return the value of marca
	 */
	public String getMarca(){
		return this.marca;
	}

	/**
	 * set a new value to marca
	 * @param marca the new value to be used
	 */
	public void setMarca(String marca) {
		this.marca=marca;
	}

	/**
	 * get the value of modelo
	 * @return the value of modelo
	 */
	public String getModelo(){
		return this.modelo;
	}

	/**
	 * set a new value to modelo
	 * @param modelo the new value to be used
	 */
	public void setModelo(String modelo) {
		this.modelo=modelo;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DVD other = (DVD) obj;
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
		return true;
	}

	@Override
	public String toString() {
		return "DVD [marca=" + marca + ", modelo=" + modelo + "]";
	}
}
