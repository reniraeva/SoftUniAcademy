import java.util.Scanner;

public class CalculateFactorial {
   public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String number = scanner.nextLine();
         int outerNumber = Integer.parseInt(number);
         String number2 = scanner.nextLine();
         double secondNumber = Double.parseDouble(number2);
         double factorialInnerNumber = 1;
         double finalSum = 1;
         for (int i = 1; i <= outerNumber; i++) {
            factorialInnerNumber *= i;
            double num = factorialInnerNumber/Math.pow(secondNumber,i);
            finalSum += num;

         }
         System.out.printf("%.5f",finalSum);
      }
   }

