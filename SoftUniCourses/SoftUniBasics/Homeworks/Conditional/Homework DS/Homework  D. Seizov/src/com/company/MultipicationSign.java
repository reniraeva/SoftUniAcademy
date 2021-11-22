package com.company;

import java.util.Scanner;

public class MultipicationSign {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());

        if (a > 0 && b > 0 && c > 0) {
            System.out.println("+");
        } else if (a < 0 && b < 0 && c < 0) {
            System.out.println("-");
        } else if (a < 0 && b < 0 && c > 0) {
            System.out.println("+");
        } else if (a < 0 && b > 0 && c > 0) {
            System.out.println("-");
        } else if (a == 0 || b == 0 || c == 0) {
            System.out.println("0");
        } else if (a > 0 && b < 0 && c > 0) {
            System.out.println("-");
        } else if (a > 0 && b > 0 && c < 0) {
            System.out.println("-");
        } else if (a < 0 && b > 0 && c < 0) {
            System.out.println("-");
        } else if (a > 0 && b < 0 && c < 0) {
            System.out.println("+");
        }
    }
}
