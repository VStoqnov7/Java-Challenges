package Registration;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        String input = scanner.nextLine();

        while (!input.equals("Registration")) {
            String[] commandParts = input.split(" ");
            String caseType = commandParts[0];

            switch (caseType) {
                case "Letters":
                    switch (commandParts[1]) {
                        case "Lower":
                            command = command.toLowerCase();
                            System.out.println(command);
                            break;
                        case "Upper":
                            command = command.toUpperCase();
                            System.out.println(command);
                            break;
                    }
                    break;
                case "Reverse":
                    int startIndex = Integer.parseInt(commandParts[1]);
                    int endIndex = Integer.parseInt(commandParts[2]);
                    if (startIndex >= 0 && endIndex < command.length() && startIndex <= endIndex) {
                        String reversedSubstring = new StringBuilder(command.substring(startIndex, endIndex + 1)).reverse().toString();
                        System.out.println(reversedSubstring);
                    }
                    break;
                case "Substring":
                    if (command.contains(commandParts[1])){
                        command = command.replace(commandParts[1], "");
                        System.out.println(command);
                    }else {
                        System.out.printf("The username %s doesn't contain %s.%n", command, commandParts[1]);
                    }
                    break;
                case "Replace":
                    if (command.contains(commandParts[1])){
                        command = command.replace(commandParts[1],"-");
                        System.out.println(command);
                    }
                    break;
                case "IsValid":
                    if (command.contains(commandParts[1])){
                        System.out.println("Valid username.");
                    }else {
                        System.out.printf("%s must be contained in your username.%n",commandParts[1]);
                    }
                    break;
                default:
                    System.out.println("Invalid command.");
                    break;
            }


            input = scanner.nextLine();
        }

        scanner.close();
    }
}
