package NestedLoopsExercise;

import java.util.Scanner;

public class equalSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fNumber = Integer.parseInt(scanner.nextLine());
        int sNumber = Integer.parseInt(scanner.nextLine());

        for (int i = fNumber; i <= sNumber ; i++) {
            String number = "" + i;
            int evenSum = 0;
            int oddSum = 0;

            for (int j = 0; j < number.length(); j++) {
                if (j % 2 == 0){
                    evenSum += Integer.parseInt(number.charAt(j) + "");
                } else {
                    oddSum += Integer.parseInt(number.charAt(j) + "");
                }
            }
            if (evenSum == oddSum){
                System.out.print(number + " ");
            }
        }
    }
}
