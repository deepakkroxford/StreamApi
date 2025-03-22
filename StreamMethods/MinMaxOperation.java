package StreamMethods;

import java.util.*;

public class MinMaxOperation {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(4,2,1,44,212,766,2,211,2,423,12,121);
        int maximum = number.stream().max((a,b)->a-b).orElse(0);
        System.out.println(maximum);

        int minimum = number.stream().min((a,b)->a-b).orElse(0);
        System.out.println(minimum);
    }
}
