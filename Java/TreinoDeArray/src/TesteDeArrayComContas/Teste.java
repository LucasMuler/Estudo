package TesteDeArrayComContas;

public class Teste {

	public static void main(String[] args) {
		
		Conta[] contas = new Conta[2];
		ContaCorrente cc = new ContaCorrente(01,02);
		ContaPoupanca cp = new ContaPoupanca(01,02);
		
		contas[0] = cc;
		contas[1] = cp;
		
		contas[0].deposita(10);
		contas[1].deposita(80);
		
		ContaCorrente ref = (ContaCorrente) contas[1];
		
		System.out.println(contas[0].getSaldo());
		System.out.println(contas[1].getSaldo());

	}

}
