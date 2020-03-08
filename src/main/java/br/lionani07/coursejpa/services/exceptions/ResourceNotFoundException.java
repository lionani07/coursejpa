package br.lionani07.coursejpa.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Long id) {
		super("Resourse not found: " + id);
	}

}
