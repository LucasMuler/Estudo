package CriandoArraysPorClasses;

public class CriaConta {

	Conta[] contas = new Conta[5];

	private int valorlivre = 0;

	public void adicionaConta(Conta conta) {
		this.contas[valorlivre] = conta;
		valorlivre++;
	}

	public int totalContas() {
		return valorlivre;
	}
	
	public Conta getContaPorPosicao(int posicaoDaConta) {
		return contas[posicaoDaConta];
	}

}
