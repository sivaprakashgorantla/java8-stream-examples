package nov24;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertStringOfNumbersToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "1,2,3,4,5";
		Stream.of(str.split(",")) // Split the string into a stream of numbers
				.map(String::trim) // Trim any whitespace (if present)
				.map(Integer::parseInt) // Convert each number to an Integer
				.collect(Collectors.toList()) // Collect as a List
				.forEach(System.out::println); // Print each element in the list
		
		int sum = Stream.of(str.split(",")) // Split the string into a stream of numbers
        .map(String::trim)  // Trim any whitespace (if present)
        .mapToInt(Integer::parseInt) // Convert each number to an Integer
        .sum();
		System.out.println("Total Sum : "+sum);
	}

}
