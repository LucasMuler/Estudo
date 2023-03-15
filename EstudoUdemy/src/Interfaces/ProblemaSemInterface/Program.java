package Interfaces.ProblemaSemInterface;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) throws ParseException {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		Scanner sc = new Scanner(System.in);

		/**
		 * ---------------------------------------------------------------------
		 * data input
		 */
		System.out.println("Entre com os dados do aluguel");
		System.out.print("Modelo do carro: ");
//		String model = sc.nextLine();
		String model = "Civic";
		System.out.println();
		System.out.print("Retirada (dd/MM/yy HH:mm): ");
//		String retirada = sc.nextLine();
		String retirada = "25/06/2018 10:30";
		System.out.println();
		System.out.print("Entrada (dd/MM/yy HH:mm): ");
//		String entrada = sc.nextLine();
		String entrada = "27/06/2018 11:40";
		System.out.println();
		System.out.print("Entre com o preco da hora: ");
//		double precoHora = sc.nextDouble();
//		sc.nextLine();
		double precoHora = 10.00;
		System.out.println();
		System.out.print("Entre com o preco dia: ");
//		double precoDia = sc.nextDouble();
//		sc.nextLine();
		double precoDia = 130.00;
		System.out.println();
		
		/**
		 * ---------------------------------------------------------------------
		 * Logic of the main code
		 */
		
		LocalDateTime comeco = LocalDateTime.parse(retirada, fmt);
		LocalDateTime fim = LocalDateTime.parse(entrada, fmt);
		double periodoMinutos = comeco.until(fim, ChronoUnit.MINUTES);
		double periodoHoras = comeco.until(fim, ChronoUnit.HOURS);
		double periodoDias = comeco.until(fim, ChronoUnit.DAYS);
		double total = 0;
		int horas = 0;
		int dias = 0;
		
		if (periodoDias >= 1) {
			
			total += precoDia * (int)(periodoDias);
			
			if (periodoMinutos > 0) {
				if (periodoMinutos < 720) {
					total += calculoHora(periodoMinutos, periodoHoras, precoHora);
				} else {
					total += calculoHora(periodoMinutos, periodoHoras, precoHora) + 130;
				}
			} 
			
		} else {
			
			if (periodoMinutos > 0) {
				if (periodoMinutos < 720) {
					total += calculoHora(periodoMinutos, periodoHoras, precoHora);
				} else {
					total += calculoHora(periodoMinutos, periodoHoras, precoHora) + 130;
				}
			} 
			
		} 
		
		
		/**
		 * ---------------------------------------------------------------------
		 * data output
		 */
		System.out.println(periodoMinutos);
		System.out.println(periodoHoras);
		System.out.println(periodoDias);
		System.out.println(total);
		sc.close();
	}
	
	public static double calculoHora(double periodoMinutos, double periodoHoras, double precoHora) {
		if(periodoMinutos % 60 > 0) {
			return (int)((periodoHoras) + 1) * precoHora;
		} else {
			return  (int)(periodoHoras) * precoHora;
		}
	}
	
}