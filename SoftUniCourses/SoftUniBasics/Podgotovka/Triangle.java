package Podgotovka;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         double side= Double.parseDouble(scanner.nextLine());
         double  height = Double.parseDouble(scanner.nextLine());
         double result = (side * height) / 2 ;
        System.out.printf("Triangle area = %.2f", result);
    }
}
