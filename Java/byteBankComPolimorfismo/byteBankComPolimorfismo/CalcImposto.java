
public class CalcImposto implements Tributavel{

	private SeguroDeVida seg;
	private AcaoBolsa acao;
	
	public CalcImposto() {
		this.acao = new AcaoBolsa();
		this.seg = new SeguroDeVida();
	}
	

	public double getValorInposto(Conta conta) {
		double imposto1 = this.seg.getValorInposto(conta);
		double imposto2 = this.acao.getValorInposto(conta);
		return imposto1 + imposto2;
	}
	
}
