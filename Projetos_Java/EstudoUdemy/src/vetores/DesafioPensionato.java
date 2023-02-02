package vetores;

import java.util.Scanner;

import vetores.entities.Clientes;

public class DesafioPensionato {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many rooms will be rented? ");
		int n = sc.nextInt();
		sc.nextLine();
		Clientes[] listaDeEnquilinos = new Clientes[10];
		int[] quartosOcupados = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Rent #" + (i+1));
			System.out.println("Name: ");
			String nome = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.nextLine();
			System.out.println("Room: ");
			int quarto = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			listaDeEnquilinos[quarto] = new Clientes(nome, email, quarto);
			quartosOcupados[i] = quarto;
		}
		
		System.out.println("Busy rooms");
		
		for (int i = 0; i < n; i++) {
			System.out.println(quartosOcupados[i]);
		}
		
		sc.close();
		
	}
	
}
