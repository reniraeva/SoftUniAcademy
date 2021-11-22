package com.telerikacademy;

import java.util.Scanner;

public class MultiplicationSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double prod = a * b * c;


        if ( prod < 0) {
            System.out.println("-");
        } else if (prod == 0){
            System.out.println("0");
        } else {
            System.out.println("+");
        }
    }
}
