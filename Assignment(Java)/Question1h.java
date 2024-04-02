public class Question1h {
    public static void main(String[] args) {
        int rows = 5; // Define the number of rows in the pattern

        // Loop through each row
        for (int i = 1; i <= rows; i++) {
            // Print spaces for formatting
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("   ");
            }

            // Print numbers in ascending and descending order
            for (int j = i; j < 2 * i; j++) {
                System.out.print(j + "  ");
            }
            for (int j = 2 * i - 2; j >= i; j--) {
                System.out.print(j + "  ");
            }

            System.out.println(); // Move to the next line after each row is printed
        }
    }
}