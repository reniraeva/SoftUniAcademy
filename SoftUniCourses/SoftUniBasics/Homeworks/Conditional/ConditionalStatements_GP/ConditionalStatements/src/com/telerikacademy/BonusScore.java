package com.telerikacademy;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        if ( a >= 1 && a<= 3){
            a *= 10;
            System.out.println(a);
        } else if ( a >3 && a <=6){
            a *= 100;
            System.out.println(a);

        } else if ( a >6 && a <= 9){
            a *= 1000;
            System.out.println(a);

        } else {
            System.out.println("invalid score");
        }

    }
}
