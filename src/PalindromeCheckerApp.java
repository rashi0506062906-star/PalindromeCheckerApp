public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded input string
        String input = "madam";

        // Convert string to character array
        char[] chars = input.toCharArray();

        // Two-pointer approach
        int left = 0;
        int right = chars.length - 1;

        boolean isPalindrome = true;

        // Compare characters from both ends
        while (left < right) {
            if (chars[left] != chars[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}