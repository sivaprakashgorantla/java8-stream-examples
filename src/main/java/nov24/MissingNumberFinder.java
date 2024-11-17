package nov24;
import java.util.stream.IntStream;

public class MissingNumberFinder {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 5, 6}; // Example array with missing number 3
        int missingNumber = findMissingNumber(numbers);
        System.out.println("Missing number: " + missingNumber);
    }

    public static int findMissingNumber(int[] numbers) {
        // Calculate the expected sum of numbers from the smallest to the largest in the array
        int expectedSum = IntStream.rangeClosed(1, numbers.length + 1).sum();

        // Calculate the actual sum of elements in the array
        int actualSum = IntStream.of(numbers).sum();

        // The missing number is the difference between the expected and actual sum
        return expectedSum - actualSum;
    }
}
