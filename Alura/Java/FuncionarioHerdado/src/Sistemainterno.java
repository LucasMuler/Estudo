
public class Sistemainterno {

	public void autentica(FuncionarioAutenticavel fa, int senha) {
		if (fa.autentica(senha) == true) {
			System.out.println("Acesso liberado");
		} else {
			System.out.println("Acesso negado");
		}
	}
	
}
