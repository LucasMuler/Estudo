package ReservaHotelException.Entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import ReservaHotelException.Exceptions.CheckInAfterCheckOutException;

public class Reserva {

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private int numeroQuarto;
	private String checkin;
	private String checkout;

	Calendar c1 = Calendar.getInstance();
	Calendar c2 = Calendar.getInstance();

	public Reserva() {
	}

	public Reserva(int numeroQuarto, String checkin, String checkout) {
		this.numeroQuarto = numeroQuarto;
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public int getNumeroQuarto() {
		return numeroQuarto;
	}

	public void setNumeroQuarto(int numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}

	public int duration() throws ParseException {

		c1.setTime(sdf.parse(checkin));
		c2.setTime(sdf.parse(checkout));
		return c2.get(Calendar.DATE) - c1.get(Calendar.DATE);
		
	}

	public void updateDates(String checkin, String checkout) {
		this.checkin = checkin;
		this.checkout = checkout;
	}

	@Override
	public String toString() {

		try {

			if (duration() > 0) {
				return "Reserva numero Quarto = " + numeroQuarto + ", checkin = " + checkin + ", checkout = 80"
						+ checkout + ", " + duration() + " noites";
			} else if(duration() <= 0) {
				throw new CheckInAfterCheckOutException("Check-out date must be after check-in date");
			}

		} catch (ParseException e) {
			return "Parse Exception" + e.getMessage();
		} 

		return "Reserva numeroQuarto=" + numeroQuarto + ", checkin=" + checkin + ", checkout=" + checkout;

	}

}
