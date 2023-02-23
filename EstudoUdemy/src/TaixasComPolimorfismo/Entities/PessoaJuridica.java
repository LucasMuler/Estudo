package TaixasComPolimorfismo.Entities;

public final class PessoaJuridica extends Pessoa {

	private int numeroFuncionarios;

	public PessoaJuridica() {
	}

	public PessoaJuridica(String nome, double rendaAnual, int numeroFuncionarios) {
		super(nome, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	@Override
	public double Imposto() {
		if (numeroFuncionarios > 10) {
			double total = rendaAnual * 0.14;
			return total;
		} else if (numeroFuncionarios <= 10) {
			double total = rendaAnual * 0.16;
			return total;
		} else {
			return 0;
		}
	}
	
	@Override
	public String toString() {
		return this.nome + ": $ " + Imposto();
	}

}
