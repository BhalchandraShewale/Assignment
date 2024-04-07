/*
 * Find the Fibonacci Series up to Nth Term in Java Language
a. Method 1: Using Iteration (Using Three variables)
 */
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10; // Change n to the desired term
		int a = 0, b = 1, c;
		System.out.print("Fibonacci Series up to " + n + " terms:");
		for (int i = 0; i < n; i++) {
			System.out.print(a + " ");
			c = a + b;
			a = b;
			b = c;
		}
	}

}
====================================================================================================================
//b. Method 2: Using Recursion
public class Question1B {
	public static void main(String[] args) {
		int n = 10; // Change n to the desired term
		System.out.print("Fibonacci Series up to " + n + " terms:");
		for (int i = 0; i < n; i++) {
			System.out.print(fibonacci(i) + " ");
		}
	}

	public static int fibonacci(int n) {
		if (n <= 1)
			return n;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
}
====================================================================================================================
//c. Method 3: Using Formula a[i]=a[i-1]+a[i-2] (Using Array)
public class Quetsion1C {
	public static void main(String[] args) {
		int n = 10; // Change n to the desired term
		int[] arr = new int[n];
		arr[0] = 0;
		arr[1] = 1;
		System.out.print("Fibonacci Series up to " + n + " terms:" + arr[0] + " " + arr[1] + " ");
		for (int i = 2; i < n; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
			System.out.print(arr[i] + " ");
		}
	}
}
====================================================================================================================

//Program to check Harshad number or not using Java
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scanner.nextInt();

		if (isHarshad(num)) {
			System.out.println(num + " is a Harshad number.");
		} else {
			System.out.println(num + " is not a Harshad number.");
		}
	}

	public static boolean isHarshad(int num) {
		int sum = 0;
		int temp = num;
		while (temp > 0) {
			sum += temp % 10;
			temp /= 10;
		}
		return num % sum == 0;
	}
}
====================================================================================================================

//Factorial of a Number using Recursion in Java
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scanner.nextInt();

		long factorial = factorial(num);
		System.out.println("Factorial of " + num + " is: " + factorial);
	}

	public static long factorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}
}
====================================================================================================================

//Java Program for Sorting first half in Ascending order and second half in Descending order
import java.util.Arrays;

public class Question4 {

	public static void main(String[] args) {
		int[] arr = { 5, 3, 8, 1, 2, 7, 4, 6 };
		int n = arr.length;

		Arrays.sort(arr, 0, n / 2);

		for (int i = n / 2; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println("Sorted Array:");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
====================================================================================================================
//Java program to count numbers of even and odd elements in an array
public class Question5 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int evenCount = 0;
		int oddCount = 0;

		for (int num : arr) {
			if (num % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}

		System.out.println("Number of even elements: " + evenCount);
		System.out.println("Number of odd elements: " + oddCount);
	}
}
====================================================================================================================
/*Java program for rotation of elements of array- left and right. An array is
said to be right rotated if all the selected elements were moved towards
right by one position.*/
public class Question6 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int n = arr.length;

		int k = 2;

		rightRotate(arr, k);

		System.out.println("Array after right rotation:");
		printArray(arr);

		leftRotate(arr, k);

		System.out.println("Array after left rotation:");
		printArray(arr);
	}

	public static void rightRotate(int[] arr, int k) {
		int n = arr.length;
		reverse(arr, 0, n - 1);
		reverse(arr, 0, k - 1);
		reverse(arr, k, n - 1);
	}

	public static void leftRotate(int[] arr, int k) {
		int n = arr.length;
		reverse(arr, 0, k - 1);
		reverse(arr, k, n - 1);
		reverse(arr, 0, n - 1);
	}

	public static void reverse(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void printArray(int[] arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
====================================================================================================================
//Rotate a matrix by 90 degree in clockwise direction in Java.
public class Question7 {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int[][] rotatedMatrix = rotate(matrix);

		System.out.println("Original Matrix:");
		printMatrix(matrix);

		System.out.println("\nRotated Matrix:");
		printMatrix(rotatedMatrix);
	}

	public static int[][] rotate(int[][] matrix) {
		int n = matrix.length;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}

		for (int i = 0; i < n; i++) {
			int start = 0;
			int end = n - 1;
			while (start < end) {
				int temp = matrix[i][start];
				matrix[i][start] = matrix[i][end];
				matrix[i][end] = temp;
				start++;
				end--;
			}
		}

		return matrix;
	}

	public static void printMatrix(int[][] matrix) {
		for (int[] row : matrix) {
			for (int num : row) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
}
====================================================================================================================
/*
 *Qustion 8 Create a student class with the following data members:- rollNo, Name,
Course, Mark, grade, result. Develop function members to
a. assign values for rollNo, name, course and mark.
b. Find out the grade for the student(if mark &gt;90, then grade is A, if
mark is between 80 and 90, then grade is B, if mark is between 70
and 80, then grade is C, if mark is between 60 and 70, then grade
is D, otherwise, grade is F.
c. Find the result of the student. If mark&gt;60, then the result is Pass,
otherwise Fail
d. Print out the details of the student
 */
import java.util.Scanner;

public class Student {

	private int rollNo;
	private String name;
	private String course;
	private int mark;
	private char grade;
	private String result;

	public Student (int rollNo, String name, String course, int mark) {
		this.rollNo = rollNo;
		this.name = name;
		this.course = course;
		this.mark = mark;
		this.grade = calculateGrade(mark);
		this.result = calculateResult(mark);
	}

	char calculateGrade(int mark) {
		if (mark > 90) {
			return 'A';
		} else if (mark >= 80 && mark <= 90) {
			return 'B';
		} else if (mark >= 70 && mark < 80) {
			return 'C';
		} else if (mark >= 60 && mark < 70) {
			return 'D';
		} else {
			return 'F';
		}
	}

	String calculateResult(int mark) {
		if (mark > 60)
			return "Pass";
		else
			return "Fail";
	}

	void printDetails() {
		System.out.println("Roll No: " + rollNo);
		System.out.println("Name: " + name);
		System.out.println("Course: " + course);
		System.out.println("Mark: " + mark);
		System.out.println("Grade: " + grade);
		System.out.println("Result: " + result);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Roll No: ");
		int rollNo = scanner.nextInt();
		scanner.nextLine(); // Consume newline

		System.out.print("Enter Name: ");
		String name = scanner.nextLine();

		System.out.print("Enter Course: ");
		String course = scanner.nextLine();

		System.out.print("Enter Mark: ");
		int mark = scanner.nextInt();

		Student stu = new Student(rollNo, name, course, mark);
		stu.printDetails();
	}
}
====================================================================================================================
// Question9
import java.util.Scanner;

class Account {
	protected int accountNumber;
	protected double balance;

	public Account(int accountNumber) {
		this.accountNumber = accountNumber;
		this.balance = 0;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited: " + amount);
		} else {
			System.out.println("Invalid amount.");
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && balance >= amount) {
			balance -= amount;
			System.out.println("Withdrawn: " + amount);
		} else {
			System.out.println("Insufficient balance or invalid amount.");
		}
	}

	public void printAccountDetails() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Balance: " + balance);
	}
}

class SavingsAccount extends Account {
	private double interestRate;

	public SavingsAccount(int accountNumber, double interestRate) {
		super(accountNumber);
		this.interestRate = interestRate;
	}

	public void calculateInterest() {
		double interest = balance * (interestRate / 100);
		deposit(interest);
		System.out.println("Interest calculated and added: " + interest);
	}
}

class LoanAccount extends Account {
	private double loanAmount;
	private double interestRate;

	public LoanAccount(int accountNumber, double loanAmount, double interestRate) {
		super(accountNumber);
		this.loanAmount = loanAmount;
		this.interestRate = interestRate;
	}

	public void repayLoan(double amount) {
		if (amount > 0 && amount <= loanAmount) {
			loanAmount -= amount;
			System.out.println("Loan amount repaid: " + amount);
		} else {
			System.out.println("Invalid amount or loan already repaid.");
		}
	}

	public void printLoanDetails() {
		System.out.println("Loan Amount: " + loanAmount);
		System.out.println("Remaining Balance: " + loanAmount);
	}
}

class HousingLoan extends LoanAccount {
	private int tenure;

	public HousingLoan(int accountNumber, double loanAmount, double interestRate, int tenure) {
		super(accountNumber, loanAmount, interestRate);
		this.tenure = tenure;
	}

	public void printHousingLoanDetails() {
		printAccountDetails();
		printLoanDetails();
		System.out.println("Tenure: " + tenure + " years");
	}
}

public class Question10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter account number for savings account:");
		int savingsAccountNumber = scanner.nextInt();
		System.out.println("Enter interest rate for savings account:");
		double savingsInterestRate = scanner.nextDouble();
		SavingsAccount savingsAccount = new SavingsAccount(savingsAccountNumber, savingsInterestRate);

		System.out.println("Enter amount to deposit to savings account:");
		double depositAmount = scanner.nextDouble();
		savingsAccount.deposit(depositAmount);

		savingsAccount.calculateInterest();

		System.out.println("Savings Account Details:");
		savingsAccount.printAccountDetails();

		System.out.println("Enter account number for housing loan:");
		int housingLoanAccountNumber = scanner.nextInt();
		System.out.println("Enter loan amount for housing loan:");
		double housingLoanAmount = scanner.nextDouble();
		System.out.println("Enter interest rate for housing loan:");
		double housingLoanInterestRate = scanner.nextDouble();
		System.out.println("Enter tenure (in years) for housing loan:");
		int housingLoanTenure = scanner.nextInt();
		HousingLoan housingLoan = new HousingLoan(housingLoanAccountNumber, housingLoanAmount, housingLoanInterestRate,
				housingLoanTenure);

		System.out.println("Enter amount to repay for housing loan:");
		double repayAmount = scanner.nextDouble();
		housingLoan.repayLoan(repayAmount);

		System.out.println("Housing Loan Details:");
		housingLoan.printHousingLoanDetails();

	}
}