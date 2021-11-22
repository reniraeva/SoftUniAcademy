package DataTypesAndVariables;

import java.util.Scanner;

public class CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         char furstOnInput = scanner.nextLine().charAt(0);
         char secondOnInput = scanner.nextLine().charAt(0);
         char thirdOnInput = scanner.nextLine().charAt(0);
        System.out.printf("%c%c%c",furstOnInput,secondOnInput,thirdOnInput);
    }
}
