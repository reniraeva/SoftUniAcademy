package testTT1;

import java.util.Scanner;

public class testTT2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double numberM = Double.parseDouble(scanner.nextLine());
        double oneMile = 1.6;
        double oneGalon = 4.54;
        double result =(100 * oneGalon) / (oneMile * numberM);

        System.out.printf("%.0f litres per 100 km",Math.floor(result));
    }
}
