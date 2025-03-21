import java.util.stream.IntStream;

public class Q2_CheckingPalindrome {
    public static boolean isPalindrome(String str)
    {
        String cleand = str.replaceAll("\\s+", "").toLowerCase(); 
        return IntStream.range(0, str.length()/2).allMatch(i->cleand.charAt(i)==cleand.charAt(cleand.length()-i-1));
    }
    public static void main(String[] args) {
        String test1 = "madam";
        String test2 = "hello";
        String test3 = "racecar";
        String test4 = "A man a plan a canal Panama";

        System.out.println(test1 + " -> " + isPalindrome(test1)); // true
        System.out.println(test2 + " -> " + isPalindrome(test2)); // false
        System.out.println(test3 + " -> " + isPalindrome(test3)); // true
        System.out.println(test4 + " -> " + isPalindrome(test4)); // true
    }
}
