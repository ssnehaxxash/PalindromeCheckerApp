import java.util.Scanner;
import java.util.Stack;

public class palindromeapp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Create a stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push each character into the stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Pop characters to build the reversed string
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        // Compare original and reversed strings
        if (input.equals(reversed)) {
            System.out.println("It is a Palindrome.");
        } else {
            System.out.println("It is NOT a Palindrome.");
        }

        sc.close();
    }
}