package nov24;

import java.util.Arrays;

public class ProductExpeceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= new int[] {1,2,3,4,5};
		int result[] = isproductExpectSelf(arr);
		Arrays.stream(result).forEach(System.out::println);

	}

	private static int[] isproductExpectSelf(int[] arr) {
		// TODO Auto-generated method stub
		
		int product = Arrays.stream(arr).reduce(1, (a,b) -> a*b);
		
		return Arrays.stream(arr).map(m -> product/m).toArray();
	}

}
