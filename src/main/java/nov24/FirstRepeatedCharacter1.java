package nov24;



import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedCharacter1 {

    public static void main(String[] args) {
        String s = "cbapbaleb";

        Set<Character> seenCharacters = new HashSet<>();
        char firstRepeatedChar = '\0'; // Default value to indicate no repeated character found

        for (char c : s.toCharArray()) {
            if (seenCharacters.contains(c)) {
                firstRepeatedChar = c; // Found the first repeated character
                break;
            } else {
                seenCharacters.add(c); // Add character to set
            }
        }

        if (firstRepeatedChar != '\0') {
            System.out.println("First repeated character: " + firstRepeatedChar);
        } else {
            System.out.println("No repeated characters found.");
        }
    }
}
