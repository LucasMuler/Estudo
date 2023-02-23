import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TesteDeListas {

	public static void main(String[] args) {
	
		List<String> minhaLista = new ArrayList<>();
		
		minhaLista.add("Lucas");
		minhaLista.add("Amanda");
		minhaLista.add("Joao");
		minhaLista.add("Sara");
		minhaLista.add("Melo");
		minhaLista.add("Cajamar");
		
		minhaLista.add(2, "Cleiton");
		
		for (String x : minhaLista) {
			System.out.println(x);
		}
		
		System.out.println("---------------------------------------");
		
		minhaLista.removeIf(x -> x.charAt(0) == 'M');

		for (String x : minhaLista) {
			System.out.println(x);
		}
		
		System.out.println("-------------------------------------");
		
		System.out.println("index of Cleiton = " + minhaLista.indexOf("Cleiton"));
		System.out.println("Index de um item que não existe = " + minhaLista.indexOf("Jose"));
		
		System.out.println("-------------------------------------");
		
		
		List<String> result = minhaLista.stream().filter(x -> x.charAt(0) == 'C').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
	
		System.out.println("-------------------------------------");
		
		
		String y = minhaLista.stream().filter(x -> x.charAt(0) == 'S').findFirst().orElse(null);
		System.out.println(y);
		
	}

}
