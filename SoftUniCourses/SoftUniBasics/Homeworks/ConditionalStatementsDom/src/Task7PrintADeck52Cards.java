import java.util.Scanner;

public class Task7PrintADeck52Cards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a card: ");
        String card = scanner.nextLine();
        int cardIndex = 0;
        if (card.length() == 2 || Character.isDigit(card.charAt(0))) {
            cardIndex = Integer.parseInt(card);
        } else {
            switch (card) {
                case "J":
                    cardIndex = 11;
                    break;
                case "Q":
                    cardIndex = 12;
                    break;
                case "K":
                    cardIndex = 13;
                    break;
                default:
                    cardIndex = 14;
                    break;
            }
        }
        for (int i = 2; i <= cardIndex; i++) {
            String cardSymbol = "";
            if (i > 10) {
                switch (i) {
                    case 11:
                        cardSymbol = "J";
                        break;
                    case 12:
                        cardSymbol = "Q";
                        break;
                    case 13:
                        cardSymbol = "K";
                        break;
                    default:
                        cardSymbol = "A";
                        break;
                }
            } else {
                cardSymbol = Integer.toString(i);
            }
            System.out.printf("%s of spades, %s of clubs, %s of hearts, %s of diamonds%n", cardSymbol, cardSymbol, cardSymbol, cardSymbol);
        }
    }
}
