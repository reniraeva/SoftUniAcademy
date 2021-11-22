package com.company;

import java.util.Scanner;

public class SortTreeNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if ((a >= b && a >= c) && b >= c) {
            System.out.printf("%d %d %d", c, b, a);
        } else if ((a >= b && a >= c) && b <= c) {
            System.out.printf("%d %d %d", c, b, a);
        } else if ((b >= a && b >= c) && a >= c) {
            System.out.printf("%d %d %d", c, b, a);
        } else if ((b >= a && b >= c) && a <= c) {
            System.out.printf("%d %d %d", c, b, a);
        } else if ((c >= b && c >= a) && a >= b) {
            System.out.printf("%d %d %d", c, b, a);
        } else if ((c >= b && c >= a) && a <= b) {
            System.out.printf("%d %d %d", c, b, a);
        }
    }
}
