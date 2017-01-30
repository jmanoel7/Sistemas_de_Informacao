package agregacao;

public class Computador {
	private String dono;
	private Monitor monitor;

	public Computador(String dono) {
		this.dono = dono;
	}

	public boolean addMonitor(Monitor monitor) {

		boolean sucesso = false;

		if (this.monitor == null) {
			this.monitor = monitor;
			sucesso = true;
		}

		return sucesso;
	}

	public boolean removeMonitor() {

		boolean sucesso = false;

		if (this.monitor != null) { 	
			this.monitor = null;
			sucesso = true;
		} 

		return sucesso;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public String getDono() {
		return dono;
	}
	
	public void setDono(String dono) {
		this.dono = dono;
	}	

	@Override
	public String toString() {
		return "Computador [dono=" + dono + ", monitor=" + monitor + "]";
	}		
}






