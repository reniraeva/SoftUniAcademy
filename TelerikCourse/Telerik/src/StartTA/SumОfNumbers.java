package StartTA;

import java.util.Scanner;

public class SumОfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //first decision::
        // int numberOne = Integer.parseInt(scanner.nextLine());
        // int numberTwo = Integer.parseInt(scanner.nextLine());
        // int numberThree = Integer.parseInt(scanner.nextLine());
        // int numberFour =Integer.parseInt(scanner.nextLine());
        // int numberFive = Integer.parseInt(scanner.nextLine());
        // int sum = numberOne+numberTwo+numberThree+numberFour+numberFive;
        // System.out.printf("%d", sum);

        //second solution
         int sum = 0;
         for (int i = 0; i < 5; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum = sum + number;//sum += number
        }
        System.out.printf("%d", sum);
    }
}
