package com.telerikacademy;

import java.util.Scanner;

public class CheckForAPlayCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();

        if ( a.equals("2")|| a.equals("3")|| a.equals("4")|| a.equals("5")|| a.equals("6")||
                a.equals("7")|| a.equals("8")|| a.equals("9")|| a.equals("10")||
                a.equals("J")|| a.equals("Q")|| a.equals("K")|| a.equals("A")) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
