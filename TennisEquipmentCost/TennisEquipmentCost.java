package TennisEquipmentCost;

import java.util.Scanner;

public class TennisEquipmentCost {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double racketPrice = Double.parseDouble(scanner.nextLine());
        int numberOfRackets = Integer.parseInt(scanner.nextLine());
        int numberOfShoes = Integer.parseInt(scanner.nextLine());

        double totalRacketPrice = racketPrice * numberOfRackets;
        double shoePrice = racketPrice / 6;
        double totalShoePrice = shoePrice * numberOfShoes;

        double otherEquipment = 0.2 * (totalRacketPrice + totalShoePrice);

        double totalPrice = totalRacketPrice + totalShoePrice + otherEquipment;

        System.out.printf("Price to be paid by Djokovic %.0f%n", Math.floor(totalPrice / 8));
        System.out.printf("Price to be paid by sponsors %.0f%n", Math.ceil(7 * totalPrice / 8));
    }
}
