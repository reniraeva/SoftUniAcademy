public class PrintADeckOf52Cards {
   public static void main(String[] args) {

            for (int i = 2; i <= 14; i++) {
               switch (i) {
                  case 2:
                  case 3:
                  case 4:
                  case 5:
                  case 6:
                  case 7:
                  case 8:
                  case 9:
                  case 10:
                     System.out.printf("%d of spades, ", i);
                     System.out.printf("%d of clubs, ", i);
                     System.out.printf("%d of hearts, ", i);
                     System.out.printf("%d of diamonds\n", i);
                     break;
                  case 11:
                     System.out.print("J of spades, ");
                     System.out.print("J of clubs, ");
                     System.out.print("J of hearts, ");
                     System.out.print("J of diamonds\n");
                     break;
                  case 12:
                     System.out.print("Q of spades, ");
                     System.out.print("Q of clubs, ");
                     System.out.print("Q of hearts, ");
                     System.out.print("Q of diamonds\n");
                     break;
                  case 13:
                     System.out.print("K of spades, ");
                     System.out.print("K of clubs, ");
                     System.out.print("K of hearts, ");
                     System.out.print("K of diamonds\n");
                     break;
                  case 14:
                     System.out.print("A of spades, ");
                     System.out.print("A of clubs, ");
                     System.out.print("A of hearts, ");
                     System.out.print("A of diamonds\n");
                     break;
               }
            }
         }
      }

