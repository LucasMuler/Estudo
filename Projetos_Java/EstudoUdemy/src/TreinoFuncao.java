import java.util.Scanner;

public class TreinoFuncao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int n1 = NumeroMaior(a, b, c);
		
		Resultado(n1);
		
		sc.close();
	}
	
	public static int NumeroMaior(int a, int b, int c) {
		if ( a > b && a >c ) {
			return a;
		}else if (b > a && b >c ) {
			return b;
		} else {
			return c;
		}
	}
	
	public static void Resultado(int valor) {
		System.out.println("Maior: " + valor);
	}
	
}
