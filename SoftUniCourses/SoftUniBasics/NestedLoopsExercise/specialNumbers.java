package NestedLoopsExercise;

import java.util.Scanner;

public class specialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int number = 1111; number < 9999; number++) {

            int units = number % 10; // 3698 %10=8
            int tens =number / 10 % 10;// 3698 /10=369%10 =9
            int hundreds = number / 100 % 10;//3698/100=36%10=6
            int thousands =number / 1000 ;//3698 /1000=3

            boolean checkUnits = units != 0 && n % units == 0;
            boolean checkTens = tens != 0 && n % tens == 0;
            boolean checkHundreds = hundreds != 0 && n % hundreds == 0;
            boolean checkThousands = thousands != 0 && n % thousands == 0;

            if (checkUnits && checkTens && checkHundreds && checkThousands ){
                System.out.print(number + " ");
            }

        }
    }
}
