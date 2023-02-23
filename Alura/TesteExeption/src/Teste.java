
public class Teste {

	public static void main(String[] args) {

		System.out.println("Inicio da Main");
		
		try { 
			metodo1();
		} catch (ArithmeticException ex){
			System.out.println("Ouve uma situação anormal: ");
			ex.getMessage();
			ex.printStackTrace();
		}
		System.out.println("fim da main");

	}

	public static void metodo1() {

		System.out.println("inicio do primeiro metodo");
		metodo2();
		System.out.println("Fim do primeiro metodo");
		
	}
	
	public static void metodo2(){
		int saldo = 50;
		
		System.out.println("Inicio do segundo metodo");
		
		if (saldo == 51) {
			throw new MinhaExeption("deu merda");
		} else {
		
			System.out.println("Fim do segundo metodo");
		}
	}

}