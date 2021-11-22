package ExercisesMethods;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("END")){
                break;
            }
            itIsPalindrom(input);

        }
     }

    private static void itIsPalindrom(String input) {

        StringBuilder reverse = new StringBuilder(input).reverse();


        if (reverse.toString().equals(input)){

            System.out.println("true");
       } else {
            System.out.println("false");
        }


    }
}
