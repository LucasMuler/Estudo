
public abstract class FuncionarioAutenticavel extends Funcionario {

	int senha = 2222;
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
		
			return false;
		}
	}
	
	// get e set
	public int getSenha() {
		return senha;
	}


	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	

}
