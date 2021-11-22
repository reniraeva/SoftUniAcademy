package ExercisesMethods;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

       int firstSmall= firstSmallstNumber(firstNumber,secondNumber);
       int nextSmal = nextSmallsNumber(firstSmall,thirdNumber);

        System.out.println(nextSmal);
    }
    private static int nextSmallsNumber(int firstSmall, int thirdNumber) {
        return Math.min(firstSmall, thirdNumber);
    }
    private static int firstSmallstNumber(int firstNumber, int secondNumber) {
        return Math.min(firstNumber, secondNumber);
    }
}
