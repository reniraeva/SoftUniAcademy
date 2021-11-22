import java.util.Scanner;

public class MinMaxSumAndAverageOfNNumbers {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      double average =0.00;
      double temp=0.00;
      int total=0;
      double sum =0.00;
      double min = Double.MAX_VALUE;
      double max = Double.MIN_VALUE;
      for (int i =1; i <= n; i++) {
         temp = scanner.nextDouble();
         if (temp > max) {
            max = temp;
         }
         if (temp < min) {
            min = temp;
         }

         sum += temp;
         total++;
      }
      average = sum / total;
      System.out.printf("min= %.0f%nmax= %.0f%nsum= %.0f%navg= %.2f%n",min,
         max,sum,average);
   }
}



