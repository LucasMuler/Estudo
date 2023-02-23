package CriandoArraysPorClasses;

public class CriaConta {

	Object[] objeto = new Conta[5];

	private int valorlivre = 0;

	public void adicionaObjeto(Object conta) {
		this.objeto[valorlivre] = conta;
		valorlivre++;
	}

	public int totalContas() {
		return valorlivre;
	}


}
