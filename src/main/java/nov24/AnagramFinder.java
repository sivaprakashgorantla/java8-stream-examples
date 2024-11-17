package nov24;
import java.util.*;

public class AnagramFinder {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Listion", "silent", "mam");
        List<List<String>> anagrams = findAnagrams(names);

        // Print the list of anagram groups
        anagrams.forEach(System.out::println);
    }

    public static List<List<String>> findAnagrams(List<String> words) {
        Map<String, List<String>> anagramGroups = new HashMap<>();

        for (String word : words) {
            // Convert word to lower case and sort its characters to find the canonical form
            String sortedWord = sortCharacters(word.toLowerCase());

            // Group words by their sorted character form
            anagramGroups
                .computeIfAbsent(sortedWord, k -> new ArrayList<>())
                .add(word);
            //System.out.println("sortedWord "+sortedWord);
        }
        
        // Collect groups that have more than one word (these are anagrams)
        List<List<String>> result = new ArrayList<>();
        System.out.println("anagramGroups ; "+anagramGroups);
        for (List<String> group : anagramGroups.values()) {
        	System.out.println("Group size :"+group.size());
            if (group.size() > 1) {
                result.add(group);
            }
        }

        return result;
    }

    // Helper method to sort the characters in a word
    private static String sortCharacters(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
