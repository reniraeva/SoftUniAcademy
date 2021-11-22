package ArraysExercise;

import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split(" ");
        int [] numbers = new int[input.length];


        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = Integer.parseInt(input[i]);

        }
        int bestLeght = 0;
        int digit=0;
        int lengthCurrent = 1;
        for (int i = 0; i < numbers.length - 1; i++) {
           int currentElement = numbers[i];
           int nextElement = numbers[i+1];


           if (currentElement == nextElement){
               lengthCurrent++;

               if (lengthCurrent > bestLeght){
                   bestLeght=lengthCurrent;
                   digit=currentElement;
               }
           }else {
               lengthCurrent = 1;
           }
        }
        for (int i = 0; i < bestLeght; i++) {
            System.out.print(digit + " ");
        }

    }
}

