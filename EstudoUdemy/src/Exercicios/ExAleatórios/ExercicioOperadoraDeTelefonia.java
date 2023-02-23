package Exercicios.ExAleatórios;
import java.util.Scanner;

public class ExercicioOperadoraDeTelefonia {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double tempoMaximo = 100;
		double tempoDeUso = sc.nextDouble();
		double valorFixo = 50;
		
		double valorTotal = valorFixo + ((tempoDeUso - 100) * 2);
		
		if (tempoDeUso < tempoMaximo) {
			System.out.printf("Valor a pagar: R$%.2f%n", valorFixo);
		} else {
			System.out.printf("Valor a pagar: R$%.2f%n", valorTotal);
		}
		
		sc.close();
	}

}
