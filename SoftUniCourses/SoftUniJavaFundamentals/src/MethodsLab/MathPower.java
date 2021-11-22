package MethodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numberOne =Double.parseDouble(scanner.nextLine());
        double numberTwo =Double.parseDouble(scanner.nextLine());

        double pow = result(numberOne,numberTwo);

        System.out.println(new DecimalFormat("#.####").format(pow));

   }

   private static double result(double numberOne, double numberTwo) {
        return  Math.pow(numberOne, numberTwo) ;
    }

}
