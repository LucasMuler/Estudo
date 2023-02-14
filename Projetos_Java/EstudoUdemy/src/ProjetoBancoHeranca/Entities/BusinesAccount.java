package ProjetoBancoHeranca.Entities;

public class BusinesAccount extends Account{

	private double loanLimit;
	
	public BusinesAccount(int number, String holder, double balance, double loanLimit) {
		super(number,holder,balance);
		this.loanLimit = loanLimit;
	}

	public double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if(this.loanLimit >= amount) {
			System.out.println("Esta sendo feito o emprestimo");
			super.deposit(amount);
		} else {
			System.out.println("seu credito não permite");
		}
		
		balance -= amount - 10;
	}
	
}
