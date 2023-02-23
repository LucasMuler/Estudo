
public class TesteArrys {

	public static void main(String[] args) {
		
		int [] idades = new int[5]; // Nesta linha eu criei uma array com 5 posições
		
//		idades[0] = 19; // neste item  eu estou atrelando minha primeira posição ao valor 19
//		idades[1] = 29;
//		idades[2] = 39;
//		idades[3] = 49;
//		idades[4] = 59;
//		
//		int idade1 = idades[0]; // neste item eu estou atribuindo a minha primeira posição uma referencia
//		int idade2 = idades[1];
//		int idade3 = idades[2];
//		int idade4 = idades[3];
//		int idade5 = idades[4];
//		
//		
//		System.out.println(idade1); // neste item eu estou chamando a referencia utilziada 
//		System.out.println(idade2);
//		System.out.println(idade3);
//		System.out.println(idade4);
//		System.out.println(idade5);
		
		for (int i = 0; i < idades.length; i++) {
			idades[i] = i;
			System.out.println(idades[i]);
		}
		
		System.out.println("------------------------------------------------");
		
		for (int i = 0; i < idades.length; i++) {
			idades[i] = i*i;
			System.out.println(idades[i]);
		}
		
		
	}

}
