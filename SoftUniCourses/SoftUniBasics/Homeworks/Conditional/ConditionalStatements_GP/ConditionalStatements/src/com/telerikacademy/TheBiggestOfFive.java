package com.telerikacademy;

import java.util.Scanner;

public class TheBiggestOfFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double e = scanner.nextDouble();

        //Pairing
        double max1 = Math.max (a,b);
        double max2 = Math.max (c,d);

        double max = Math.max(max1,max2);

        System.out.println(Math.max(max,e));
    }
}
