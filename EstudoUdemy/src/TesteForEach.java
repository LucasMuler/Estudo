
public class TesteForEach {

	public static void main(String[] args) {
		
		String[] nomes = new String[] {"Lucas", "Alex", "Anderson"};

		for (int i = 0; i < nomes.length; i++ ) {
			System.out.println(nomes[i]);
		}
		
		System.out.println("---------------------------------------");
		
		for (String cleiton : nomes) {
			System.out.println(cleiton);
		}
		
	}

}
