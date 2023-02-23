package ReservaHotelException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import ReservaHotelException.Entities.Reserva;
import ReservaHotelException.Exceptions.CheckInAfterCheckOutException;
import ReservaHotelException.Exceptions.ReservDateAfterException;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Numero do quarto: ");
		int numero = sc.nextInt();
		sc.nextLine();

		System.out.print("Data de Checkin (dd/MM/yyyy): ");
		String checkin = sc.nextLine();
		System.out.print("Date de Checkout (dd/MM/yyyy): ");
		String checkout = sc.nextLine();

		try {

			Reserva r = new Reserva(numero, sdf.parse(checkin), sdf.parse(checkout));

			System.out.println(r);

			System.out.println();
			System.out.println("Entre a data para atualizar a reserva");
			System.out.println();
			System.out.print("Data de Checkin (dd/MM/yyyy): ");
			String checkinNovo = sc.nextLine();
			System.out.print("Date de Checkout (dd/MM/yyyy): ");
			String checkoutNovo = sc.nextLine();

			r.updateDates(sdf.parse(checkinNovo), sdf.parse(checkoutNovo));

			System.out.println(r);

		} catch (CheckInAfterCheckOutException e) {
			System.out.println("Error in reservation: " + e.getMessage());
		} catch (ReservDateAfterException e) {
			System.out.println("Error in reservation: " + e.getMessage());
		} finally {
			sc.close();	
		}
	}

}
