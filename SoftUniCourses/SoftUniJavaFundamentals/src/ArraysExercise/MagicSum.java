package ArraysExercise;

import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // read
        String [] input = scanner.nextLine().split(" ");
        int [] numbers = new int[input.length];

        int givenNumber = Integer.parseInt(scanner.nextLine());

        fiilIntArray(input, numbers);

        // logic

        for (int j = 0; j < numbers.length; j++) {
            int magicSum = 0;

            for (int k = j + 1; k < numbers.length; k++) {
                magicSum = numbers[j] + numbers[k];

                if (magicSum == givenNumber){
                    System.out.printf("%d %d%n", numbers[j],numbers[k]);
                }

            }


        }
        

    }

    private static void fiilIntArray(String[] input, int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

    }
}
