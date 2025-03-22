package StreamMethods;

import java.util.Arrays;
import java.util.List;

public class LimitAndSkipOperation {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1,4,5,6,7,323,231,1);
        List<Integer> limited = number.stream().limit(5).map(i->i*2).toList();
        List<Integer> skip = number.stream().limit(5).skip(2).map(i->i*2).toList();
        
        System.out.println(limited);

        System.out.println(skip);

    }
}
