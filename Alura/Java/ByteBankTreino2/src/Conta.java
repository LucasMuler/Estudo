
public class Conta {
	private int numero;
	private int agencia;
	private double saldo;
	public Cliente titular;
	private static int total;
	
	public Conta(int numero, int agencia, Cliente cliente){
		total++;
		this.agencia = agencia;
		this.numero = numero;
		this.titular = cliente;		
		System.out.println("a conta de " + this.titular + " está sendo definida com o numero: "
			+ this.numero + " e a agencia: " + this.agencia);
	}
	
	// gets do meu programa
	
	public void getnumero(){
		System.out.println(this.numero);
	}
	
	public void getangencia(){
		System.out.println(this.agencia);
	}
	
	public void getsaldo(){
		System.out.println(this.saldo);
	}
	
	public void gettitular(){
		System.out.println(this.titular);
	}
	
	public static void gettotal() {
		System.out.println(Conta.total);
	}
	
	//Métodos do meu banco 
	
	public void deposita(double valor){
		if (valor > 0) {
			this.saldo += valor;
			System.out.println("foi feito um depoisto de: " + valor + ", totalizando: " + this.saldo);
		} else {
			System.out.println("não é possivel depositar valores negativos");
		}
	}
	
	public void saca(double valor){
		if (this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("foi feito um saque de: " + valor + ", totalizando: " + this.saldo);
		} else {
			System.out.println("saldo insuficiente");
		}
	}
	
	public void transfere(double valor, Conta conta){
		if (this.saldo >= valor){
			this.saldo -= valor;
			conta.saldo += valor;
			System.out.println("foi feita uma transferencia de: " + valor + " para a conta: " + conta + " restou na conta: " + this.saldo);
		} else {
			System.out.println("saldo insuficiente");
		}
	}
	
	public static int getContardor() {
		return Conta.total;
	}
	
}

