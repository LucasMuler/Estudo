
public class Fluxo {

	
	
	public static void main(String[] args) {

		System.out.println("ini da main");
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException ex) {
			System.out.println("Houve um problema: " + ex.getMessage());
			ex.printStackTrace();
		}
		System.out.println("Fim da main");

	}

	public static void metodo1() {
		
		
		System.out.println("ini do metodo 1");
		metodo2();
		System.out.println("dim do metodo 1");
	}

	public static void metodo2(){
		
		
		
		System.out.println("ini do metodo 2");

		double saldo = 50;
		
		if (saldo >= 50) {
			throw new MinhaException("Oh caraio");
		} else {
			
			System.out.println("fim do metodo 2");
			
		}

		

	}

}
