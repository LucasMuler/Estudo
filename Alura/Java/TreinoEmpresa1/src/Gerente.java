
public class Gerente extends Funcionario implements Autentica{

	private AutenticaUnitario autenticador;
	
	@Override
	public double getbonificacao() {
		double bonificacao = super.getSaldo() + 200;
		return bonificacao;
	}
	
	public Gerente() {
		this.autenticador = new AutenticaUnitario();
	}
	
	//metodos obrigatorios pelo autentica 
	
	public void setsenha(int senha) {
		this.autenticador.setsenha(senha);
	}
	
	public boolean autentica(int senha) {
		boolean autentica = this.autenticador.autentica(senha);
		return autentica;
	}
	
}
