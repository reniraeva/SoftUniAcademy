package DataTypesAndVariables;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        int numInt = Integer.parseInt(num);
        int sum = 0;

        for (int i = 1; i <= numInt ; i++) {
            int current = i;
            String currentString = String.valueOf(current);

            int number = current;

            for (int j = 0; j <= currentString.length(); j++) {

                sum = sum + (number % 10);
                number = number/10;
            }

            if (sum == 5 || sum == 7 || sum == 11) {
                System.out.printf("%d -> True", current);
            } else {
                System.out.printf("%d -> False", current);
            }

            System.out.println();

            sum = 0;
        }

    }
}
