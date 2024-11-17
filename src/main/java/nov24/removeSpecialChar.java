package nov24;

import java.util.stream.Collectors;

public class removeSpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Streams are not required for@ just iterating; the enhanced @forEach method is used to print each stu.?dent object using the method reference System.out::println.";
		StrongRemoveSpecialChar(str);
	}

	private static void StrongRemoveSpecialChar(String str) {
		// TODO Auto-generated method stub
		String output = str.chars().filter(c -> c != '?' && c != '/').mapToObj(s -> String.valueOf((char) s))
				.collect(Collectors.joining());
		System.out.println("output : " + output);
	}

}
