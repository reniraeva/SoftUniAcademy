package testTT1;

import java.util.Scanner;

public class club {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double profit = Double.parseDouble(scanner.nextLine());
        String nameOfCocktail = "";
        int naumberCocktails = 0;
        double money = 0.0;

        while (true){
            nameOfCocktail = scanner.nextLine();
            if (nameOfCocktail.equals("Party!")){
                System.out.printf("We need %.2f leva more.%n",(profit-money));
                System.out.printf("Club income - %.2f leva.",money);
                break;
            }
            naumberCocktails = Integer.parseInt(scanner.nextLine());
            double praice =nameOfCocktail.length();
            double curMoney = praice * naumberCocktails;
            if (curMoney % 2 == 1){
                curMoney = curMoney - (curMoney * 0.25);
            }
            money += curMoney;

            if (money >= profit){
                System.out.println("Target acquired.");
                System.out.printf("Club income - %.2f leva.",money);
                break;
            }

        }


    }
}
