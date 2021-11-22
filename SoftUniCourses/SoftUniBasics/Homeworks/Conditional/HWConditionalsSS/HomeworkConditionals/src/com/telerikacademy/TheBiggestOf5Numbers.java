package com.telerikacademy;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TheBiggestOf5Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double e = scanner.nextDouble();

        DecimalFormat formatter = new DecimalFormat("#.##");

        if (a >= b && a >= c && a >= d && a >= e) {
            System.out.println(formatter.format(a));
        } else if (b >= a && b >= c && b >= d && b >= e) {
            System.out.println(formatter.format(b));
        } else if (c >= a && c >= b && c >= d && c >= e) {
            System.out.println(formatter.format(c));
        } else if (d >= a && d >= b && d >= c && d >= e) {
            System.out.println(formatter.format(d));
        } else if (e >= a && e >= b && e >= c && e >= d) {
            System.out.println(formatter.format(e));
        }
    }
}