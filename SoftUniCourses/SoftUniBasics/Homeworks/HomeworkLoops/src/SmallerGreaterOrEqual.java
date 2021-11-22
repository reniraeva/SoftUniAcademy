import java.util.Scanner;

public class SmallerGreaterOrEqual {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int n = Integer.parseInt(scanner.nextLine());
      int[] numbers = new int[n];

      for (int i = 0; i < n; i++) {
         numbers[i] = Integer.parseInt(scanner.nextLine());
      }

      for (int i = 0; i < n ; i++) {
         System.out.print(numbers[i]);
         if (i == n - 1) continue;
         String sign = "";

         if (numbers[i] > numbers[i +1]) {
            sign = " >";
         }
         else if (numbers[i] < numbers[i + 1]) {
             sign = " < ";

            } else {
            sign = " = ";
         }
         System.out.print(sign);
            }
         }
   }








