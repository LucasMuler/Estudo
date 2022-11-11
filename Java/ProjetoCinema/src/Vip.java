
public abstract class Vip extends Ingresso{

	public double ValorCamaroteInferior() {
		return super.valorBase() * 2;
	}
	
	public double ValorCamaroteSuperior() {
		return super.valorBase() * 3;
	}
	
}
