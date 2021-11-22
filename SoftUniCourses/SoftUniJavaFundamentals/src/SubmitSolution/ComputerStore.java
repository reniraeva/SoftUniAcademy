package SubmitSolution;

import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "";
        double sum = 0;
        double finalPrice = 0;
        double taxes = 0;

        while (true){
            input = scanner.nextLine();

            if (input.equals("special")){
                 taxes = sum * 0.2;
                finalPrice = (sum + taxes) - ((sum + taxes) * 0.1);

                break;
            }else if (input.equals("regular")){
                 taxes = sum * 0.2;
                 finalPrice = sum + taxes;
                break;
            } else {

                double price =Double.parseDouble(input);

                if (price < 0){
                    System.out.println("Invalid price!");
                }else {
                    sum += price;
                }

            }
        }
        if (finalPrice > 0) {

            System.out.printf("Congratulations you've just bought a new computer!\n" +
                    "Price without taxes: %.2f$\n" +
                    "Taxes: %.2f$\n" +
                    "-----------\n" +
                    "Total price: %.2f$\n", sum, taxes, finalPrice);
        }else {
            System.out.println("Invalid order!");
        }
    }
}
