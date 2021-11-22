package StartTA2;

import java.util.Scanner;

public class CheckForPlayCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playCards = scanner.nextLine();

        switch (playCards){
            case "2":System.out.print("yes");break;
            case "3":System.out.print("yes");break;
            case "4":System.out.print("yes");break;
            case "5":System.out.print("yes");break;
            case "6":System.out.print("yes");break;
            case "7":System.out.print("yes");break;
            case "8":System.out.print("yes");break;
            case "9":System.out.print("yes");break;
            case "10":System.out.print("yes");break;
            case "J":System.out.print("yes");break;
            case "Q":System.out.print("yes");break;
            case "K":System.out.print("yes");break;
            case "A":System.out.print("yes");break;
            default: System.out.print("no"); break;


        }
    }
}
