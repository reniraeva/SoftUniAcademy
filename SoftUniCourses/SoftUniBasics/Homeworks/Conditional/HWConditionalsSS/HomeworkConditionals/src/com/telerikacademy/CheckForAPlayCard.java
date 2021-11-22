package com.telerikacademy;

import java.util.Scanner;

public class CheckForAPlayCard {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String character = in.nextLine();

        String one = "1";
        String two = "2";
        String three = "3";
        String four = "4";
        String five = "5";
        String six = "6";
        String seven = "7";
        String eight = "8";
        String nine = "9";
        String ten = "10";
        String J = "J";
        String Q = "Q";
        String K = "K";
        String A = "A";

        String s = "";
        switch (character){
            case "1":
                s.equals(one);
                System.out.println("yes");
                break;
            case "2":
                s.equals(two);
                System.out.println("yes");
                break;
            case "3":
                s.equals(three);
                System.out.println("yes");
                break;
            case "4":
                s.equals(four);
                System.out.println("yes");
                break;
            case "5":
                s.equals(five);
                System.out.println("yes");
                break;
            case "6":
                s.equals(six);
                System.out.println("yes");
                break;
            case "7":
                s.equals(seven);
                System.out.println("yes");
                break;
            case "8":
                s.equals(eight);
                System.out.println("yes");
                break;
            case "9":
                s.equals(nine);
                System.out.println("yes");
                break;
            case "10":
                s.equals(ten);
                System.out.println("yes");
                break;
            case "J":
                s.equals(J);
                System.out.println("yes");
                break;
            case "Q":
                s.equals(Q);
                System.out.println("yes");
                break;
            case "K":
                s.equals(K);
                System.out.println("yes");
                break;
            case "A":
                s.equals(A);
                System.out.println("yes");
                break;
            default:
                System.out.println("no");
        }
    }
}