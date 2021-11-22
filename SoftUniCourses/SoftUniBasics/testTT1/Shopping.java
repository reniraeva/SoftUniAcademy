package testTT1;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int numberOfVideocards = Integer.parseInt(scanner.nextLine());
        int numberOfProcessors = Integer.parseInt(scanner.nextLine());
        int numberOfMemorys = Integer.parseInt(scanner.nextLine());

        double videcard = numberOfVideocards * 250 ;
        double procesor =(numberOfProcessors * (videcard * 0.35));
        double memori = (numberOfMemorys * (videcard * 0.10));
        double budgetAll = videcard + procesor + memori;

        if(numberOfVideocards > numberOfProcessors) {
            budgetAll = budgetAll - (budgetAll * 0.15);

        }
        if (budgetAll <= budget ){

            System.out.printf("You have %.2f leva left!",(budget - budgetAll));
        }else {
            System.out.printf("Not enough money! You need %.2f leva more!",(budgetAll - budget));
        }


    }

}
