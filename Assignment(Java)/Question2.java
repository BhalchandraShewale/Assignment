public class Question2 {
	public static void main(String[] args) {
		int[] array = { 5, 7, 2, 4, 9 };
		int max = array[0];
		int sum = 0;

		// Calculate the sum and find the maximum element
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
			if (array[i] > max) {
				max = array[i];
			}
		}

		// Calculate the average 
		double average = (sum) / (double) (array.length);

		System.out.println("Maximum element in the array: " + max);
		System.out.printf("Average of elements in the array  "+average);
	}
}