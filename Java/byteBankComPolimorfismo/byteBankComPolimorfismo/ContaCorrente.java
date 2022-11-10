

public class ContaCorrente extends Conta{
	
	private AcaoBolsa acao;
	private SeguroDeVida seg;
	
	public ContaCorrente(int numero, int agencia) {
		super(numero, agencia);
	}
	
	
	@Override
	public void saca(double valor) {
		double valorComTaixa = valor + 0.20;
		super.saca(valorComTaixa);
		this.acao = new AcaoBolsa();
		this.seg = new SeguroDeVida();
	}
	
}
