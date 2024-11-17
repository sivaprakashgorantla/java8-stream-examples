package nov24;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class finding_Non_Repeat_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method sub
		String str = "Java Hungry Blof Alive is Awasam";
		String string = str.chars().mapToObj(c -> String.valueOf(Character.toLowerCase((char)c)))
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
				.entrySet().stream().filter(e -> e.getValue()== 1).map(m -> m.getKey()).findFirst().get();
		               

		
		System.out.println("REpeacted Char : "+string);
	}

}
 