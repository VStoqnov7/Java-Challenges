package IntegerToStringConverter;

import java.util.Scanner;

public class IntegerToStringConverter {
    public static void main(String[] args) {

        try {
            Scanner in = new Scanner(System.in);
            int n = in .nextInt();
            in.close();
            String s = String.valueOf(n);

            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }
        } catch (RuntimeException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }
}
