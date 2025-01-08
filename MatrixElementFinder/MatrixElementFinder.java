package MatrixElementFinder;

import java.util.ArrayList;
import java.util.Scanner;

public class MatrixElementFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            int d = Integer.parseInt(input[0]);

            ArrayList<Integer> numbers = new ArrayList<>();
            for (int j = 1; j <= d; j++) {
                numbers.add(Integer.parseInt(input[j]));
            }
            matrix.add(numbers);
        }

        int q = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < q; i++) {
            String[] input = scanner.nextLine().split(" ");
            int row = Integer.parseInt(input[0]) - 1;
            int col = Integer.parseInt(input[1]) - 1;

            if (row > -1 && row < matrix.size() && col > -1 && col < matrix.get(row).size()){
                System.out.println(matrix.get(row).get(col));
            }else {
                System.out.println("ERROR!");
            }
        }
        scanner.close();
    }
}
