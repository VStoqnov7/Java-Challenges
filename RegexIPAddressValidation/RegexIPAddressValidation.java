package RegexIPAddressValidation;

import java.util.Scanner;

public class RegexIPAddressValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String IP = scanner.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }
}
