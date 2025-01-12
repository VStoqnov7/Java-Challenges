package PalindromeValidator;

import java.util.Scanner;

public class PalindromeValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine().trim();
        StringBuilder sb = new StringBuilder();

        for (int i = word.length() - 1; i >= 0 ; i--) {
            sb.append(word.charAt(i));
        }

        if (word.equals(sb.toString())){
            System.out.println("Yes");
        }else {
            System.out.print("No");
        }
    }

}
