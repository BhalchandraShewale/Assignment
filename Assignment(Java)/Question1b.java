public class Question1b {
    public static void main(String[] args) {
        int rows = 3; // Define the number of rows in the pattern

        // Loop through each row
        for (int i = 0; i < rows; i++) {
            // Print the first and last row with all asterisks
            if (i == 0 || i == rows - 1) {
                for (int j = 0; j < 5; j++) {
                    System.out.print("*  ");
                }
            } else if (i == 1) { // Print the second row with one space in the middle
                System.out.print("*   ");
                for (int j = 0; j < 3; j++) {
                    System.out.print("   ");
                }
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row is printed
        }
    }
}