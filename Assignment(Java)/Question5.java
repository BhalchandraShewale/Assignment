public class Question5{
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 4, 8, 1, 3, 1, 5, 1};

        // Initialize an array to store the frequency of each element
        int[] frequency = new int[array.length];

        // Calculate the frequency of each element
        for (int i = 0; i < array.length; i++) {
            int count = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    frequency[j] = -1; // Mark the element as counted
                }
            }
            if (frequency[i] != -1) {
                frequency[i] = count;
            }
        }

        // Display the frequency of each element
        System.out.println("Element Frequency:");
        for (int i = 0; i < array.length; i++) {
            if (frequency[i] != -1) {
                System.out.println(array[i] + " occurs " + frequency[i] + " times");
            }
        }
    }
}