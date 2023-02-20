import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class TesteDeExeptions {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<String> nomes = new ArrayList<>();
		
		
		
		try {
			
			nomes.add("Lucas");
			nomes.add("Amanda");
			nomes.add("Cleide");
			nomes.add("Steven");
			System.out.println("Entre a posicao que deseja pesquisar");
			int position = sc.nextInt();
			System.out.println(nomes.get(position));
			
		} catch (IndexOutOfBoundsException e) {
			
			System.out.println("Nao existe esta posicao");
			
		} catch (InputMismatchException e) {
			
			System.out.println("nao e possivel pesquisar este caractere");
			
		}
		
		System.out.println("Programa finalizado");
		
		sc.close();
	}
}
