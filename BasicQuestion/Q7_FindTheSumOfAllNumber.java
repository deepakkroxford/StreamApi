package BasicQuestion;
import java.util.*;
import java.util.stream.*;

public class Q7_FindTheSumOfAllNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20);
        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum);
    }
}
