package co.com.google.qa.miprimerscreenplay.models;

public class Phrase {
	private String palabra;
	private String palabraDos;

	public Phrase(String palabra, String palabraDos) {
		super();
		this.palabra = palabra;
		this.palabraDos = palabraDos;
	}

	public String getpalabra() {
		return palabra;
	}

	public void setpalabra(String palabra) {
		this.palabra = palabra;
	}

	public String getpalabraDos() {
		return palabraDos;
	}

	public void setpalabraDos(String palabraDos) {
		this.palabraDos = palabraDos;
	}

}