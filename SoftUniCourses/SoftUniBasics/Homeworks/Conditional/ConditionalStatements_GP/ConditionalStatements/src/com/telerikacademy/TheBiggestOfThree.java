package com.telerikacademy;

import java.util.Scanner;

public class TheBiggestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        //(1)System.out.println(Math.max(Math.max(a,b),c));

        //(2)Solution with If statements

        if ( a >= b && a >= c){
            System.out.println(a);
        } else if ( b>= a && b>= c){
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}
