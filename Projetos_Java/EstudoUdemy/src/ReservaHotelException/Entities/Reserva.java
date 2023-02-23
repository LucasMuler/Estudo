package ReservaHotelException.Entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import ReservaHotelException.Exceptions.CheckInAfterCheckOutException;
import ReservaHotelException.Exceptions.ReservDateAfterException;

public class Reserva {

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private int numeroQuarto;
	private String checkin;
	private String checkout;

	Calendar c1 = Calendar.getInstance();
	Calendar c2 = Calendar.getInstance();
	Calendar c3 = Calendar.getInstance();

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
		
		c1.setTime(sdf.parse(this.checkin));
		c2.setTime(sdf.parse(this.checkout));
		
		return c2.get(Calendar.DATE) - c1.get(Calendar.DATE);
		
	}

	public void updateDates(String checkin, String checkout) throws ParseException{
		
		c1.setTime(sdf.parse(this.checkin));
		c2.setTime(sdf.parse(checkin));
		c3.setTime(sdf.parse(checkout));
		
		if (c1.get(Calendar.DATE) <= c2.get(Calendar.DATE) && c1.get(Calendar.MONTH) <= c2.get(Calendar.MONTH) && 
				c1.get(Calendar.YEAR) <= c2.get(Calendar.YEAR) && c2.get(Calendar.DATE) < c3.get(Calendar.DATE)) {
			
			this.checkin = checkin;
			this.checkout = checkout;
			
		} else if(c1.get(Calendar.DATE) > c2.get(Calendar.DATE)){
			throw new ReservDateAfterException("Reservation dates for update must be future dates");
			
		} else if (c2.get(Calendar.DATE) > c3.get(Calendar.DATE)) {
			throw new CheckInAfterCheckOutException("Check-out date must be after check-in date");
			
		}
		
	}

	@Override
	public String toString(){

		try {
			
			c1.setTime(sdf.parse(checkin));
			c2.setTime(sdf.parse(checkout));
			
			if (c1.get(Calendar.DATE) <= c2.get(Calendar.DATE)) {
				
				return "Reserva numero Quarto = " + numeroQuarto + ", checkin = "+ checkin + ", checkout = "
						 + checkout + ", " + duration() + " noites";
				
			} else if(c1.get(Calendar.DATE) > c2.get(Calendar.DATE)) {
				
				throw new CheckInAfterCheckOutException("Check-out date must be after check-in date");
				
			}

		} catch (ParseException e) {
			
			return "Parse Exception" + e.getMessage();
			
		} 

		return "Reserva numeroQuarto=" + numeroQuarto + ", checkin=" + checkin + ", checkout=" + checkout;

	}

}
