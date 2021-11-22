package firststep;

import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      //input
        double strowberryPrice = Double.parseDouble(scanner.nextLine());
        double bananaKg = Double.parseDouble(scanner.nextLine());
        double orangeKg = Double.parseDouble(scanner.nextLine());
        double raspberryKg = Double.parseDouble(scanner.nextLine());
        double strowberryKg = Double.parseDouble(scanner.nextLine());

        // logic
        double raspberryPrice = strowberryPrice * 0.5;
        double orangePrice = raspberryPrice * 0.6;
        double bananaPrice = raspberryPrice * 0.2;

        double totalMoney = (strowberryPrice * strowberryKg) + (bananaKg * bananaPrice) + (orangeKg * orangePrice) + (raspberryKg * raspberryPrice);




        // output

        System.out.printf("%.2f",totalMoney );

    }
}
