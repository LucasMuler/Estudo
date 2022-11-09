
public class Teste {
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		Editor e1 = new Editor();
		Administrador a1 = new Administrador();
		
		Sistemainterno si = new Sistemainterno();
		
		si.autentica(g1, 2222);
		si.autentica(a1, 222);
	
	}
}
