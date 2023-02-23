
public class TesteCondicionalIfComE {

	public static void main(String[] args) {
		int idade = 18;
		int acompanhantes = 2;
		boolean acompanhado = acompanhantes >= 1;
		
		if(idade >= 18 && acompanhado) {
			System.out.println("Bem vindo");
		} else {
			System.out.println("infelizmente voce não pode entrar");
		}
	}

}
