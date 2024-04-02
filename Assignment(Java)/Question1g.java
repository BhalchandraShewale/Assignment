public class Question1g {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the pyramid

        for (int i = 1; i <= rows; i++) {
            for (int j = i; j < rows; j++) {
                System.out.print(" "); // Print spaces
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || k == (2 * i - 1) || i == rows) {
                    System.out.print("*"); // Print stars at the edges and base
                } else {
                    System.out.print(" "); // Print spaces inside the pyramid
                }
            }
            System.out.println(); // Move to the next line
        }
    }
}