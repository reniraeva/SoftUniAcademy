package Еxam;

import java.util.Scanner;

public class CatFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numberOfCats = Integer.parseInt(scanner.nextLine());
        double gramsOfFood = 0.0;
        double allGramsFood = 0.0;

        int grup1 = 0;
        int grup2 = 0;
        int grup3 = 0;
        double priceFood = 0.0;

        for (int i = 0; i < numberOfCats; i++) {
            gramsOfFood = Double.parseDouble(scanner.nextLine());
            allGramsFood += gramsOfFood;

            if (gramsOfFood >= 100 && gramsOfFood < 200){
                grup1++;
            }else if (gramsOfFood >= 200 && gramsOfFood < 300){
                grup2++;
            }else if (gramsOfFood >= 300 && gramsOfFood < 400){
                grup3++;
            }

        }
        priceFood = (allGramsFood /1000) * 12.45;

        System.out.printf("Group 1: %d cats.%n",grup1);
        System.out.printf("Group 2: %d cats.%n",grup2);
        System.out.printf("Group 3: %d cats.%n",grup3);
        System.out.printf("Price for food per day: %.2f lv.",priceFood);




    }
}
