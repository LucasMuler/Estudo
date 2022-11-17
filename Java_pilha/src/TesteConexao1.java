
public class TesteConexao1 {

	public static void main(String[] args) {

		try(Conexao1 cn = new Conexao1()){
			cn.LendoDados();
		} catch(IllegalStateException cn){
			System.out.println("deu merda");
		}
	}

}
