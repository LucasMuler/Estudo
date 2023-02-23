package ReservaHotelException.Exceptions;

public class ReservDateAfterException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ReservDateAfterException(String message) {
		super(message);
	}

}
