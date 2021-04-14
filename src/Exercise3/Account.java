package Exercise3;

import java.util.Scanner;

public class Account {
	private String number;
	private String ownerName;
	private double saldo;
	
	
	public Account(String number, String ownerName) {
		super();
		this.number = number;
		this.ownerName = ownerName;
	}

	public Account() {
		super();
	}

	public String getNumber() {
		return number;
	}


	public String getOwnerName() {
		return ownerName;
	}


	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}


	public double getSaldo() {
		return saldo;
	}

	
	//Methods
	public void openAccount() {
		Scanner read = Util.read;
		System.out.println("Please, informe you Accout Number: ");
		number = read.nextLine();
		System.out.println("What's your name? ");
		ownerName = read.nextLine();
		System.out.println("Set a initial value: ");
		saldo = read.nextDouble();
		System.out.println("Your account was created! ");
		System.out.println();
		
	}
	
	public double Deposit() {
		Scanner read = Util.read;
		System.out.println("How much do you wanna deposit? ");
		saldo = saldo + read.nextDouble();
		System.out.println("Nice, your new saldo is: " + saldo);

		return saldo;
	}
	
	public void Exchange(double saldo) {
		double exchange;
		Scanner read = Util.read;
		System.out.println("How much money do you wanna exchange? ");
		exchange = read.nextDouble();
		System.out.println("Processing......");
		if (exchange < saldo) {
			saldo = saldo - Util.tax - exchange;
			System.out.println("Done !");
			System.out.println("Your new saldo is: " + saldo);
		}else {
			System.out.println("You dont have enoght money to do that. ");
		}
	}
	
	public void showInfo(String number, String ownerName, double saldo) {
		System.out.println("Your Account Number: " + number);
		System.out.println("Account Name: " + ownerName);
		System.out.println("Saldo: " + saldo);
	}
}
