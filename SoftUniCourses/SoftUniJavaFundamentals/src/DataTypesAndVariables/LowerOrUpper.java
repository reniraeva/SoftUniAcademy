package DataTypesAndVariables;

import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char input = scanner.nextLine().charAt(0);
        int value = input;

//        if (Character.isLowerCase(input)){
//            System.out.println("lower-case");
//
//        }else {
//
//            System.out.println("upper-case");
//        }

        if (value >= 97 && value <= 122) {
            System.out.println("lower-case");

        }else {

            System.out.println("upper-case");
        }

    }
}
