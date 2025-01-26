package Lotto6of49;

import java.util.ArrayList;
import java.util.List;

public class Lotto6of49 {
    public static void main(String[] args) {
        int n = 49; // Общ брой числа
        int k = 6;  // Брой избрани числа

        List<List<Integer>> combinations = new ArrayList<>();

        generateCombinations(1, n, k, new ArrayList<>(), combinations);

        System.out.println("Общ брой комбинации: " + combinations.size());
        System.out.println("Първите 1000 комбинации са:");

        int counter = 1;
        for (List<Integer> combination : combinations) {
            if (counter > 1000) break;
            System.out.println(counter + " - " + combination);
            counter++;
        }
    }

    private static void generateCombinations(int start, int end, int k, List<Integer> current, List<List<Integer>> combinations) {
        if (current.size() == k) {
            combinations.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i <= end; i++) {
            current.add(i);
            generateCombinations(i + 1, end, k, current, combinations);
            current.remove(current.size() - 1);
        }
    }
}
