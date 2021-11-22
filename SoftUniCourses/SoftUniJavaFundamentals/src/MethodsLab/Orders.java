package MethodsLab;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        printTotal(product,quantity);

    }

    public static void printTotal(String product, double quantity) {

        double price = 0.0;

        switch (product){
            case "coffee":
                price = 1.50;
                break;
            case "water":
                price = 1.00;
                break;
            case "coke":
                price = 1.40;
                break;
            case "snacks":
                price = 2.00;
                break;
        }

        System.out.printf("%.2f",(quantity  * price));

    }
}
