package assignment3;

import java.util.Scanner;

public class Matrix {
	private int rows;
	private int columns;
	private int[][] elements;

	public Matrix(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		this.elements = new int[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setElement(int i, int j, int value) {
		if (i >= 0 && i < rows && j >= 0 && j < columns) {
			elements[i][j] = value;
		} else {
			System.out.println("Invalid position for setting element.");
		}
	}

	public void add(Matrix other) {
		if (this.rows == other.rows && this.columns == other.columns) {
			System.out.println("Addition Result:");
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					System.out.print((this.elements[i][j] + other.elements[i][j]) + " ");
				}
				System.out.println();
			}
		} else {
			System.out.println("Matrices cannot be added.");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of rows and columns for the first matrix:");
		int rows1 = scanner.nextInt();
		int columns1 = scanner.nextInt();
		Matrix matrix1 = new Matrix(rows1, columns1);

		System.out.println("Enter the elements of the first matrix:");
		for (int i = 0; i < rows1; i++) {
			for (int j = 0; j < columns1; j++) {
				matrix1.setElement(i, j, scanner.nextInt());
			}
		}

		System.out.println("Enter the number of rows and columns for the second matrix:");
		int rows2 = scanner.nextInt();
		int columns2 = scanner.nextInt();
		Matrix matrix2 = new Matrix(rows2, columns2);

		System.out.println("Enter the elements of the second matrix:");
		for (int i = 0; i < rows2; i++) {
			for (int j = 0; j < columns2; j++) {
				matrix2.setElement(i, j, scanner.nextInt());
			}
		}

		System.out.println("First Matrix:");
		printMatrix(matrix1);
		System.out.println("Second Matrix:");
		printMatrix(matrix2);

		System.out.println("Adding two matrices:");
		matrix1.add(matrix2);

	}

	private static void printMatrix(Matrix matrix) {
		for (int i = 0; i < matrix.getRows(); i++) {
			for (int j = 0; j < matrix.getColumns(); j++) {
				System.out.print(matrix.elements[i][j] + " ");
			}
			System.out.println();
		}
	}
}
