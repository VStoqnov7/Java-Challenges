package BalancedParentheses;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            Stack<Character> stack = new Stack<>();
            boolean balanced = true;

            for (char c : input.toCharArray()) {
                if (c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                }
                else if (c == ')' || c == '}' || c == ']') {
                    if (stack.isEmpty()) {
                        balanced = false;
                        break;
                    }
                    char top = stack.pop();
                    if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                        balanced = false;
                        break;
                    }
                }
            }

            if (balanced && stack.isEmpty()) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }

        scanner.close();
    }
}