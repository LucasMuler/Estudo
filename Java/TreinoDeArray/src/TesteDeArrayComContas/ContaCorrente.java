package TesteDeArrayComContas;

public class ContaCorrente extends Conta{

	public ContaCorrente(int numero, int agencia, Cliente cliente) {
		super(numero, agencia, cliente);
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		return "ContaCorrente, Numero: " + this.getNumero() + ", Agencia: " + this.getAgencia();
	}
	
}
