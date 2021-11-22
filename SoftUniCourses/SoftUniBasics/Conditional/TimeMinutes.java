package Conditional;

import java.util.Scanner;

public class TimeMinutes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
         int hour = Integer.parseInt(scanner.nextLine());
         int minute = Integer.parseInt(scanner.nextLine());

         if (minute < 45) {
             minute = minute + 15;

         } else {
             if (hour == 23){
                 hour = 0;
             } else {
                 hour += 1;
             }

             minute = (minute + 15) % 60;
         }


        if (minute < 10) {
             System.out.printf("%d:0%d", hour, minute);
         } else {
             System.out.printf("%d:%d", hour, minute);
         }

    }
}
