package CriandoArraysPorClasses;

public abstract class Conta {

	private int numero;
	private int conta;
	
	public Conta(int numero, int conta) {
		this.numero = numero;
		this.conta = conta;
		
	}
	
	@Override
	 public boolean equals(Object o) {
		
		Conta ref = (Conta)o;
		
	        if (this.conta != ref.conta || this.numero != ref.numero) {
	            return false;
	        }
			return true;
	    }
	
	
	
	/**
	 * Getes e Sters
	 * @return
	 */
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	private double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
