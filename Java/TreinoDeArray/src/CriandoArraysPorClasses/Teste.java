package CriandoArraysPorClasses;

public class Teste {

	public static void main(String[] args) {

		CriaConta c = new CriaConta();
		Conta c1 = new ContaCorrente();
		Conta c2 = new ContaPoupanca();
		Conta c3 = new ContaPoupanca();
		
		c1.setSaldo(500.6546213);
		
		c.adicionaConta(c1);
		c.adicionaConta(c2);
		c.adicionaConta(c3);

		System.out.println(c.totalContas());
		System.out.println(c.getContaPorPosicao(0).getSaldo());
		
	}

}
