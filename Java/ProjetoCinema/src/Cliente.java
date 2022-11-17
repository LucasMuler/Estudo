
public class Cliente {

	private int idade;
	private boolean estudante = true;
	private String nome;
	private Ingresso ingresso;
	
	
	//---------------------------------------------
	
	public Cliente(Ingresso ingresso, boolean estudante) {
		this.estudante = estudante;
		this.ingresso = ingresso;
	}
	
	public double getValor() {
		if (estudante == true) {
			return ingresso.getValor() / 2;
		} else {
			return ingresso.getValor();
		}
	}

	//---------------------------------------------
	
	public int getIdade() {
		return idade;
	}
	public Ingresso getIngresso() {
		return ingresso;
	}
	public void setIngresso(Ingresso ingresso) {
		this.ingresso = ingresso;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public boolean isEstudante() {
		return estudante;
	}
	public void setEstudante(boolean estudante) {
		this.estudante = estudante;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
