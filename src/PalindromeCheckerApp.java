public class PalindromeProgram {

    public static void main(String[] args) {

        // Hardcoded string
        String str = "madam";

        // Variable to store reversed string
        String reversed = "";

        // Reverse the string
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        // Check palindrome using if-else
        if (str.equals(reversed)) {
            System.out.println("The string \"" + str + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + str + "\" is not a palindrome.");
        }

    }
}