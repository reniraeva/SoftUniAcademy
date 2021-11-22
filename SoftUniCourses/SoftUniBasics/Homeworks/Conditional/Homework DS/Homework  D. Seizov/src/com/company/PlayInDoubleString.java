package com.company;

import java.util.Scanner;

public class PlayInDoubleString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose a type:");
        System.out.println("1 --> int\n2 --> double\n3 --> string");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Please enter an integer: ");
                int input1 = scanner.nextInt();
                System.out.println(input1);
                break;
            case 2:
                System.out.print("Please enter a double: ");
                double input2 = scanner.nextDouble();
                System.out.println(input2);
                break;
            case 3:
                System.out.print("Please enter a string: ");
                String input3 = scanner.nextLine();
                System.out.println(input3);
                break;
        }
    }
}
