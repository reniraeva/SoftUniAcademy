package com.telerikacademy;

import java.util.Scanner;

public class Sort3Nums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if ( a >= b && a >= c){
            System.out.print(a);
            if( b >= c){
                System.out.print(" "+b + " " + c);
            } else {
                System.out.print(" "+c + " " + b);
            }
        } else if ( b>= a && b>= c){
            System.out.print(b);
            if ( a >= c){
                System.out.print(" " + a + " " + c);
            } else {
                System.out.print(" " + c + " " + a);
            }
        } else {
            System.out.print(c);
            if ( b >= a) {
                System.out.print(" " + b + " " + a);
            } else {
                System.out.print(" " + a + " " + b);
            }
        }
    }
}
