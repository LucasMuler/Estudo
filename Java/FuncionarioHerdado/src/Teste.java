
public class Teste {
	public static void main(String[] args) {
		Funcionario primeiroFuncionario = new Gerente();
		Gerente segundoFuncionario = new Gerente();
		Funcionario terceiroFuncionario = new Gerente();
		
		primeiroFuncionario.setSalario(100);
		segundoFuncionario.setSalario(1000);
		terceiroFuncionario.setSalario(100);
		
		System.out.println(primeiroFuncionario.getbonificacao());
		System.out.println(segundoFuncionario.getbonificacao());
		
		System.out.println("o salario final e: " + primeiroFuncionario.getSalario());
		System.out.println("o salario final e: " + segundoFuncionario.getSalario());
	
	}
}
