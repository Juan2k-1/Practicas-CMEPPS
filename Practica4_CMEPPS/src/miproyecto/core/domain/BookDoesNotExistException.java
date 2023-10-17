package miproyecto.core.domain;

public class BookDoesNotExistException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BookDoesNotExistException() {
		super("El libro no existe.");
	}
}
