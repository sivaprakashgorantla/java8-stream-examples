package nov24;

import java.util.stream.IntStream;

public class PalendromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "MadaM";
		
		System.out.print(isPalindrome(str));

		System.out.println("java8 "+ isPalindromeJava8(str));
	}

	private static boolean isPalindromeJava8(String str) {
		// TODO Auto-generated method stub
		return IntStream.range(0, str.length()/2).allMatch(i -> str.charAt(i) == str.charAt(str.length()-1 - i));
	}

	private static boolean isPalindrome(String str) {
		// TODO Auto-generated method stub
		
		int i = 0;
		int j = str.length() - 1;
		while( i < j ) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
