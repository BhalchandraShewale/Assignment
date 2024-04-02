public class Question1c {
    public static void main(String[] args) {
        int rows = 6; // Define the number of rows in the pattern

        // Loop through each row
        for (int i = 1; i <= rows; i++) {
            // Print asterisks based on the row number
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after each row is printed
        }
    }
}