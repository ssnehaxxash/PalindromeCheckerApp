import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class palindromeapp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Initialize stack (LIFO) and queue (FIFO)
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Push/enqueue characters
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            stack.push(ch);     // LIFO
            queue.add(ch);      // FIFO
        }

        // Compare stack.pop() vs queue.remove()
        boolean isPalindrome = true;
        while (!stack.isEmpty()) {
            char fromStack = stack.pop();
            char fromQueue = queue.remove();

            if (fromStack != fromQueue) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println("It is a Palindrome.");
        } else {
            System.out.println("It is NOT a Palindrome.");
        }

        sc.close();
    }
}
