package assignment3;

class SavingAccount {
	private static double annualInterestRate;
	private double savingsBalance;

	public SavingAccount(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	public void calculateMonthlyInterest() {
		double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
		savingsBalance += monthlyInterest;
	}

	public static void modifyInterestRate(double newRate) {
		annualInterestRate = newRate;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}
}

class SavingsAccountTest {
	public static void main(String[] args) {
		SavingAccount saver1 = new SavingAccount(2000.00);
		SavingAccount saver2 = new SavingAccount(3000.00);

		SavingAccount.modifyInterestRate(0.03);

		System.out.println("Initial Balances with 3% Annual Interest Rate:");
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.println("Saver1 balance: $" + saver1.getSavingsBalance());
		System.out.println("Saver2 balance: $" + saver2.getSavingsBalance());

		SavingAccount.modifyInterestRate(0.04); 

		System.out.println("\nBalances after setting Annual Interest Rate to 4%:");
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.println("Saver1 balance: $" + saver1.getSavingsBalance());
		System.out.println("Saver2 balance: $" + saver2.getSavingsBalance());
	}
}
