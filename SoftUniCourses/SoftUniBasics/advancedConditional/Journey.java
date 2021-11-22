package advancedConditional;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String rest = "";
        String destination = "";
        double amountSpent = 0;

        if (budget > 1000) {
            destination = "Europe";
            amountSpent = budget * 0.90;
            rest = "Hotel";
        } else if (season.equals("summer") && (budget > 100 && budget <= 1000)) {
            amountSpent = budget * 0.40;
            destination = "Balkans";
            rest = "Camp";
        } else if ((season.equals("winter") && (budget > 100 && budget <= 1000))) {
            amountSpent = budget * 0.80;
            destination = "Balkans";
            rest = "Hotel";
        } else if (season.equals("summer") && (budget <= 100)) {
            amountSpent = budget * 0.30;
            destination = "Bulgaria";
            rest = "Camp";
        } else if ((season.equals("winter") && (budget <= 100))) {
            amountSpent = budget * 0.70;
            destination = "Bulgaria";
            rest = "Hotel";
        }

        System.out.printf("Somewhere in %s%n%s - %.2f", destination, rest, amountSpent);

    }

}

