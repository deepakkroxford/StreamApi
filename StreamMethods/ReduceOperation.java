package StreamMethods;

import java.util.*;

public class ReduceOperation {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1,2,3,4,5);

        // The identity value 4 is used as the starting point
        // So it will add 4 + 1 + 2 + 3 + 4 + 5 = 19
        // accumulator contain the current result
        int sum = number.stream().reduce(4, (a,b)->a+b);
        System.out.println(sum);

        // Example with combiner for parallel stream
        // The combiner is used when stream is processed in parallel
        // It combines results from different threads
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int parallelSum = numbers.parallelStream().reduce(0,
            (a, b) -> {
                System.out.println("Accumulator: " + a + " + " + b);
                return a + b;
            },
            (a, b) -> {
                System.out.println("Combiner: " + a + " + " + b);
                return a + b;
            });
        System.out.println("Final parallel sum: " + parallelSum);


    }
    
}
