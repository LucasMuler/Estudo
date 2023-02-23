
public enum Prioridade {

	MIN(0),NORMAL(5),MAX(10);
	
	private int valor;
	
	Prioridade(int valor) {
		this.valor = valor;
	}
	
	public int getValor() {
		return this.valor;
	}
	
	
	
}
