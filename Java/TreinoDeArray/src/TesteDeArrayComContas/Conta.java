package TesteDeArrayComContas;

public abstract class Conta {

	private int saldo;

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public boolean equals(Object obj) {
		
		Conta cr = (Conta)obj;
		if (this.saldo == cr.saldo) {
			return true;
		}
		return false;
	}

}
