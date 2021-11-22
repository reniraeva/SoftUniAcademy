package firststep;

import java.util.Scanner;

public class CharityofCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Да се отпечата на конзолата едно число парите, които са събрани.
        //Резултатът да се форматира до вторта цифра след десетичната запетая.

        int day = Integer.parseInt(scanner.nextLine());
        int cooks = Integer.parseInt(scanner.nextLine());
        int cakes = Integer.parseInt(scanner.nextLine());
        int waffles = Integer.parseInt(scanner.nextLine());
        int pancakes = Integer.parseInt(scanner.nextLine());

        // 1/8 от крайната сума ще бъде използвана за покриване на разходите за продуктите по време на кампанията
        // Да се напише програма, която изчислява сумата, която е събрана в края на кампанията.

        double cakesPrice = cakes * 45.0;
        double wafflesPrice = waffles * 5.80;
        double pancakesPrice = pancakes * 3.20;
        double suma = (cakesPrice+wafflesPrice+pancakesPrice) * cooks;

        double sumaTotal = suma * day;
        double sumaR =sumaTotal -sumaTotal* 1/8;

        System.out.printf("%.2f",sumaR);




    }


}
