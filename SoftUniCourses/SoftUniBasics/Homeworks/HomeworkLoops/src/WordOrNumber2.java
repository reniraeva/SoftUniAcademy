import java.util.ArrayList;
import java.util.Scanner;

public class WordOrNumber2 {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int n = Integer.parseInt(scanner.nextLine());
      String[] text = new String[n];
      int sum = 0;
      ArrayList<String> alWords = new ArrayList<>(n);
      for (int i = 0; i < n; i++) {
         text[i] = scanner.nextLine();
      }
      for (int i = 0; i < n; i++) {
         if (Character.isDigit(text[i].charAt(0)))
         {
            sum += Integer.parseInt(text[i]);
         } else {
            alWords.add(text[i]);
         }
      }
      if (alWords.isEmpty()) {
         System.out.println("no words");
      } else {
         System.out.println(String.join("-", alWords));
      }
      System.out.println(sum);
   }
}