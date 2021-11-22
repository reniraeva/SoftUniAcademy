package ExercisesMethods;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        int firstSum = sumTheTwoInt(firstNumber,secondNumber);
        int result = subtractTwoInt(firstSum,thirdNumber);
        System.out.println(result);

    }

    private static int subtractTwoInt(int firstSum, int thirdNumber) {
        return firstSum - thirdNumber;
    }

    private static  int sumTheTwoInt(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;

    }
}
