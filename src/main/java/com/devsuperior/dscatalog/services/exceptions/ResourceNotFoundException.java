package com.devsuperior.dscatalog.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(String msg) {
		super(msg);
	}
	
	// a partir deste ponto foi criado a exceção personalizada;

}
