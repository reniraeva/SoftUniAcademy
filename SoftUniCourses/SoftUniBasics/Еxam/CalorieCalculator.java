package Еxam;

import java.util.Scanner;

public class CalorieCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sex = scanner.nextLine();//'m' за мъж и 'f' за жена
        double weight = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        int age = Integer.parseInt(scanner.nextLine());
        String AllActiv = scanner.nextLine();//sedentary, lightly active, moderately active, very active

        double sedentary = 1.2;
        double lightlyActive = 1.375;
        double moderatelyActive = 1.55;
        double veryActive = 1.725;
        double calories = 0.0;


        if (sex.equals("m")){
            //= 66 + (13.7 x тегло в килограми) + (5 x височина в сантиметри) - (6.8 x възрастта в години)
            calories = 66 +(13.7 * weight) + (5 * height * 100) - ( 6.8 * age);

        }else if (sex.equals("f")){
            //•	БНМ = 655 + (9.6 x тегло в килограми) + (1.8 x височина в сантиметри) - (4.7 x възрастта в години)
            calories = 655 +(9.6 * weight) + (1.8 * height * 100) - ( 4.7 * age);

        }
        switch (AllActiv){
            case "sedentary":
                calories = calories * sedentary;
                break;
            case "lightly active":
                calories = calories * lightlyActive;
                break;
            case "moderately active":
                calories = calories * moderatelyActive;
                break;
            case "very active":
                calories = calories * veryActive;
                break;


        }
        System.out.printf("To maintain your current weight you will need %.0f calories per day.",Math.ceil(calories));

    }
}
