package MethodsLab;

import java.util.Scanner;

public class PrintSign {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     int n = Integer.parseInt(scanner.nextLine());
     printSing(n);

    }
    public static void printSing(int number){
        if (number > 0){
            System.out.printf("The number %d is positive.", number);
        }else if (number == 0){
            System.out.printf("The number %d is zero.",number);
        }else {
            System.out.printf("The number %d is negative.",number);
        }
    }
}
