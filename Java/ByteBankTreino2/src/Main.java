
public class Main {
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta(2043, 01);
		Conta segundaConta = new Conta(2935, 03);
		
		primeiraConta.deposita(250);
		primeiraConta.transfere(200, segundaConta);
		
		
		
	}
}
