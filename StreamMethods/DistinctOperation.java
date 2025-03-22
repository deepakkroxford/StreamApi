package StreamMethods;
import java.util.*;
public class DistinctOperation {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Bob", "John", "Carol", "Alice", "David", "Bob");
        List<String> distinctNames = names.stream().distinct().toList();
        
        System.out.println("Original List: " + names);
        System.out.println("List with distinct elements: " + distinctNames);

        // For integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 3, 4);
        List<Integer> distinctNumbers = numbers.stream().distinct().toList();
        
        System.out.println("\nOriginal Numbers: " + numbers);
        System.out.println("Distinct Numbers: " + distinctNumbers);

        // For characters
        List<Character> chars = Arrays.asList('a', 'b', 'a', 'c', 'b', 'd', 'c');
        List<Character> distinctChars = chars.stream().distinct().toList();
        
        System.out.println("\nOriginal Characters: " + chars);
        System.out.println("Distinct Characters: " + distinctChars);
    }
}
