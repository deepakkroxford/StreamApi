import java.util.*;
import java.util.stream.*;

public class StreamIntroduction {

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 4, 21, 42, 12);
        
        // 1. Intermediate Operations
        
        // map: Transform elements
        List<Integer> doubled = li.stream()
                                .map(i -> i * 2)
                                .collect(Collectors.toList());
        System.out.println("Mapped (doubled): " + doubled);
        
        // filter: Filter elements based on condition
        List<Integer> evenNumbers = li.stream()
                                    .filter(i -> i % 2 == 0)
                                    .collect(Collectors.toList());
        System.out.println("Filtered (even numbers): " + evenNumbers);
        
        // sorted: Sort elements
        List<Integer> sorted = li.stream()
                               .sorted()
                               .collect(Collectors.toList());
        System.out.println("Sorted: " + sorted);
        
        // distinct: Remove duplicates
        List<Integer> distinct = li.stream()
                                 .distinct()
                                 .collect(Collectors.toList());
        System.out.println("Distinct: " + distinct);
        
        // limit: Limit stream size
        List<Integer> limited = li.stream()
                                .limit(3)
                                .collect(Collectors.toList());
        System.out.println("Limited to 3: " + limited);
        
        // skip: Skip elements
        List<Integer> skipped = li.stream()
                                .skip(2)
                                .collect(Collectors.toList());
        System.out.println("Skipped first 2: " + skipped);
        
        // 2. Terminal Operations
        
        // count: Count elements
        long count = li.stream().count();
        System.out.println("Count: " + count);
        
        // anyMatch, allMatch, noneMatch
        boolean hasEven = li.stream().anyMatch(i -> i % 2 == 0);
        boolean allEven = li.stream().allMatch(i -> i % 2 == 0);
        boolean noneNegative = li.stream().noneMatch(i -> i < 0);
        System.out.println("Has even: " + hasEven);
        System.out.println("All even: " + allEven);
        System.out.println("None negative: " + noneNegative);
        
        // findFirst, findAny
        Optional<Integer> first = li.stream().findFirst();
        Optional<Integer> any = li.stream().findAny();
        System.out.println("First element: " + first.orElse(0));
        System.out.println("Any element: " + any.orElse(0));
        
        // min, max
        Optional<Integer> min = li.stream().min(Integer::compareTo);
        Optional<Integer> max = li.stream().max(Integer::compareTo);
        System.out.println("Min: " + min.orElse(0));
        System.out.println("Max: " + max.orElse(0));
        
        // reduce
        int sum = li.stream().reduce(0, (a, b) -> a + b);
        int product = li.stream().reduce(1, (a, b) -> a * b);
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        
        // collect with different collectors
        // To List
        List<Integer> toList = li.stream().collect(Collectors.toList());
        // To Set
        Set<Integer> toSet = li.stream().collect(Collectors.toSet());
        // To Map
        Map<Integer, Integer> toMap = li.stream()
            .collect(Collectors.toMap(k -> k, v -> v * v, (v1, v2) -> v1));
        // Joining (after converting to strings)
        String joined = li.stream()
            .map(String::valueOf)
            .collect(Collectors.joining(", "));
        
        System.out.println("As List: " + toList);
        System.out.println("As Set: " + toSet);
        System.out.println("As Map (number -> square): " + toMap);
        System.out.println("Joined as string: " + joined);
        
        // Statistics
        IntSummaryStatistics stats = li.stream()
            .mapToInt(Integer::intValue)
            .summaryStatistics();
        System.out.println("Statistics: " + stats);
    }
}