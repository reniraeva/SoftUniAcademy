package ExercisesMethods;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        System.out.println(findMiddleCharacters(input));
    }

    private static String findMiddleCharacters(String input) {
        String result = "";
        // aString r 3245 24
         if (input.length() % 2 == 0 ){
             int begin = (input.length()/2)-1;
             int end = input.length()/2+1;
             result = input.substring(begin,end);
         }else {
            result = String.valueOf(input.charAt(input.length()/2));
         }

        return result;
    }

}
