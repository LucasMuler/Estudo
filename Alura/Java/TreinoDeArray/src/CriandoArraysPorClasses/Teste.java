package CriandoArraysPorClasses;

public class Teste {

	public static void main(String[] args) {

		GuardadorDeReferencias c = new GuardadorDeReferencias();
		Conta c1 = new ContaCorrente(22,22);
		int c2 = 10;
		Conta c3 = new ContaPoupanca(30,50);
		
		c1.setSaldo(500.6546213);
		
		c.setAdicionaReferencia(c1);
		c.setAdicionaReferencia(c2);
		c.setAdicionaReferencia(c3);

		Conta ref1 = (Conta) c.getReferencia(c1);
		
		System.out.println(ref1.getSaldo());
		
		System.out.println(c.getQuantidadeDeObjetos());
		
	}

}
