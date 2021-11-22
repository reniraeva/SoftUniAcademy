package Еxam;

import java.util.Scanner;

public class MiningRig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int priceOfVideoCard = Integer.parseInt(scanner.nextLine());
        int priceOfAdapter = Integer.parseInt(scanner.nextLine());
        double priseToc = Double.parseDouble(scanner.nextLine());
        double profitFromCardDay = Double.parseDouble(scanner.nextLine());

        int totalMoney = 0;
        double returnDays = 0.0;
        int card = 13;
        int adaptar = 13;
        int priseTwo = 1000;

        totalMoney = (priceOfVideoCard * card)+(priceOfAdapter * adaptar) + priseTwo;

        returnDays = totalMoney / ((profitFromCardDay - priseToc) * card);


        System.out.println(totalMoney);
        System.out.println((int)Math.ceil(returnDays));


    }
}
