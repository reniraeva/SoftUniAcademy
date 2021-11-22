package telerikacademy;
//Write a program that asks for a digit (0-9), and depending on the input, shows the digit as a word (in English).
// * Print “not a digit” in case of invalid input. * Use a switch statement.

import java.util.Scanner;

public class DigitAsWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String digit = sc.nextLine();

        switch (digit){
            case "0":
                digit = "zero";
                System.out.println(digit);
                break;
            case "1":
                digit = "one";
                System.out.println(digit);
                break;
            case "2":
                digit = "two";
                System.out.println(digit);
                break;
            case "3":
                digit = "three";
                System.out.println(digit);
                break;
            case "4":
                digit = "four";
                System.out.println(digit);
                break;
            case "5":
                digit = "five";
                System.out.println(digit);
                break;
            case "6":
                digit = "six";
                System.out.println(digit);
                break;
            case "7":
                digit = "seven";
                System.out.println(digit);
                break;
            case "8":
                digit = "eight";
                System.out.println(digit);
                break;
            case "9":
                digit = "nine";
                System.out.println(digit);
                break;
            default:
                digit = "not a digit";
                System.out.println(digit);

        }
    }
}
