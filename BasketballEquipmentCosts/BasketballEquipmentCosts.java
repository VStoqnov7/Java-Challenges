package BasketballEquipmentCosts;

import java.util.Scanner;

public class BasketballEquipmentCosts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yearlyFee = Integer.parseInt(scanner.nextLine());

        double sneakersPrice = yearlyFee * 0.6;
        double outfitPrice = sneakersPrice * 0.8;
        double ballPrice = outfitPrice / 4;
        double accessoriesPrice = ballPrice / 5;

        double totalCost = yearlyFee + sneakersPrice + outfitPrice + ballPrice + accessoriesPrice;

        System.out.printf("%.2f%n", totalCost);
        scanner.close();
    }
}
