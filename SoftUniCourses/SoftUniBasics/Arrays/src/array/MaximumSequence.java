package array;

import java.util.Scanner;

public class MaximumSequence {

    //  2 1 1 2 3 3 2 2 2 1
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");
        int[]input = new int[numbers.length];
        int counter = 1;
        int finalCounter = 0;

        for (int i = 0; i < input.length; i++) {
            input[i] = Integer.parseInt(numbers[i]);
        }

        for (int j = 0; j < input.length; j++) {
            int curant = input[j];

            for (int k = j+1; k < input.length; k++) {
                int next = input[k];

                if (curant == next){
                    counter++;
                } else {
                    finalCounter = Math.max(counter,finalCounter);
                    counter = 1;
                    break;
                }

            }

        }

        System.out.println(finalCounter);
    }
}
