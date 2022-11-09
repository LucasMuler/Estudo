
public abstract class Conta {

	private int numero;
	private int agencia;
	private double saldo;
	private Cliente titular;
	
	//metodos
	
	public Conta(int numero, int agencia) {
		this.numero = numero;
		this.agencia = agencia;
	}
	
	public void deposita(double deposito) {
		if (deposito > 0) {
			this.saldo += deposito;
		} else {
			System.out.println("valor negativo");
		}
	}
	
	public void saca(double valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
		} else {
			System.out.println("saldo insuficiente");
		}
	}
	
	public void transfere(double valor, Conta conta) {
		this.saca(valor);;
		conta.saldo =+ valor;
		System.out.println("foi feita uma transferencia de: " + valor + "para: " + conta);
	}
	
	
	//get e set
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public double getSaldo() {
		return saldo;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	
	
	
}
