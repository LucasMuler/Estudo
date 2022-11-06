
public class Main {
	public static void main(String[] args) {
		
		Cliente primeiroCliente = new Cliente();
		Cliente segundoCliente = new Cliente();
		Conta primeiraConta = new Conta(2043, 01, primeiroCliente);
		Conta segundaConta = new Conta(2935, 03, segundoCliente);
		
		primeiraConta.deposita(250);
		primeiraConta.transfere(200, segundaConta);
		
		primeiraConta.titular.CPF = "222.222.222-22";
		System.out.println(primeiraConta.titular.CPF);
		System.out.println(primeiroCliente.CPF);
		
	}
}
