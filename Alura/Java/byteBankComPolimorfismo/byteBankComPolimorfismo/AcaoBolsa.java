
public class AcaoBolsa implements Tributavel{

private double valorBolsa = 150;
	
	
	public double getValorSeguro() {
		return valorBolsa;
	}


	public void setValorSeguro(int valorSeguro) {
		this.valorBolsa = valorSeguro;
	}


	@Override
	public double getValorInposto(Conta conta) {
		double valor = valorBolsa * conta.getMultiplicadorInposto();
		return valor;
	}

	
	
	
}
