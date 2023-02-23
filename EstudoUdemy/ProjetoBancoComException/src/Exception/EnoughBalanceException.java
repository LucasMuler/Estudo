package Exception;

public class EnoughBalanceException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public EnoughBalanceException(String message) {
        super(message);
    }
	
}
