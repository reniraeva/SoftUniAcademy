package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());
        int fortthdNumber = Integer.parseInt(scanner.nextLine());
        int integerOperations = (((firstNumber + secondNumber)/thirdNumber)*fortthdNumber);

        System.out.println(integerOperations);

    }
}
