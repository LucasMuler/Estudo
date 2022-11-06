
public class Gerente extends Funcionario{

	private int senha;
	
	
	//metodos
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	public double getbonificacao() {
		return super.getSalario() + super.getbonificacao();
	}

	//Get e Set
	
	public int getSenha() {
		return senha;
	}


	public void setSenha(int senha) {
		this.senha = senha;
	}
	
}
