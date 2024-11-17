package nov24;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FirstRepeatedCharacter {

    public static void main(String[] args) {
        String s = "cbapbaleb";
        firstRepeatedChar(s);
        firstRepeatedChar_new(s);
        
    }

	private static void firstRepeatedChar_new(String s) {
		// TODO Auto-generated method stub
		Optional<Character> firstRepeatedChar = s.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.toMap(
						Function.identity(),
						c -> 1,
						Integer::sum,
						LinkedHashMap::new
						))
				.entrySet()
				.stream()
				.filter(entry -> entry.getValue() >1)
				.map(Map.Entry::getKey)
				.findFirst();
		firstRepeatedChar.ifPresent(c -> System.out.println("First REpeated Char : "+c));
		
		Optional<Character> firstChar = s.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.toMap(
						Function.identity(),
						c -> 1,
						Integer::sum,
						LinkedHashMap::new
						))
				.entrySet()
				.stream()
				.filter(entry -> entry.getValue() >1)
				.map(Map.Entry::getKey)
				.findFirst();
		firstChar.ifPresent(c -> System.out.println("2 firlst "+c));
				
	}

	private static void firstRepeatedChar(String s) {
		// TODO Auto-generated method stub

        Optional<Character> firstRepeatedChar = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1) // Filter repeated characters
               // .sorted(Map.Entry.comparingByValue()) // Sort by the first occurrence (sorting by frequency)
                .map(Map.Entry::getKey) // Get character
                .findFirst();



		firstRepeatedChar.ifPresent(c -> System.out.println("First repeated character: " + c));
	}
}
