package BasicQuestion;
import java.util.*;
import java.util.stream.*;


public class Q2_FindFirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String input = "swiss";
        Character result = input.chars()
        .mapToObj(c -> (char) c)  // Convert int to Character
        .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting())) // Count occurrences
        .entrySet().stream()
        .filter(entry -> entry.getValue() == 1) // Find non-repeating character
        .map(Map.Entry::getKey)
        .findFirst()
        .orElse(null); // Return null if no non-repeating character found

    System.out.println("the result is :- "+result); // Output: w
    }
}
