package Conditional;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double ekskurzia = Double.parseDouble(scanner.nextLine());
        double puzzle = Double.parseDouble(scanner.nextLine()) ;
        double dous = Double.parseDouble(scanner.nextLine()) ;
        double bear = Double.parseDouble(scanner.nextLine()) ;
        double minion = Double.parseDouble(scanner.nextLine()) ;
        double car = Double.parseDouble(scanner.nextLine()) ;

        double puzzlePrice = 2.60;
        double dousPrice = 3.00;
        double bearPrice = 4.10;
        double minionPrice = 8.20 ;
        double carPrice = 2.00 ;

        double total = puzzle * puzzlePrice + dous * dousPrice + bear * bearPrice + minion * minionPrice + car * carPrice;
        double toys = puzzle + dous + bear + minion + car;

        if (toys >= 50) {
            total = total - (total * 0.25);
        }
        total = total - (total * 0.10);

        if (total >= ekskurzia) {
            System.out.printf("Yes! %.2f lv left.", (total - ekskurzia));
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", ( ekskurzia - total));
        }

    }
}
