package Еxam;

import java.util.Scanner;

public class GoldMine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n =Integer.parseInt(scanner.nextLine());
        int dobiv = 0;
        double averageDobivLocation = 0.0;

        for (int i = 0; i <n ; i++) {
            dobiv= Integer.parseInt(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            double dobivLocation = 0.0;

            for (int j = 0; j <days ; j++) {
                dobivLocation += Integer.parseInt(scanner.nextLine());
            }

            averageDobivLocation = dobivLocation / days;

            if (averageDobivLocation < dobiv){
                System.out.printf("You need %.2f gold.%n", (dobiv - averageDobivLocation));
            } else {
                System.out.printf("Good job! Average gold per day: %.2f.%n", averageDobivLocation);
            }
        }



    }
}
