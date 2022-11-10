
public class AcaoBolsa implements Tributavel{

private double valorBolsa = 150;
	
	
	public double getValorSeguro() {
		return valorBolsa;
	}


	public void setValorSeguro(int valorSeguro) {
		this.valorBolsa = valorSeguro;
	}


	@Override
	public double getValorInposto() {
		double valor = valorBolsa * 0.2;
		return valor;
	}

	
	
	
}
