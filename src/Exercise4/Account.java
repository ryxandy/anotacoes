package Exercise4;

public class Account {

	private int number;
	private String holder;
	protected Double balance;
	
	public Account() {	
	}

	public Account(int number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}
	
	//Methods
	public void withdraw(double amount) {
		amount = amount + 5;
		balance = balance - amount;
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
	}
}
