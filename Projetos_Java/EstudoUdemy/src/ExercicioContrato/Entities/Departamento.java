package ExercicioContrato.Entities;

public class Departamento {

	private String nome;

	public Departamento(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Departamento [nome=" + nome + "]";
	}
	
	
	
}
