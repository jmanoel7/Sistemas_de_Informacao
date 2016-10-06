package composicao;

public class Dedo {

	private int ordem;
	
	public Dedo(int ordem) {
		this.ordem = ordem;		
	}
	
	public int getOrdem() {
		return ordem;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dedo other = (Dedo) obj;
		if (ordem != other.ordem)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Dedo [ordem=" + ordem + "]";
	}				
}

