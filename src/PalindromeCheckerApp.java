import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded input string
        String input = "madam";

        // Create Queue (FIFO) and Stack (LIFO)
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue into queue and push into stack
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            queue.add(ch);     // Enqueue
            stack.push(ch);    // Push
        }

        boolean isPalindrome = true;

        // Compare dequeue (queue) with pop (stack)
        for (int i = 0; i < input.length(); i++) {
            char fromQueue = queue.remove(); // Dequeue (FIFO)
            char fromStack = stack.pop();    // Pop (LIFO)

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}