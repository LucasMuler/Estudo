package CriandoArraysPorClasses;

public class GuardadorDeReferencias {

	private int espacoLivre = 0;
	
	Object[] ref = new Object[5];
	
	public void setAdicionaReferencia(Object obj) {
		ref[espacoLivre] = obj;
		espacoLivre++;
	}
	
	public Object getReferencia(Object obj) {
		return obj;
	}
	
	public int getQuantidadeDeObjetos() {
		return espacoLivre;
	}
	
}
