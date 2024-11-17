package nov24;

import java.util.Arrays;
import java.util.List;

public class LambdaExample {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
		
		names.stream().filter( s -> s.startsWith("A"))
		.map(String::toUpperCase)
		.forEach(System.out::println);
	}
}

