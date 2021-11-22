package com.telerikacademy;

import java.util.Scanner;

public class PlayWithIntDoubleAndString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please choose a type:");
        System.out.println("1 --> int ");
        System.out.println("2 --> double");
        System.out.println("3 --> string");

        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Please enter an integer:");
            int integer = scanner.nextInt();
            System.out.println(integer + 1);
        } else if (choice == 2) {
            System.out.println("Please enter a double:");
            double dbl = scanner.nextDouble();
            System.out.println(dbl + 1);
        } else if (choice == 3) {
            System.out.println("Please enter a string:");
            String string = scanner.next();
            System.out.println(string + "*");
        }
    }
}

