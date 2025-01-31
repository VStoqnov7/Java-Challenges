package TravelDestinationsParser;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TravelDestinationsParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String regex = "([=/])([A-Z][A-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        List<String> destinations = new ArrayList<>();

        while (matcher.find()){
            destinations.add(matcher.group(2));
        }

        System.out.printf("Destinations: %s%n",String.join(", ",destinations));
        System.out.printf("Travel Points: %d%n", destinations.stream().mapToInt(String::length).sum());
    }
}
