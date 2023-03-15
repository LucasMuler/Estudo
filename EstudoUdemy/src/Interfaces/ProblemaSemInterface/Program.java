package Interfaces.ProblemaSemInterface;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Program {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy HH:mm");
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDateTime comeco = LocalDateTime.parse(sc.nextLine(), fmt);
		LocalDateTime fim = LocalDateTime.parse(sc.nextLine(), fmt);
		
		System.out.println(comeco.until(fim, ChronoUnit.MINUTES));
		
		sc.close();
	}
}