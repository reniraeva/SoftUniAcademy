package firststep;

import java.util.Scanner;

public class YardofGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //входа 1 ред,
        //Цената на един кв.м. е 7.61лв .  фирмата изпълнител предлага 18% отстъпка от крайната цена.

        // изхода 2 реда, крайанта цена в лева , остъпката лв
        //На конзолата се отпечатват два реда:
        //"The final price is: {крайна цена на услугата} lv."
        // "The discount is: {отстъпка} lv."

        double dvor = Double.parseDouble(scanner.nextLine());
        double total = (dvor * 7.61);
        double discount = (total * 0.18);
        double finalPrice = total - discount;

      System.out.printf("The final price is: %.2f lv.", finalPrice);
        System.out.println();
      System.out.printf("The discount is: %.2f lv.", discount);

    }
}
