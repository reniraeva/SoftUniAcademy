package ArraysExercise;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String [] firstArray = new String[n];
        String [] secondArray = new String[n];

        // 1 5
        for (int i = 0; i < n; i++) {
            String[] row = scanner.nextLine().split(" ");

            if (i % 2 == 0){
                firstArray[i] = row[0];
                secondArray[i] = row[1];

            }else {
                firstArray[i] = row[1];
                secondArray[i] = row[0];

            }

        }
        System.out.println(String.join(" ", firstArray));
        System.out.println(String.join(" ", secondArray));


    }
}
