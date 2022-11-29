package CriandoArraysPorClasses;

public class Teste {

	public static void main(String[] args) {

		CriaConta c = new CriaConta();
		Conta c1 = new ContaCorrente();
		int c2 = 10;
		Conta c3 = new ContaPoupanca();
		
		c1.setSaldo(500.6546213);
		
		c.adicionaObjeto(c1);
		c.adicionaObjeto(c2);
		c.adicionaObjeto(c3);

		System.out.println(c.totalContas());
		
	}

}
