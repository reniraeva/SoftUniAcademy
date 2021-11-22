package StartTA3;

public class DeckOf52Cards {
    public static void main(String[] args) {

        for (int i = 2; i < 15; i++) {
           if (i < 11){
               System.out.printf("%d of spades, %d of clubs, %d of hearts, %d of diamonds%n",i,i,i,i);
           } else {
               String card = "";
               switch (i){
                   case 11: card = "J";break;
                   case 12: card = "Q";break;
                   case 13: card = "K";break;
                   case 14: card = "A";break;
               }
               System.out.printf("%s of spades, %s of clubs, %s of hearts, %s of diamonds%n",card,card,card,card);
           }
        }
    }
}
