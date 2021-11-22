package MethodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int srcondNumber = Integer.parseInt(scanner.nextLine());
        double result = calculates(operator, firstNumber,srcondNumber);

        System.out.println(new DecimalFormat("#.##").format(result));

    }

    private static double calculates(String operator,int firstNumber, int secondNumber) {
        double result = 0.0;
        switch (operator){
            case "/":
                result = firstNumber / secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;

        }

        return result;
    }
}
