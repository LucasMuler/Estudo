
public class Gerente extends Funcionario implements Autentica{

	
	private int senha;
	
	@Override
	public double getbonificacao() {
		double bonificacao = super.getSaldo() + 200;
		return bonificacao;
	}
	
	
	//metodos obrigatorios pelo autentica 
	
	public void setsenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
}
