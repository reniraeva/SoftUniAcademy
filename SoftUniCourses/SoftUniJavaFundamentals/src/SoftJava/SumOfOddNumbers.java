package SoftJava;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oddCout = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i < oddCout * 2; i+= 2) {
            System.out.println(i);
            sum+=oddCout;

        }
        System.out.printf("Sum: " + sum);


    }
}
