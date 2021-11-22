package ArraysLab;

import java.util.Scanner;

public class NumbersInReverseOrder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

         int n = scanner.nextInt();
         int [] numbers = new int[n];
          // 10 20 30
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();


        }
        for (int i = numbers.length-1; i >= 0 ; i--) {
            System.out.print(numbers[i] + " ");
        }

    }
}
