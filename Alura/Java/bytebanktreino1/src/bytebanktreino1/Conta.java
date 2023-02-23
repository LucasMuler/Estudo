package bytebanktreino1;

public class Conta {
	int numero;
	int agencia;
	 int saldo;
	String titular;
	
	private static int total;
	
	public Conta(int numero, int agencia) {
		Conta.total++;
		System.out.println("eu tenho no total "+Conta.total+" contas");
		this.numero = numero;
		this.agencia = agencia;
		System.out.println("estou criando uma conta co o numero: " + this.numero + " e com a agencia: " + this.agencia);
	}
	
	public void deposita(double valor){
		this.saldo += valor;
	}
	
	public boolean saca(double valor){
		if (valor <= this.saldo) {
			this.saldo -= valor;
			return true;
		} else {
			System.out.println("não foi possivel concluir a transferencia, saldo insuficiente");
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(valor <= this.saldo) {
			this.saldo -= valor;
			destino.saldo += valor;
			return true;
		} else {
			System.out.println("não foi possivel concluir a transferencia, saldo insuficiente");
			return false;
		}
	}
	
}
