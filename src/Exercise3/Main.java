package Exercise3;

public class Main {

	public static void main(String[] args) {
		Account conta = new Account();
		conta.openAccount();
		conta.Deposit();
		conta.Exchange(conta.getSaldo());
		conta.showInfo(conta.getNumber(), conta.getOwnerName(), conta.getSaldo());	
	}
}
