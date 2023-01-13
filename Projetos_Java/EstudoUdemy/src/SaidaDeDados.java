import java.util.Locale;

public class SaidaDeDados {

	public static void main(String[] args) {
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products: ");
		System.out.println(product1 + ", which price is $ " + price1);
		System.out.println(product2 + ", whitch price is $ " + price2);
		System.out.println();
		System.out.println("Record: " + age + " years old, code " + code + " ande gender: " + gender);
		System.out.println();
		System.out.println("Measure with eight decimal places: " + measure);
		System.out.print("Rouded (three decimal places): ");
		System.out.printf("%.3f%n", measure);
		
		Locale.setDefault(Locale.US);
		
		System.out.print("US decimal point: ");
		System.out.printf("%.3f%n", measure);
	}
	
}
