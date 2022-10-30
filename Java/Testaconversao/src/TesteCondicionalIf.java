
public class TesteCondicionalIf {

	public static void main(String[] args) {

		int idade = 16;
		int numeroAcompanhante = 3;

		System.out.println("por favor me de sua identidade");

		if (idade >= 18) {
			System.out.println("seja bem vindo, pode entrar");
		} else {
			if (numeroAcompanhante >= 1) {
				System.out.println("Apezar de não ter 18, pode entrar");
			} else {
				System.out.println("infelizmente voce não pode entrar");
			}
		}

	}

}
