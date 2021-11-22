import java.util.Scanner;

public class CalculateFactorialNFactorialK {
   public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);
      double n = Double.parseDouble(scanner.nextLine());
      double k = Double.parseDouble(scanner.nextLine());
      double nFactorial=1;
      double kFactorial =1;
      double  result;
      int j=1;
      for (int i = 1; i <=n ; i++) {
         nFactorial *=i;
         if (i<=k) {
            kFactorial *= i;
         }
      }
      result = nFactorial / kFactorial;
      System.out.printf("%.0f",result);
   }
}

