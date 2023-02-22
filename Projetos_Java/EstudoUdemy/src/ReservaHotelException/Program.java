package ReservaHotelException;

import java.text.ParseException;
import java.util.Scanner;

import ReservaHotelException.Entities.Reserva;
import ReservaHotelException.Exceptions.CheckInAfterCheckOutException;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);

		System.out.println("Numero do quarto:");
		int numero = sc.nextInt();
		sc.nextLine();

		System.out.println("Data de Checkin (dd/MM/yyyy):");
		String checkin = sc.nextLine();
		System.out.println("Date de Checkout (dd/MM/yyyy)");
		String checkout = sc.nextLine();

		try {
			Reserva r = new Reserva(numero, checkin, checkout);

			System.out.println(r);

			System.out.println("Entre a data para atualizar a reserva");
			System.out.println("Data de Checkin (dd/MM/yyyy):");
			String checkinNovo = sc.nextLine();
			System.out.println("Date de Checkout (dd/MM/yyyy)");
			String checkoutNovo = sc.nextLine();

		} catch (CheckInAfterCheckOutException e) {
			System.out.println("Error in reservation: " + e.getMessage());
		}

	}

}
