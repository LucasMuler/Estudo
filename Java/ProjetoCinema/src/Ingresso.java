
public abstract class Ingresso {

	private double valor;
	private int categoria;
	
	//metodos 
	
	public double valorBase() {
		return 12.00;
	}
	
	
	public double getValor() {
		return valor;
	}
	public double setValor(double valor) {
		return this.valor = valor;
	}
	public int getCategoria() {
		return categoria;
	}
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	
}
