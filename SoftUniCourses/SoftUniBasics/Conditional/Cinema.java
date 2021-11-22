package Conditional;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String progectsiya = scanner.nextLine();
        int redove = Integer.parseInt(scanner.nextLine());
        int coloni = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;
         switch (progectsiya){

             case "Premiere":
                 totalPrice = redove * coloni * 12.00;
                 break;
             case "Normal":
                 totalPrice = redove * coloni * 7.50;
                 break;
             case "Discount":
                 totalPrice = redove * coloni * 5.00;
               break;
         }
         System.out.printf("%.2f leva", totalPrice);

    }
}
