import java.util.Scanner;

public class ProcessamentoDeDados {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		String FNome = sc.nextLine();
		String PNome = sc.nextLine();
		String MNome = sc.nextLine();
		
		System.out.println("idade é: " + x);
		System.out.println("meu nome é: " + FNome);
		System.out.println("nome do meu pai é: " + PNome);
		System.out.println("nome da minha mãe é: " + MNome);
		
		sc.close();
	}

}
