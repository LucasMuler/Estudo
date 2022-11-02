package bytebanktreino1;

public class Conta {
	int numero;
	int agencia;
	int saldo;
	String titular;
	
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
