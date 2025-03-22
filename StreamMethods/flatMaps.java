package StreamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class flatMaps {
    public static void main(String[] args) {
        List<List<String>> nestedList = Arrays.asList(
            Arrays.asList("Apple", "Banana"),
            Arrays.asList("Orange", "Mango"),
            Arrays.asList("Grapes", "Pineapple")
        );
        // using flatMap we can make a single list from a nested list
        List<String> single = nestedList.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println("Flattened List: " + single);
            
        // Output: Apple, Banana, Orange, Mango, Grapes, Pineapple

        // Key points about flatMap:
        
        // 1. Use flatMap when working with nested collections (e.g., List of Lists)
        // 2. flatMap is like map + flatten - it transforms and flattens at the same time
        // 3. Useful for:
        //    - Converting nested lists into a single list
        //    - Handling Optional values and removing empty ones
        //    - Processing streams of streams
        //    - Working with multiple values that each input might produce
        
        // 4. Common use cases:
        //    - Extracting data from nested objects
        //    - Database queries returning multiple results per record
        //    - Processing file lines where each line contains multiple elements
        
        // 5. flatMap returns a stream of elements rather than a stream of collections
        //    making it easier to process data in a single stream pipeline
    }
}
