import java.util.stream.*;
import java.util.*;

public class Q1_FindWordLargestLength {
    public static int largestLength(String s)
    {
        String [] x = s.split(" ");
        String res ="";
        int max = Integer.MIN_VALUE;
        for(int i=0;i<x.length;i++)
        {
            String temp = x[i];
           if(max<temp.length())
           {
            res = x[i];
            max = temp.length();
           }
        }
        System.out.println(res);
        return max;
    }
    public static void main(String[] args) {
        String s = "I am Learning Stream Api";
        System.out.println(largestLength(s));

        // now i have to solve this using the java 8.

        // The error occurs because String class doesn't have a method called st()
        // To create a Stream of words from a String, we need to:
        // 1. First split the string into an array using split()
        // 2. Then convert the array to stream using Arrays.stream()
       
        int maxLength = Arrays.stream(s.split(" "))
                             .mapToInt(String::length)
                             .max()
                             .orElse(0);
        System.out.println(maxLength);

        String longestWord = Arrays.stream(s.split(" "))
                                 .max((a, b) -> a.length() - b.length())
                                 .orElse("");
        System.out.println(longestWord);
        
        
    }
}