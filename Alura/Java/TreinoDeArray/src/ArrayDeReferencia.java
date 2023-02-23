
public class ArrayDeReferencia {

	public static void main(String[] args) {

		ClasseTeste[] teste = new ClasseTeste[3]; // Criando um Array com 3 valores nulls, este array suporta 3 referencias 
		ClasseTeste c1 = new ClasseTeste(); // instanciando meus objetos 
		ClasseTeste c2 = new ClasseTeste();
		ClasseTeste c3 = new ClasseTeste();
		
		teste[0] = c1; // direcionando os slots do meu array para determinadas referencias 
		teste[1] = c2;
		teste[2] = c3;
		
		teste[0].setNome("Amanda"); // alterando o valor de um dos objetos por meio do array 
		teste[2].setNome("Steven");
		
		System.out.println(teste[0].getNome());
		System.out.println(teste[1].getNome());
		System.out.println(teste[2].getNome());
		
	}

}
