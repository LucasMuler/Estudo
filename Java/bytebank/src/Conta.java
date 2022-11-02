public class Conta{
	
	double saldo;
	int agencia;
	int numero;
	String titular;

	public void deposita (double valor){
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			System.out.print("o valor retirado foi de: " + valor + " e o valor restante e "
					+ "de: ");
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino){
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		
		return false;
	}
	
}

