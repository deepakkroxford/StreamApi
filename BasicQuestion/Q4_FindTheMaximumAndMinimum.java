package BasicQuestion;
import java.util.*;
import java.util.stream.*;

public class Q4_FindTheMaximumAndMinimum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 5, 50, 40);

        int maxNumber = numbers.stream().max((a,b)->a-b).orElse(0);
        int minNumber = numbers.stream().min((a,b)->a-b).orElse(0);
        System.out.println("the maximum number in the list is "+maxNumber);
        System.out.println("the minimum number in the list is  "+minNumber);

    }
}
