
public class testeConexao {

	public static void main(String[] args) {
	
		Conexao c1 = new Conexao();
		
		try {
			c1.ProgramaQueAbreConexao();
			c1.ProgramaQueleDados();
		} finally {
			c1.ProgramaQueFechaConexão();
		}
		
	}
}
