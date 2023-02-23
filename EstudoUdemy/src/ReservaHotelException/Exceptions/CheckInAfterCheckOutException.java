package ReservaHotelException.Exceptions;

public class CheckInAfterCheckOutException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public CheckInAfterCheckOutException(String message) {
		super(message);
	}

}
