package Exercicios.ExAleatórios;
import java.util.Scanner;


public class ProgramaDiasSemana {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int dias = sc.nextInt();

		switch (dias) {

		case (1):
			System.out.println("Dia da semana: segunda");
			break;
		case (2):
			System.out.println("Dia da semana: terça");
			break;
		case (3):
			System.out.println("Dia da semana: quarta");
			break;
		case (4):
			System.out.println("Dia da semana: quinta");
			break;
		case (5):
			System.out.println("Dia da semana: sexta");
			break;
		case (6):
			System.out.println("Dia da semana: sabado");
			break;
		case (7):
			System.out.println("Dia da semana: domingo");
			break;

		default:

			System.out.println("Dia da semana: valor invalido");
			break;

		}

		sc.close();

	}

}
