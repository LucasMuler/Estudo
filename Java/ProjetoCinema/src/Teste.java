
public class Teste {

	public static void main(String[] args) {
		
		Ingresso i1 = new CamaroteInferior();
		Cliente c1 = new Cliente(i1, true);
		
		c1.setIngresso(i1);
		
		System.out.println(c1.getValor());
		
	}

}
