package ArraysLab;

import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbersAsString = scanner.nextLine().split(" ");

        int [] numbers = new int[numbersAsString.length];

        for (int i = 0; i < numbersAsString.length; i++) {
            numbers[i] = Integer.parseInt(numbersAsString[i]);

        }
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 == 0){
                sum= sum +number;
            }

        }
        System.out.println(sum);


    }
}
