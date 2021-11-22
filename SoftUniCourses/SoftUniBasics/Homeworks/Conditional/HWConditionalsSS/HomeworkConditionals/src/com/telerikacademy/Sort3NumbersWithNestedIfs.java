package com.telerikacademy;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Sort3NumbersWithNestedIfs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        DecimalFormat formatter = new DecimalFormat("#.##");

        if (a >= b) {
            if (a >= c) {
                if (b >= c) {
                    System.out.println(formatter.format(a) + " " + formatter.format(b) + " " + formatter.format(c));
                } else {
                    System.out.println(formatter.format(a) + " " + formatter.format(c) + " " + formatter.format(b));
                }
            }
        }
        if (b >= a) {
            if (b >= c) {
                if (a >= c) {
                    System.out.println(formatter.format(b) + " " + formatter.format(a) + " " + formatter.format(c));
                } else {
                    System.out.println(formatter.format(b) + " " + formatter.format(c) + " " + formatter.format(a));
                }
            }
        }
        if (c >= a) {
            if (c >= b) {
                if (a >= b) {
                    System.out.println(formatter.format(c) + " " + formatter.format(a) + " " + formatter.format(b));
                } else {
                    System.out.println(formatter.format(c) + " " + formatter.format(b) + " " + formatter.format(a));
                }
            }
        }
    }
}
