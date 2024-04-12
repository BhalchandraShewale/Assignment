package assignment3;

class Account {
	protected String accNumber;
	protected double balance;

	public Account(String accNumber, double balance) {
		this.accNumber = accNumber;
		this.balance = balance;
	}

	public void withdraw(double amount) {
		if (amount > balance) {
			System.out.println("Insufficient balance.");
		} else {
			balance -= amount;
			System.out.println("Withdrawn " + amount + " successfully. New balance: " + balance);
		}
	}

	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited " + amount + " successfully. New balance: " + balance);
	}

	public double getBalance() {
		return balance;
	}
}

class SavingsAccount extends Account {
	private static final double INTEREST_RATE = 0.05;

	public SavingsAccount(String accNumber, double balance) {
		super(accNumber, balance);
	}

	public void applyInterest() {
		double interestAmount = balance * INTEREST_RATE;
		deposit(interestAmount);
		System.out.println("Interest applied. New balance: " + balance);
	}
}

class Customer {
	private String name;
	private String address;
	private String mobileNumber;
	private Account account;

	public Customer(String name, String address, String mobileNumber, Account account) {
		this.name = name;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.account = account;
	}

	public void withdraw(double amount) {
		account.withdraw(amount);
	}

	public void deposit(double amount) {
		account.deposit(amount);
	}

	public String getAccountDetails() {
		return "Account Number: " + account.accNumber + ", Balance: " + account.getBalance();
	}

	public void transfer(double amount, Account recipientAccount) {
		if (amount > account.getBalance()) {
			System.out.println("Insufficient balance.");
		} else {
			account.withdraw(amount);
			recipientAccount.deposit(amount);
			System.out.println("Transferred " + amount + " successfully to " + recipientAccount.accNumber);
		}
	}

	public String displayDetails() {
		return "Name: " + name + ", Address: " + address + ", Mobile Number: " + mobileNumber + ", "
				+ getAccountDetails();
	}
}

class Bank {
	private static final int MAX_SIZE = 100;

	protected Account[] accounts;
	protected int size;

	public Bank() {
		accounts = new Account[MAX_SIZE];
		size = 0;
	}

	public void addAccount(Account account) {
		if (size < MAX_SIZE) {
			accounts[size++] = account;
			System.out.println("Account added successfully.");
		} else {
			System.out.println("Cannot add more accounts. Bank capacity reached.");
		}
	}

	public void removeAccount(String accNumber) {
		for (int i = 0; i < size; i++) {
			if (accounts[i].accNumber.equals(accNumber)) {
				accounts[i] = accounts[size - 1];
				size--;
				System.out.println("Account removed successfully.");
				return;
			}
		}
		System.out.println("Account not found.");
	}

	public void displayAccountDetails() {
		for (int i = 0; i < size; i++) {
			System.out.println("Account Number: " + accounts[i].accNumber + ", Balance: " + accounts[i].getBalance());
		}
	}
}

class BankTester {
	public static void main(String[] args) {
		Bank bank = new Bank();

		// Creating accounts and customers
		Account acc1 = new SavingsAccount("125", 1000);
		Account acc2 = new Account("453", 500);
		Customer cust1 = new Customer("Adbede", "Nashik", "54765474", acc1);
		Customer cust2 = new Customer("XYZ", "Pune", "798687576", acc2);

		bank.addAccount(acc1);
		bank.addAccount(acc2);

		System.out.println("Initial Customer Details:");
		System.out.println(cust1.displayDetails());
		System.out.println(cust2.displayDetails());

		cust1.deposit(400);
		cust1.withdraw(200);

		cust1.transfer(300, acc2);

		if (acc1 instanceof SavingsAccount) {
			((SavingsAccount) acc1).applyInterest();
		}

		System.out.println("Updated Customer Details:");
		System.out.println(cust1.displayDetails());
		System.out.println(cust2.displayDetails());

		System.out.println("All Account Details:");
		bank.displayAccountDetails();
	}
}
