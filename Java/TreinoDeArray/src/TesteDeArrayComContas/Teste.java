package TesteDeArrayComContas;

public class Teste {

	public static void main(String[] args) {
		
		Conta[] contas = new Conta[2];
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		
		contas[0] = cc;
		contas[1] = cp;
		
		contas[0].setSaldo(10);
		contas[1].setSaldo(80);
		
		ContaCorrente ref = (ContaCorrente) contas[1];
		
		System.out.println(contas[0].getSaldo());
		System.out.println(contas[1].getSaldo());

	}

}
