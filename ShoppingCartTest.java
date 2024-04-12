package assignment3;

class Product {
	private String name;
	private double price;

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Product{" + "name='" + name + '\'' + ", price=" + price + '}';
	}
}

class ShoppingCart {
	private Product[] products;
	private int size;
	private static final int MAX_CAPACITY = 10;

	public ShoppingCart() {
		this.products = new Product[MAX_CAPACITY];
		this.size = 0;
	}

	public void addProduct(Product product) {
		if (size < MAX_CAPACITY) {
			products[size++] = product;
			System.out.println("Product added successfully.");
		} else {
			System.out.println("Shopping cart is full. Cannot add more products.");
		}
	}

	public double calculateTotalCost() {
		double totalCost = 0;
		for (int i = 0; i < size; i++) {
			totalCost += products[i].getPrice();
		}
		return totalCost;
	}

	public void displayContents() {
		if (size == 0) {
			System.out.println("Shopping cart is empty.");
		} else {
			System.out.println("Products in the shopping cart:");
			for (int i = 0; i < size; i++) {
				System.out.println(products[i]);
			}
		}
	}
}

public class ShoppingCartTest {
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();

		// Adding products to the cart
		cart.addProduct(new Product("Laptop", 55000));
		cart.addProduct(new Product("Smartphone", 38000));
		cart.addProduct(new Product("Headphones", 1500));

		// Displaying contents of the cart
		cart.displayContents();

		// Calculating total cost
		double totalCost = cart.calculateTotalCost();
		System.out.println("Total cost: " + totalCost);
	}
}
