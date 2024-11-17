package nov24;

import java.util.stream.Collectors;

public class DuplicateCount2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = " Rama is a good boy. Rama";
		str.chars().mapToObj(c -> (char)c)
		.collect(Collectors.groupingBy(ch -> ch,Collectors.counting()))
		.entrySet().stream().filter(e -> e.getValue()>1).forEach(System.out::println);

	}

}
