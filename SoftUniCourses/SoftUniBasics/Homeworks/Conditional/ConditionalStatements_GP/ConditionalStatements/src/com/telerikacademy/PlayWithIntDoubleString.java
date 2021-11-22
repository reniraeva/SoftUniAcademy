package com.telerikacademy;

import java.util.Scanner;

public class PlayWithIntDoubleString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please choose a type:");
        System.out.println("1 --> int");
        System.out.println("2 --> double");
        System.out.println("3 --> string");


        int type = scanner.nextInt();

        switch (type){
            case 1:
                System.out.println("Please enter a digit:");
                int a = scanner.nextInt();
                System.out.println(a + 1);
                break;
            case 2:
                System.out.println("Please enter a real number:");
                double b = scanner.nextDouble();
                System.out.println(b+1);
                break;
            case 3:
                System.out.println("Please enter a string:");
                String c = scanner.next();
                System.out.println(c + "*");
                break;
        }
    }
}
