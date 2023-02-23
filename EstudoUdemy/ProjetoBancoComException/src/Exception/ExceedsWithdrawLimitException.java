package Exception;

public class ExceedsWithdrawLimitException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public ExceedsWithdrawLimitException(String message) {
        super(message);
    }
	
	
}
