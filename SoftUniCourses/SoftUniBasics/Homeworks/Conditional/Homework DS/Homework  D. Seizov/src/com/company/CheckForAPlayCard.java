package com.company;

import java.util.Scanner;

public class CheckForAPlayCard {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String card = scanner.nextLine();

        switch (card){
            case "K":
            case "Q":
            case "J":
            case "A":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case "10":
                System.out.println("Yes.");
                break;
                default:
                    System.out.println("No.");
                    break;
        }


    }
}
