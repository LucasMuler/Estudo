import java.util.Scanner;

public class TesteMatriz {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		for (int i = 0; i<n; i++) {
			for (int j = 0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Diagonal principal");
		
		for (int i = 0; i<n; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		System.out.println();
		int contador = 0;
		
		for (int i = 0; i<n; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] < 0) {
					contador++;
				}
			}
		}
		
		System.out.println("quantidade de numeros negativos: " + contador);
		
		sc.close();
		
	}
}
