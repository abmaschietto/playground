package br.com.tdv.playground.exceptions;

public class DataSourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DataSourceNotFoundException(String message) {
	    super(message);
	}

}
