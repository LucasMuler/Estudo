import java.util.ArrayList;
import java.util.List;

public class TesteDeListas {

	public static void main(String[] args) {
	
		List<String> minhaLista = new ArrayList<>();
		
		minhaLista.add("Lucas");
		minhaLista.add("Amanda");
		minhaLista.add("Joao");
		minhaLista.add("Sara");
		minhaLista.add("Melo");
		
		minhaLista.add(2, "Cleiton");
		
		for (String x : minhaLista) {
			System.out.println(x);
		}

	}

}
