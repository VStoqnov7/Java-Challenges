package UniquePairsWithSets;

import java.util.HashSet;
import java.util.Scanner;

public class UniquePairsWithSets {
    public static void main(String[] args) {

        // TODO: Solve the task without removing the following code
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        // TODO: End of the section that should not be removed

        HashSet<String> pairs = new HashSet<>();

        for (int i = 0; i < t; i++) {
            String pair = pair_left[i] + " " + pair_right[i];
            pairs.add(pair);
            System.out.println(pairs.size());
        }

        s.close();
    }
}
