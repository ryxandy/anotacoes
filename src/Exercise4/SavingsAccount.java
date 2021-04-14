package Exercise4;

public class SavingsAccount extends Account {

	private double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(int number, String holder, Double balance, double interestRate) {
		super(number, holder, balance);
		this.setInterestRate(interestRate);
	}

	
	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	//Nethods
	public void updateBalance() {
		balance = balance + balance * interestRate;
	}
	
	@Override
	public void withdraw(double amount) {
		balance = balance - amount;
	}
}
