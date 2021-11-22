import java.util.Scanner;

public class WordOrNumber {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String text = scanner.nextLine();
      if(Character.isDigit(text.charAt(0))) {
         double num = Double.parseDouble(text);
         if (num != (int) num) {
            System.out.printf("%.2f", num + 1);
         } else {
            System.out.printf("%d ", (int) num + 1);
         }
      }
      else {
         char [] chararr = text.toCharArray();
         char [] reversed = new char[chararr.length];
         int m=0;
         for (int i = chararr.length-1; i >= 0; i--) {
            reversed[m] = chararr[i];
            m++;
         }
         System.out.println(reversed);
      }
   }
}


