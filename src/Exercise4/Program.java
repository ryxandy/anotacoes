package Exercise4;

public class Program {

	public static void main(String[] args) {
		/*
		 * Account acc = new Account(4170, "Alexandre", 0.0); BusinessAccount bacc = new
		 * BusinessAccount(7748, "Maria", 0.0, 1000.0);
		 * 
		 * //UPCASTING = Converter um objeto da subclasse para a SuperClasse Account
		 * acc1 = bacc; Account acc2 = new BusinessAccount(8775, "João", 0.0, 200.0);
		 * Account acc3 = new SavingsAccount(3547, "Ana", 0.0, 8);
		 * 
		 * 
		 * //DOWNCASTING Converter um objeto da SuperClasse para a SubClasse
		 * BusinessAccount c4 = (BusinessAccount)acc2; c4.loan(750);
		 * System.out.println("It worked! ");
		 */
		
		//Testing Ovveriding methods
		
		Account ac = new Account(9841, "ALexandre", 100.0);
		ac.deposit(100);
		ac.withdraw(100);
		System.out.println("Account normal ");
		System.out.println(ac.getBalance());
		
		
		SavingsAccount sa = new SavingsAccount(1, "Alexandre", 100.0, 5);
		sa.deposit(100);
		sa.withdraw(100);
		System.out.println("Savings Account");
		System.out.println(sa.getBalance());
		
		BusinessAccount ba = new BusinessAccount(6471, "Alexandre", 100.0, 2000.0);
		ba.deposit(100);
		ba.withdraw(100);
		System.out.println("Business Account");
		System.out.println(ba.getBalance());
		
		
		
	}
}
