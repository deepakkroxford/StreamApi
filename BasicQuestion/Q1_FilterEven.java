package BasicQuestion;
import java.util.*;
import java.util.stream.*;

public class Q1_FilterEven {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(2,1,3,10,22,33,11,6,7);
        
        List<Integer> even = li.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(even);
    }
}
