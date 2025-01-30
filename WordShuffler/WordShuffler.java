package WordShuffler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordShuffler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();

        System.out.println("Enter words (type 'end' to finish):");

        while (true) {
            String input = scanner.nextLine();
            if (input.trim().isEmpty()) {
                break;
            }
            words.add(input);
        }

        Collections.shuffle(words);

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n\n\n");
        System.out.println("\nThe shuffled words are:\n");

        int count = 1;
        for (String word : words) {
            System.out.println(count + " - " + word);
            count++;
        }

        scanner.close();
    }
}