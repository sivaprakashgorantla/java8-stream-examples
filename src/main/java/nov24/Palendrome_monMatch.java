package nov24;

import java.util.stream.IntStream;

public class Palendrome_monMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "liril";
		System.out.println(isPalendrome(str));
	}

	private static boolean isPalendrome(String str) {
		// TODO Auto-generated method stub

		String s = str.replaceAll("\s", "").toLowerCase();
		return IntStream.range(1, s.length() / 2).noneMatch(i -> s.charAt(i) != s.charAt( s.length() -i - 1));

	}

}
