package ExercisesMethods;

import java.util.Scanner;

public class TopNumber {
    static boolean isOddDigit = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

         for (int i = 1; i <= n ; i++) {
             findTopNumbers(i);

        }
    }

    private static void findTopNumbers(int i) {
        // 50 - 17 35
        int sum = sumDigits(i);

        if (sum % 8 == 0 && isOddDigit){
            System.out.println(i);
        }

    }

    private static int sumDigits(int i) {
        isOddDigit = false;
        int sum = 0;
        while (true){
            int digit =  i % 10;
            if (isOddDigit == false) {
                isOddDigit = digit % 2 != 0;
            }

            sum += digit;
            i = i/10;
            if (i == 0){
                break;
            }
        }

        return sum;
    }
}
