package advancedConditional;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Вид цветя - текст с възможности - "Roses", "Dahlias", "Tulips", "Narcissus", "Gladiolus"
        // Брой цветя - цяло число в интервала [10…1000]
        //	Бюджет - цяло число в интервала [50…2500]
        String nameFlowers = scanner.nextLine();
        int flowersCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double price = 0; //крайната цена
        switch (nameFlowers){
            case "Roses":
                price = flowersCount * 5;
                if(flowersCount > 80){
                    price = price - (0.10 * price);
                }
                break;
            case "Dahlias":
                price = flowersCount * 3.80;
                if (flowersCount > 90){
                    price = price - (0.15 * price);
                }
                break;
            case "Tulips":
                price = flowersCount * 2.80;
                if (flowersCount > 80){
                    price = price - (0.15 * price);
                }
                break;
            case "Narcissus":
                price = flowersCount * 3;
                if (flowersCount < 80){
                    price = price +(0.15 * price);
                }
                break;
            case "Gladiolus":
                price = flowersCount * 2.50;
                if (flowersCount < 80){
                    price = price +(0.20 * price);
                }
                break;

        }
        if (budget >= price){
            double leftMoney = budget - price;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowersCount, nameFlowers, leftMoney);
        } else {
            double needMoney = price -budget;
            System.out.printf("Not enough money, you need %.2f leva more.", needMoney );
        }
        //Да се отпечата на конзолата на един ред:
        //•	Ако бюджета им е достатъчен - "Hey, you have a great garden with {броя цвета} {вид цветя} and {останалата сума} leva left."
        //•	Ако бюджета им е НЕ достатъчен - Not enough money, you need {нужната сума} leva more."

    }
}
