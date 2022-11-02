
public class TesteDeMetodo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.saldo = 2300;
		
		/*conta.deposita(500);
		System.out.println(conta.saldo);
		
		conta.saca(20);
		System.out.println(conta.saldo);
		*/
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(500);
		System.out.println(contaDaMarcela.saldo);
		
		conta.transfere(200, contaDaMarcela);
		
		System.out.println("minha conta tem: " + conta.saldo);
		System.out.println("conta da marcela tem: " + contaDaMarcela.saldo);
		
	}
}
