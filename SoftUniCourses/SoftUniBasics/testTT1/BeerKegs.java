package testTT1;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // obem π * r^2 * h- π * r*r * h
        //First – model – string.
        //Second –radius – floating-point number
        //Third – height – integer number

         int countKegs = Integer.parseInt(scanner.nextLine());
         double maxVolume = Double.MIN_VALUE;
         String maxKegModel= "";

        for (int keg = 1; keg <=countKegs; keg++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * Math.pow(radius, 2) * height;//Math.pow(radius, 2) e radius * radius
             if (volume>maxVolume){
                 maxVolume = volume;
                 maxKegModel = model;
             }

        }
        System.out.println(maxKegModel);
    }
}
