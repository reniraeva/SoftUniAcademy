package MethodsLab;

import java.util.Scanner;

public class PrintSignTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        printSing(n);

    }
    public static void printSing(int number){
        String side = "zero";
        if (number > 0){
           side= "positive";
        }else if (number < 0){
          side = "negative";
        }
        System.out.printf("The number %d is %s.",number,side);
    }
}
