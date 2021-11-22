package MethodsLab;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        String repeatedString = printNewString(input, n);

        System.out.println(repeatedString);
        
    }

    private static String printNewString(String input, int n) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            result.append(input);
        }

        return result.toString();
    }
}
