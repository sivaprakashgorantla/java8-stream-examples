package nov24;
import java.util.*;

public class AnagramFinderExp {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Listion", "silent", "mam");
        //isAnagrams("peek","keep");
        isAnagrams("Hitler women","Mother in law");
    }

	private static void isAnagrams(String string1, String string2) {
		// TODO Auto-generated method stub
		boolean flag= true;
		char ch1[] =string1.replace("\s","").toLowerCase().toCharArray();
		char ch2[] =string2.replace("\s","").toLowerCase().toCharArray();
		
		if(string1.length()!=string2.length())
			flag = false;
		else {
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			flag = Arrays.equals(ch1, ch2);
		}
			
		if(flag)
			System.out.println(string1 +" and " +string2 +" Anagram.");
		else
			System.out.println(Arrays.toString(ch1) +" and " +Arrays.toString(ch1)+" Not Anagram.");
	}
}
