package ReservaHotelException.Entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import ReservaHotelException.Exceptions.CheckInAfterCheckOutException;
import ReservaHotelException.Exceptions.ReservDateAfterException;

public class Reserva {

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private int numeroQuarto;
	private Date checkin;
	private Date checkout;

	public Reserva() {
	}

	public Reserva(int numeroQuarto, Date checkin, Date checkout) {
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

	@SuppressWarnings("deprecation")
	public int duration() throws ParseException {

		return checkout.getDay() - checkin.getDay();

	}

	public void updateDates(Date checkin, Date checkout) throws ParseException {

		if (this.checkin.before(this.checkout) && this.checkin.before(checkin)) {

			this.checkin = checkin;
			this.checkout = checkout;

		} else if (!this.checkin.before(checkin)) {
			throw new ReservDateAfterException("Reservation dates for update must be future dates");

		} else if (!this.checkin.before(checkout)) {
			throw new CheckInAfterCheckOutException("Check-out date must be after check-in date");

		}

	}

	@Override
	public String toString() {

		try {

			if (checkin.before(checkout)) {

				return "Reserva numero Quarto = " + numeroQuarto + ", checkin = " + sdf.format(checkin)
						+ ", checkout = " + sdf.format(checkout) + ", " + duration() + " noites";

			} else {

				throw new CheckInAfterCheckOutException("Check-out date must be after check-in date");

			}

		} catch (ParseException e) {

			return "Parse Exception" + e.getMessage();

		}

	}
}
