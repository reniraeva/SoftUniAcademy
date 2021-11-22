package com.telerikacademy;

import java.util.Scanner;

public class NumberAsWords {
    public static void main(String[] args) {
        int numones;
        int numtens;
        int numhundreds;
        int twenties;
        String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"};
        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        Scanner In = new Scanner(System.in);
        System.out.print("Number: ");
        int number = In.nextInt();
        while (number != -1) {
            if (number >= 100 && number <= 999) {
                numhundreds = number / 100;
                numtens = number / 10 % 10;
                numones = number % 10;
                twenties = number % 100;
                System.out.println("Nbr" + number + " " + numtens);
                if (number == 100 || number == 200 || number == 300 || number == 400 || number == 500
                        || number == 600 || number == 700 || number == 800 || number == 900) {
                    System.out.println("" + ones[numhundreds] + " " + "hundred");
                    System.out.print("Number: ");
                    number = In.nextInt();
                } else if (number % 100 < 20 && numtens == 1) {
                    System.out.println("" + ones[numhundreds] + " " + "hundred and " + ones[twenties]);
                    System.out.print("Number: ");
                    number = In.nextInt();
                } else {
                    System.out.println("" + ones[numhundreds] + " " + "hundred and " + tens[numtens] + " " + ones[numones]);
                    System.out.print("Number: ");
                    number = In.nextInt();
                }
            } else {
                twenties = number % 100;
                System.out.println("" + ones[twenties]);
                System.out.print("Number: ");
                number = In.nextInt();
            }

        }
    }
}