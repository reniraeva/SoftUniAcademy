package array;

import java.util.Scanner;

public class ArraySorted {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");

        boolean isSorted = true;

        for (int i = 0; i < numbers.length-1; i++) {
        //1 2 4 8 12 34 200 2000  7 8 9 10 11 12 11 13 9
            int number = Integer.parseInt(numbers[i]);
            int next = Integer.parseInt(numbers[i+1]);

            if (number > next) {
                System.out.print("No");
                isSorted = false;
                break;
            }

        }

        if (isSorted){
            System.out.print("Yes");
        }



    }
}
