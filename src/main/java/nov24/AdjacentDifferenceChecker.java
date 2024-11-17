package nov24;

import java.util.List;

public class AdjacentDifferenceChecker {
	public static void main(String[] args) {
		List<String> strings = List.of("abc", "defg", "acb", "bcd", "xyz", "abd","xyza");
		int count = countAdjacentDifferenceChecker(strings);
		System.out.println("Count of strings with adjacent characters differing by one: " + count);
	}

	private static int countAdjacentDifferenceChecker(List<String> strings) {
		// TODO Auto-generated method stub
		int count = 0;
		for (String s : strings) {
			if (hasAdjacentDifference(s)) {
				count++;
			}
		}
		return count;
	}

	private static boolean hasAdjacentDifference(String s) {
		// TODO Auto-generated method stub
		for (int i = 0; i < s.length() - 1; i++) {

			if (Math.abs(s.charAt(i) - s.charAt(i + 1)) != 1) {
				System.out.println("String ;"+s);
				return false;
			}
		}
		return true;
	}
}
