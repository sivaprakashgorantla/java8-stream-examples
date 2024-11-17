package nov24;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindingNumbersDemo {
	public static void main(String[] args) {
		 List<Integer> num = Arrays.asList(1,2,4,5);
		Integer totSum = num.stream().collect(Collectors.summingInt(Integer::intValue));
		int n=5;
		Integer idealSum = (n*(n+1)/2);
		System.out.println("Missing number : "+( idealSum - totSum));
	}
}
