package WinBet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WinBet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Въведете прогнозите за мачовете (въвеждайте всеки резултат на нов ред).");
        System.out.println("Когато приключите, въведете празен ред (натиснете Enter):");

        // Събиране на прогнозите в списък
        ArrayList<String> matches = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                break;
            }
            matches.add(input);
        }

        int numberOfMatches = matches.size();
        int possibleCombinations = (int) Math.pow(3, numberOfMatches);

        System.out.println("Броят на възможните комбинации е: " + possibleCombinations);
        System.out.println("Всички възможни комбинации:");

        List<String> results = new ArrayList<>();
        generateCombinations(matches, 0, "", results);

        int counter = 1;
        for (String result : results) {
            System.out.println(counter + " - " + result);
            counter++;
        }
    }

    private static void generateCombinations(List<String> matches, int index, String currentCombination, List<String> results) {
        if (index == matches.size()) {
            results.add(currentCombination.trim());
            return;
        }

        String[] options = {"1", "X", "2"};
        for (String option : options) {
            generateCombinations(matches, index + 1, currentCombination + option + " ", results);
        }
    }
}