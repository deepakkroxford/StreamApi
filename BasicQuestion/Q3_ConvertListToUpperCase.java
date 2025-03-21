package BasicQuestion;
import java.util.*;
import java.util.stream.*;

public class Q3_ConvertListToUpperCase {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "stream", "lambda");

        // Using method reference
        System.out.println("Using method reference:");
        List<String> upperCase = words.stream()
                                    .map(String::toUpperCase)
                                    .collect(Collectors.toList());
        List<String> lowerCase = words.stream()
                                    .map(String::toLowerCase)
                                    .collect(Collectors.toList());
        System.out.println("Upper case: " + upperCase);
        System.out.println("Lower case: " + lowerCase);

        // Using lambda expressions 
        System.out.println("\nUsing lambda expressions:");
        List<String> upperCaseWithLambda = words.stream()
                                               .map(str -> str.toUpperCase())
                                               .collect(Collectors.toList());
        List<String> lowerCaseWithLambda = words.stream()
                                               .map(str -> str.toLowerCase())
                                               .collect(Collectors.toList());
        System.out.println("Upper case: " + upperCaseWithLambda); 
        System.out.println("Lower case: " + lowerCaseWithLambda);
    }
}
