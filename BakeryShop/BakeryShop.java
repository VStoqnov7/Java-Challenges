package BakeryShop;

import java.util.*;

public class BakeryShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> stock = new LinkedHashMap<>();
        int totalSold = 0;

        String input = scanner.nextLine();

        while (!input.equals("Complete")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            int quantity = Integer.parseInt(tokens[1]);
            String food = tokens[2];

            switch (command) {
                case "Receive":
                    if (quantity > 0) {
                        stock.put(food, stock.getOrDefault(food, 0) + quantity);
                    }
                    break;
                case "Sell":
                    if (!stock.containsKey(food)) {
                        System.out.printf("You do not have any %s.%n", food);
                    } else {
                        int currentStock = stock.get(food);
                        if (quantity > currentStock) {
                            System.out.printf("There aren't enough %s. You sold the last %d of them.%n", food, currentStock);
                            totalSold += currentStock;
                            stock.remove(food);
                        } else {
                            stock.put(food, currentStock - quantity);
                            System.out.printf("You sold %d %s.%n", quantity, food);
                            totalSold += quantity;
                            if (stock.get(food) == 0) {
                                stock.remove(food);
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("Invalid command!");
                    break;
            }
            input = scanner.nextLine();
        }

        stock.forEach((key,value) -> System.out.printf("%s: %d%n",key,value));
        System.out.printf("All sold: %d goods%n",totalSold);
    }
}
