package vetores;
import java.util.Scanner;

public class AplicacaoVetores1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vect = new double[n];
		double media = 0;
		
		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
			media += vect[i];
		}
		
		System.out.printf("Avarege Height = %.2f%n", media / 3);
		
		sc.close();
	}

}
