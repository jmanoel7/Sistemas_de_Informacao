package lista_composicao;

public class Site {

	private String URL;
	private boolean ssl;
	
	public Site(String URL, boolean ssl) {
		this.URL = URL;
		this.ssl = ssl;
	}

	public String getURL() {
		return URL;
	}

	public boolean isSsl() {
		return ssl;
	}

	@Override
	public String toString() {
		return "site [URL=" + URL + ", ssl=" + ssl + "]";
	}
	
}
