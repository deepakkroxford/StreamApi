package BasicQuestion;
import java.util.*;
import java.util.stream.*;

public class Q5_RemoveTheDuplicate {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 6,6);

        // but this method does not maintain the original order 
        Set<Integer> removed = numbers.stream().collect(Collectors.toSet()); 
        System.out.println(removed);

        // this method maintain the original order
        List<Integer> duplicate = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(duplicate);


    }
}
