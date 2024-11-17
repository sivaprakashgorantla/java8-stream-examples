package nov24;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class SortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Streams are not required for@ just iterating; the enhanced @forEach method is used to print each stu.?dent object using the method reference System.out::println.";
		String arr[] = str.split("@");
		String output = Arrays.stream(arr)
				.map(s -> Arrays.stream(s.split(""))
				.sorted().collect(Collectors.joining()))
				.collect(Collectors.joining("@"));
		System.out.println(output);

	}
}
