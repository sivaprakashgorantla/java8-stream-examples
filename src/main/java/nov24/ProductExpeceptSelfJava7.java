package nov24;

import java.util.Arrays;

public class ProductExpeceptSelfJava7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[] { 1, 2, 3, 4, 5 };
		int result[] = isproductExpectSelf(arr);
		Arrays.stream(result).forEach(System.out::println);

	}

	private static int[] isproductExpectSelf(int[] arr) {
		// TODO Auto-generated method stub

		int product = 1;
		for (int i = 0; i < arr.length; i++) {
			product = product * arr[i];
		}

		int result[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			result[i] = product / arr[i];
		}
		return result;
	}

}
