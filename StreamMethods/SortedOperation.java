package StreamMethods;

import java.util.*;
import java.util.stream.Collectors;

public class SortedOperation {
    public static void main(String[] args) {
        List<Integer> value = Arrays.asList(4, 7, 32, 7, 3, 1, 0, 6, 311, 22);
        List<Integer> sortingAscending = value.stream().sorted().collect(Collectors.toList());
        System.out.println(sortingAscending);
        List<Integer> sortingDescending = value.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortingDescending);

        // with String

        // from java 16 we can direclty write the toList() no need of the writing collect(Collectors.toList());
        List<String> names = Arrays.asList("John", "Alice", "Bob", "David", "Carol");
        List<String> sorting = names.stream().sorted().toList();
        List<String> descending = names.stream().sorted(Comparator.reverseOrder()).toList();

        System.out.println(sorting);
        System.out.println(descending);

    }
}
