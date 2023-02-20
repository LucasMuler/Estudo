package TaixasComPolimorfismo.Entities;

public final class PessoaFisica extends Pessoa {

	private double gastosSaude;

	public PessoaFisica() {
	}

	public PessoaFisica(String nome, double rendaAnual, double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public double Imposto() {

		if (rendaAnual >= 20000.00) {
			double total = (rendaAnual * 0.25) - (gastosSaude * 0.5);
			return total;
		} else if (rendaAnual < 20000.00) {
			double total = (rendaAnual * 0.15) - (gastosSaude * 0.5);
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
