import java.util.Scanner;

public class OddAndEvenProduct {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String [] text = scanner.nextLine().split(" ");
      int [] numbers = new int[text.length];
      for (int i = 0; i < numbers.length; i++) {
         numbers[i] = Integer.parseInt(text[i]);
      }
      int odd_product =1;
      int even_product =1;
      for (int i = 0; i < numbers.length; i+=2) {
         odd_product *=numbers[i];
         if (i== numbers.length-1){
            continue;}
         even_product *=numbers[i+1];
      }
      if (odd_product == even_product){
         System.out.println("yes");
      }
      else System.out.println("no");
   }
}

