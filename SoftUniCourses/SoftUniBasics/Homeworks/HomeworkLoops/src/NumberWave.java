import java.util.Scanner;

public class NumberWave {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      for (int i = 1; i <=n; i++) {
         System.out.printf("%d ",i);
      }
      for (int i = n-1; i>=1 ; i--) {
         System.out.printf("%d ",i);

      }
   }
}
