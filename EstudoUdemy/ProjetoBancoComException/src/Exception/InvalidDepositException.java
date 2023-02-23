package Exception;

public class InvalidDepositException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public InvalidDepositException(String message) {
        super(message);
    }
	
}
