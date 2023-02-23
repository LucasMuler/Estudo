
/*public class DesafioFatorial {
	public static void main(String[] args) {
		for (int numero = 1; numero <= 6; numero++) {
			for (int contador = 1; contador <= numero; contador++) {
				System.out.println(numero + "fotorial e " + numero * contador);	
			}
		}
	}
}
*/

class DesafioFatorial {
    public static void main(String[] args) {
        int fatorial = 1;
        for (int i = 1; i < 11; i++) {
            fatorial *= i;
            System.out.println("Fatorial de " + i + " = " + fatorial);
        }
    }
}

