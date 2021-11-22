package advancedConditional;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //1 вход.Бюджет на групата – цяло число в интервала [1…8000]
        // Сезон –  текст : "Spring", "Summer", "Autumn", "Winter"
        // Брой рибари – цяло число в интервала [4…18]
       // 2.наем на кораба-сезон
        //3.отстъпката спраямо бр.
        //дом отстъпка
        //5 проверка на бщжета
         int budget = Integer.parseInt(scanner.nextLine());
         String season = scanner.nextLine();
         int fishermen = Integer.parseInt(scanner.nextLine());

         double priceShip = 0;

          switch (season){
              case "Spring":
                  priceShip = 3000;

                  break;

              case "Summer":
              case "Autumn":
                  priceShip = 4200;
                  break;

              case "Winter":
                  priceShip = 2600;
                  break;
          }

          if(fishermen <= 6){
              priceShip = priceShip -( 0.10 * priceShip);
          } else if ( fishermen >= 7 && fishermen <= 11){
              priceShip = priceShip -( 0.15 * priceShip);
          } else {
              priceShip = priceShip -( 0.25 * priceShip);

          }
          if(fishermen % 2 == 0 && !season.equals("Autumn")){
              priceShip = priceShip - (0.05 * priceShip);
          }
          //dos b-"Yes! You have {останалите пари} leva left."
        //nedos b -"Not enough money! You need {сумата, която не достига} leva."
        if (budget >= priceShip){
            double leftMoney = budget - priceShip;
            System.out.printf("Yes! You have %.2f leva left.", leftMoney );

        }else {
            double enoughMoney = priceShip - budget;
            System.out.printf("Not enough money! You need %.2f leva.", enoughMoney);

        }

    }
}

