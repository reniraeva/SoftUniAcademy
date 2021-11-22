package com.company;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int score = scanner.nextInt();
        int result = 0;

        if (score >= 1 && score <= 3) {
            result = score * 10;
            System.out.println(result);
        } else if (score >= 4 && score <= 6) {
            result = score * 100;
            System.out.println(result);
        } else if (score >= 7 && score <= 9) {
            result = score * 1000;
            System.out.println(result);
        } else if (score <= 0 || score > 9) {
            System.out.println("invalid score.");
        }
    }
}
