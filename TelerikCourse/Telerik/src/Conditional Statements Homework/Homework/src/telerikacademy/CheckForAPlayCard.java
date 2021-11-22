package telerikacademy;

import java.util.Scanner;

public class CheckForAPlayCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cardFace = sc.nextLine();

        if(cardFace.equals("3")||cardFace.equals("2")||cardFace.equals("4")||cardFace.equals("5")||
        cardFace.equals("6")||cardFace.equals("7")||cardFace.equals("8")||cardFace.equals("9")||
        cardFace.equals("10")||cardFace.equals("J")||cardFace.equals("Q")||cardFace.equals("K")|| cardFace.equals("A")){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
