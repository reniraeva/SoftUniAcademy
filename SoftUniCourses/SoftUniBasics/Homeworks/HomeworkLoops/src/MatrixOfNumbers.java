import java.util.Scanner;

public class MatrixOfNumbers {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int number = scanner.nextInt();
      for (int i = 1; i <= number; i++) {
         for (int j = i; j < number + i; j++) {
            System.out.print(j + " ");
         }
         System.out.println();
      }
   }
}


