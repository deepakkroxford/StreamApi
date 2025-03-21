package BasicQuestion;
import java.util.*;
import java.util.stream.*;

public class Q6_SortedInDecendingOrder {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("banana", "apple", "cherry", "mango");

        List<String> decendingOrder = words.stream()
                                         .sorted(Comparator.reverseOrder())
                                         .collect(Collectors.toList());
        System.out.println(decendingOrder);
        
    }
}
