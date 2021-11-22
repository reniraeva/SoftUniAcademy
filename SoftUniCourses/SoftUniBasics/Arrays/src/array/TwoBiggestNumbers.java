package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TwoBiggestNumbers {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split(" ");
        int[] intArray = new int[numbers.length];
        int maxNumber = Integer.MIN_VALUE;
        int maxNumberTwo = Integer.MIN_VALUE;
        // 8 2 1 3 5 8 9 11 2 5      8 7 8 11 7 11 5 8 10
        for (int i = 0; i < numbers.length; i++) {

            intArray [i] = Integer.parseInt(numbers[i]);
        }

//        for (int j = 0; j < intArray.length; j++) {
//            int cur = intArray[j];
//            maxNumber = Math.max(cur, maxNumber);
//        }
//
//        for (int k = 0; k < intArray.length; k++) {
//            int cur = intArray[k];
//
//            if (cur != maxNumber){
//                maxNumberTwo =Math.max(cur,maxNumberTwo);
//
//            }
//        }

        // with sort
        Arrays.sort(intArray);
        maxNumber = intArray[intArray.length-1];
        maxNumberTwo = intArray[intArray.length-2];

        System.out.printf("%d %d",maxNumber, maxNumberTwo);
    }
}

