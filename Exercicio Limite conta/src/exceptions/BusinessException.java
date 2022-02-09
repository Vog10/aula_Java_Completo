package exceptions;

public class BusinessException extends RuntimeException{

	// excecao personalizada
	private static final long serialVersionUID = 1L;

	public BusinessException(String msg) {
		
		super(msg);
	}
}
