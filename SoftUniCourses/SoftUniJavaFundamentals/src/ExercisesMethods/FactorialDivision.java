package ExercisesMethods;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long firstNumber = Integer.parseInt(scanner.nextLine());
        long secondNumber= Integer.parseInt(scanner.nextLine());
        //n * factorial(n - 1)); 5!= 5*4*3*2*1

        double rezult = factorial(firstNumber) / factorial(secondNumber);
        System.out.printf("%.2f",rezult);
    }
      public static double factorial(double n){
        if (n == 0){
            return 1;

        }else {
          return (n * factorial(n - 1));
        }

    }
}
// 6= 6*5*4*3*2*1 -30-120-360
//2=2*1