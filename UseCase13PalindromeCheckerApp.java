// UC13: Performance Comparison

public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";

        long startTime = System.nanoTime();

        boolean isPalindrome = checkPalindrome(input);

        long endTime = System.nanoTime();

        long executionTime = endTime - startTime;

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + executionTime + " ns");
    }

    public static boolean checkPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}