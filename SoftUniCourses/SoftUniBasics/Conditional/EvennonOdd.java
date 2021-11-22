package Conditional;

import java.util.Scanner;

public class EvennonOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // even 2 , 3 odd
        int number = Integer.parseInt(scanner.nextLine());//10/2

        if (number % 2 == 0){
            System.out.println("even");
        }else {
            System.out.println("odd");
        }

    }
}
