package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int sum = 0 ;
        for (int i = 0; i < input.length() ; i++) {
            int currentNum =(int) input.charAt(i)-48;
            sum = sum + currentNum;

        }

        System.out.println(sum);
    }
}
