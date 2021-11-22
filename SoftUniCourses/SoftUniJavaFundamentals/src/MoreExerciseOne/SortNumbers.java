package MoreExerciseOne;

import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;
        int threeNumber = 0;

        for (int i = 0; i < 3; i++) {
            int current = Integer.parseInt(scanner.nextLine());
            maxNumber = Math.max(current, maxNumber);
            minNumber = Math.min(current, minNumber);
            if (current < maxNumber || current> minNumber) {
                threeNumber = Math.min(current, maxNumber);


            }

        }


            System.out.println(maxNumber);
            System.out.println(threeNumber);
            System.out.println(minNumber);

    }
}