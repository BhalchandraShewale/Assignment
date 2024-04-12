package assignment3;

import java.util.Scanner;

public class Complex {
	private double real;
	private double imaginary;

	public Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	public Complex add(Complex other) {
		return new Complex(this.real + other.real, this.imaginary + other.imaginary);
	}

	public Complex subtract(Complex other) {
		return new Complex(this.real - other.real, this.imaginary - other.imaginary);
	}

	public Complex multiply(Complex other) {
		double newReal = this.real * other.real - this.imaginary * other.imaginary;
		double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
		return new Complex(newReal, newImaginary);
	}

	public void display() {
		System.out.println("Result: " + real + " + " + imaginary + "i");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter real and imaginary parts of first complex number:");
		double real1 = scanner.nextDouble();
		double imaginary1 = scanner.nextDouble();
		Complex complex1 = new Complex(real1, imaginary1);

		System.out.println("Enter real and imaginary parts of second complex number:");
		double real2 = scanner.nextDouble();
		double imaginary2 = scanner.nextDouble();
		Complex complex2 = new Complex(real2, imaginary2);

		Complex sum = complex1.add(complex2);
		System.out.println("Sum:");
		sum.display();

		Complex difference = complex1.subtract(complex2);
		System.out.println("Difference:");
		difference.display();

		Complex product = complex1.multiply(complex2);
		System.out.println("Product:");
		product.display();

	}
}
