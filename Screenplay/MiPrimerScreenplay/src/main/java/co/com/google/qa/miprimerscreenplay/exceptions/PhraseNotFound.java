package co.com.google.qa.miprimerscreenplay.exceptions;

public class PhraseNotFound extends AssertionError{
	
	public static final String PHARSE_NOT_FOUND="La frase encontrada no corresponde al resultado esperado";
	
	public PhraseNotFound(String message,Throwable cause) {
		super(message,cause);
	}

}
