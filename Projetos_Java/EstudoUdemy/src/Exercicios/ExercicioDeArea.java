package Exercicios;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioDeArea {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double valorMetroQuadrato = sc.nextDouble();
		double area = largura * comprimento;
		double valorFinal = valorMetroQuadrato * area;
		
		System.out.printf("AREA = %.2f%n" , area);
		System.out.printf("PRECO = %.2f%n" , valorFinal);
		
		
		sc.close();
		
	}
	
}
