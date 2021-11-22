package testTT1;

import java.util.Scanner;

public class touristShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String nameOfProdukt = "";
        double praiceProdukt = 0.0;

        int countPr = 0;
        double finalPraice = 0;

        while (true){
            nameOfProdukt = scanner.nextLine();
            if (nameOfProdukt.equals("Stop")){
                System.out.printf("You bought %d products for %.2f leva.", countPr,finalPraice);
                break;
            }
            praiceProdukt = Double.parseDouble(scanner.nextLine());

            countPr++;
            if (countPr % 3 == 0){
               praiceProdukt = praiceProdukt / 2;
            }
            finalPraice += praiceProdukt;
            if (finalPraice > budget){
                System.out.printf("You don't have enough money!%nYou need %.2f leva!",(finalPraice -budget) );
                break;
            }

        }

    }
}
