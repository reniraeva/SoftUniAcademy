package ExercisesMethods;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase();

        vowelsCount(input);


    }

    private static void vowelsCount(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char letar = input.charAt(i);

            switch (letar) {
                case 'a':
                case 'o':
                case 'u':
                case 'e':
                case 'i':
                    count++;
                    break;
            }


        }

        System.out.println(count);

    }
}
