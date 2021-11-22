package com.telerikacademy;

import java.util.Scanner;

public class ExchangeIfGreater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        if (a > b){
            System.out.printf("%.1f %.1f",b,a);
        } else{
            System.out.printf("%.1f %.1f",a,b);
        }
    }
}
