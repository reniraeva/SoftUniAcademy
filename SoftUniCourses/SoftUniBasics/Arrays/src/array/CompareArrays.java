package array;

import java.util.Scanner;

public class CompareArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int[] arrayA = new int[n];
        int[] arrayB = new int[n];
        boolean isEqual= false;

        for (int i = 0; i < n; i++) {
            int numberA = Integer.parseInt(scanner.nextLine());
            arrayA[i]=numberA;
        }
        for (int j = 0; j < n; j++) {
            int numberB = Integer.parseInt(scanner.nextLine());
            arrayB[j]=numberB;
        }

        for (int i =0; i < arrayA.length; i++) {

            if (arrayA[i] != arrayB[i]){
                isEqual = false;
                break;
            } else {
                isEqual = true;
            }

        }

        System.out.println(isEqual? "Equal":"Not equal");
    }
}
