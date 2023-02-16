package ProjetoBancoHeranca.Entities;

public final class SavingAccount extends Account {
	
	private double interestRate;

	public SavingAccount(int number, String holder, double balance, double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	@Override
	public final void witdraw(double amount) {
		balance -= amount;
	}

}
