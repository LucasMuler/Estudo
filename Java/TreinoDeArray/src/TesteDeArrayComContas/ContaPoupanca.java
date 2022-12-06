package TesteDeArrayComContas;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(int numero, int agencia, Cliente cliente) {
		super(numero, agencia, cliente);
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		return "ContaPoupanca, Numero: " + this.getNumero() + ", Agencia: " + this.getAgencia();
	}
	

}
