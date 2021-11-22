package com.company;

import java.util.Scanner;

public class ExchangeIfGreater {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextInt();
        double b = scanner.nextInt();

        if (a > b) {
            System.out.printf("%.2f, %.2f", a, b);
        } else if (b > a) {
            System.out.printf("%.2f,%.2f", b, a);
        }
    }


}
