

public class ContaCorrente extends Conta{
	
	
	public ContaCorrente(int numero, int agencia) {
		super(numero, agencia);
		
	}
	
	
	@Override
	public void saca(double valor) {
		double valorComTaixa = valor + 0.20;
		super.saca(valorComTaixa);
	}
	
	@Override
	public String toString() {
		return super.toString() + "Conta Corrente";
	}
	
}
