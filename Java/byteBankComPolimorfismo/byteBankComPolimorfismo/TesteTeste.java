
public class TesteTeste {

	public static void main(String[] args) {
		
		Conta primeiraConta = new ContaCorrente(1324, 01);
		Cliente Lucas = new Cliente();
		primeiraConta.setTitular(Lucas);
		
		Conta segundaConta = new ContaPoupanca(1245, 02);
		Cliente Amanda = new Cliente();
		segundaConta.setTitular(Amanda);
		
		primeiraConta.deposita(500.00);
		primeiraConta.transfere(200, segundaConta);
		
		System.out.println(segundaConta.getSaldo());
		System.out.println(primeiraConta.getSaldo());
		
		

	}
}
