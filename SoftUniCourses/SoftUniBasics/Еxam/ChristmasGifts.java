package Еxam;

import java.util.Scanner;

public class ChristmasGifts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = "";
        int adults = 0;
        int kids = 0;
        int toys = 5;
        int sweaters = 15;

        while (true){
           command = scanner.nextLine();
           if (command.equals("Christmas")){
               break;
           }
           int age = Integer.parseInt(command);
           if (age <= 16){
               kids++;
           }else {
               adults++;
           }

        }
        System.out.printf("Number of adults: %d%n",adults);
        System.out.printf("Number of kids: %d%n",kids);
        System.out.printf("Money for toys: %d%n",(kids * toys));
        System.out.printf("Money for sweaters: %d",(adults * sweaters));

    }
}
