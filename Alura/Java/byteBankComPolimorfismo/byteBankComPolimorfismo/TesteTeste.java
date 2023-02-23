
public class TesteTeste {

	public static void main(String[] args) {
		
		
		Conta primeiraConta = new ContaCorrente(1234, 04);
		Conta segundaConta = new ContaCorrente(2222, 07);
		CalcImposto cal = new CalcImposto();
		
		primeiraConta.setMultiplicadorInposto(0.5);
		
		System.out.println(cal.getValorInposto(primeiraConta));
	
		primeiraConta.setMultiplicadorInposto(0.2);
		
		System.out.println(cal.getValorInposto(primeiraConta));
		System.out.println(cal.getValorInposto(segundaConta));
		
	}
}
