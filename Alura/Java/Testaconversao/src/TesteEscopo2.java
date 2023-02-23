
public class TesteEscopo2 {
	public static void main(String[] args) {
		int idade = 12;
		
		if (idade >= 7) {
			int valor = 10;
			System.out.println("pode brincar com playdow " + idade);
		}
		
		//System.out.println("o valor não irá aparecer aqui " + valor);
	}
}
