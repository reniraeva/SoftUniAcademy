package ArraysExercise;

import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split(" ");
        int [] numbers = new int[input.length];


        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = Integer.parseInt(input[i]);

        }
        boolean isEqual = false;
        int index = 0;

        for (int i = 0; i < numbers.length; i++) {
            int leftSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum = leftSum + numbers[j];

            }
              int righSum = 0;
            for (int j = i+1; j < numbers.length; j++) {
                righSum = righSum + numbers[j];

            }
            if ( leftSum == righSum){
                isEqual = true;
                index = i;
                break;

            }

        }
        if (isEqual){
            System.out.println(index);
        }else {
            System.out.println("no");
        }
    }
}
