package StartTA2;

import java.util.Scanner;

public class DigitAsWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String digit = scanner.nextLine();
        switch (digit){
            case "0":System.out.print("zero");break;
            case "1":System.out.print("one");break;
            case "2":System.out.print("two");break;
            case "3":System.out.print("three");break;
            case "4":System.out.print("four");break;
            case "5":System.out.print("five");break;
            case "6":System.out.print("six");break;
            case "7":System.out.print("seven");break;
            case "8":System.out.print("eight");break;
            case "9":System.out.print("nine");break;
            default: System.out.print("not a digit"); break;

        }

    }
}
