package testTT1;

import java.util.Scanner;

public class repaint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // програма, която изчислява разходите за ремонт

        int amountOfNylon = Integer.parseInt(scanner.nextLine());
        int amountofPaint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
      //Предпазен найлон - 1.50 лв. за кв.м.,Боя - 14.50 лв. за литър,Разредител за боя - 5.00 лв. за литър
         double nylon = 1.50;
         double paint = 14.50;
         double thinnerPaint = 5.00;
         double sumOfMaterial = ((amountOfNylon + 2) * nylon) +  ((amountofPaint + (amountofPaint * 0.10)) * paint) + (thinner *thinnerPaint) +0.40;
         double salaryOfmasters = hours * (sumOfMaterial * 0.30);
         double sumAllcosts = sumOfMaterial + salaryOfmasters ;

        System.out.printf("Total expenses: %.2f lv.", sumAllcosts);
    }
}
