package testTT1;

import java.util.Scanner;

public class safari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//Бюджет –  литра гориво ще са им нужни –Ден от седмицата –  "Saturday" и "Sunday"
        double budget = Double.parseDouble(scanner.nextLine());
        double ltBfuel = Double.parseDouble(scanner.nextLine());
        String day = scanner.nextLine();

//Цен.на 1 литър гориво- 2.10;Цен.за екскурзовод е 100лв;зависимост от деня-отстъпки от общата цена -събота 10%,неделя 20%

        double fuelPrice = ltBfuel * 2.10;
        double guide = fuelPrice + 100;
        double budgetAll = 0;


        if (day.equals("Saturday")) {
            budgetAll = guide - (guide * 0.10);

        } else {
            budgetAll = guide - (guide * 0.20);

        }
        if (budgetAll <= budget){
            double sufficientBudget = budget - budgetAll;
            System.out.printf("Safari time! Money left: %.2f lv.",sufficientBudget );

        }else {
            double notSufficientBudget = budgetAll - budget;
            System.out.printf("Not enough money! Money needed: %.2f lv.",notSufficientBudget);
        }

    }
}

