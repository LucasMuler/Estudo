
public class CalculoImposto {

	private SeguroDeVida seg;
	private AcaoBolsa acao;
	
	public CalculoImposto() {
		this.acao = new AcaoBolsa();
		this.seg = new SeguroDeVida();
	}
	
	public double inpostoTotal() {
		double imposto = this.seg.getValorInposto() + this.acao.getValorInposto();
		return imposto;
	}
	
}
