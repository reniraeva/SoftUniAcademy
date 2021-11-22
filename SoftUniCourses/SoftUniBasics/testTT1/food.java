package testTT1;

import java.util.Scanner;

public class food {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numberChicenMenus = Double.parseDouble(scanner.nextLine());
        double numberFishMenus =  Double.parseDouble(scanner.nextLine());
        double numberVegatarianMenus =  Double.parseDouble(scanner.nextLine());

        //Напишете програма, която изчислява колко ще струва на група хора да си поръчат храна за вкъщи.
        //Групата ще си поръча и десерт, цена = на 20% от общата сметка (без доставката)
        // Цената на доставка е 2.50лв и се начислява най-накрая./Пилешко – 10.35 лв.;риба – 12.40 лв.Вегетарианско – 8.15 лв.
         double chicenMenus = 10.35;
         double fishMenus = 12.40;
         double vegtarianMenus = 8.15;
         double delivery = 2.50;

        double priceChicen = numberChicenMenus * chicenMenus;
        double priseFish = numberFishMenus * fishMenus;
        double priceVegan = numberVegatarianMenus * vegtarianMenus;
        double dessert = (priceChicen + priseFish + priceVegan)* 0.20;
        double priseAll = (priceChicen + priseFish + priceVegan) + (dessert + delivery) ;

        System.out.printf("Total: %.2f", priseAll);
    }
}
