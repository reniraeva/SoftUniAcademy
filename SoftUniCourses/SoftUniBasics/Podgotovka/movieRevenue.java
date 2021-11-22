package Podgotovka;

import java.util.Scanner;

public class movieRevenue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movi = scanner.nextLine();
        int totalDay = Integer.parseInt(scanner.nextLine());
        int ticet = Integer.parseInt(scanner.nextLine());
        double ticetPrais = Double.parseDouble(scanner.nextLine());
        int comission = Integer.parseInt(scanner.nextLine());

        double profit = ticet * ticetPrais * totalDay;
        double netProfit = profit - (profit * comission / 100);

        System.out.printf("The profit from the movie %s is %.2f lv.",movi,netProfit);

    }
}
