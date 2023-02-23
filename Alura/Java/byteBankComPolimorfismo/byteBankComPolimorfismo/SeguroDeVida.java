
public class SeguroDeVida implements Tributavel{

	private double valorSeguro = 350;
	
	
	public double getValorSeguro() {
		return valorSeguro;
	}


	public void setValorSeguro(int valorSeguro) {
		this.valorSeguro = valorSeguro;
	}


	@Override
	public double getValorInposto(Conta conta) {
		double valor = valorSeguro * conta.getMultiplicadorInposto();
		return valor;
	}


	

	
	
}
