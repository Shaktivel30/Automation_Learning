package Encapsulation_practise;

class Bank {
	private String accountHolderName;
	private double balance;

	public void setaccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getaccountHolderName() {
		return accountHolderName;
	}

	// Deposit method
	public void Deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
	}

	// withdraw method
	public void withdraw(double amount) {
		if (amount < 0) {
			System.out.println("Invalid amount");
		}

		else if (amount > balance) {
			System.out.println("Insufficient balance");
		}

		else {
			balance -= amount;
		}
	}

	public double getbalance() {
		return balance;
	}

}

public class Prmg2 {

	public static void main(String[] args) {
		Bank b = new Bank();
		b.setaccountHolderName("Shakthi");
		System.out.println(b.getaccountHolderName());

		b.Deposit(500);
		b.withdraw(2000);

		System.out.println("balance amount in account " + b.getbalance());

	}

}
