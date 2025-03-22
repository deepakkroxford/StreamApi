package StreamMethods;

import java.util.Arrays;
import java.util.List;

public class PeekOperation {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(2,4,6,12,1,3,45);
        List<Integer> multiply = number.stream().peek(n->System.out.println("Before"+n)).map(i->i*2).peek(n->System.out.println("after "+n)).toList();
        System.out.println(multiply);
    }
}
