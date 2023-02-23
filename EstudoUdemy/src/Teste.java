import java.util.Date;
import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("/");
		int mes = sc.nextInt();
		int ano = sc.nextInt();
		
		System.out.println(mes + ano);
		
		sc.close();
		
	}
}
