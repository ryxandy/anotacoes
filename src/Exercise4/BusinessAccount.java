package Exercise4;

public class BusinessAccount extends Account {

	private Double loanLimit;
	
	public BusinessAccount() {
		
	}

	public BusinessAccount(int number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.setLoanLimit(loanLimit);
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	//Meethods
	public void loan(double amount) {
		if (amount <= loanLimit) {
			//deposit(amount);
			balance = balance + amount - 10.0;
		}
	}
	
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance = balance - 2.0;
	}
}
