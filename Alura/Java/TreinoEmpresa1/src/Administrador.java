
public class Administrador extends Funcionario implements Autentica{

	private AutenticaUnitario autenticador;
	
	@Override
	public double getbonificacao() {
		double bonificacao = super.getSaldo() + 100;
		return bonificacao;
	}

	
	public Administrador() {
		this.autenticador = new AutenticaUnitario();
	}
	
	
	public void setsenha(int senha) {
		this.autenticador.setsenha(senha);
	}
	
	public boolean autentica(int senha) {
		boolean autentica = this.autenticador.autentica(senha);
		return autentica;
	}
	
}
